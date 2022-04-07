package fr.eni.ecole.projet.eniEncheres.ihm.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bll.ArticleVendu.ArticleVenduManager;
import fr.eni.ecole.projet.eniEncheres.bll.ArticleVendu.ArticleVenduManagerSing;
import fr.eni.ecole.projet.eniEncheres.bll.utilisateur.UtilisateurManager;
import fr.eni.ecole.projet.eniEncheres.bll.utilisateur.UtilisateurManagerSing;
import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.bo.Categorie;
import fr.eni.ecole.projet.eniEncheres.ihm.models.ArticleVenduModel;
import fr.eni.ecole.projet.eniEncheres.ihm.models.CategorieModel;
import fr.eni.ecole.projet.eniEncheres.ihm.models.UtilisateurModel;


/**
 * Servlet implementation class AccueilUserConnecteServlet
 */
@WebServlet("/AccueilUserConnecteServlet")
public class AccueilUserConnecteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArticleVenduManager articleManager = ArticleVenduManagerSing.getInstance();
	private UtilisateurManager utilisateurManager = UtilisateurManagerSing.getInstance(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilUserConnecteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategorieModel categorieModel = new CategorieModel();
		ArticleVenduModel articleModel = new ArticleVenduModel();
		UtilisateurModel userModel = new UtilisateurModel();
		List<ArticleVendu> lstEncheres = new ArrayList<ArticleVendu>();		
	

		
		if (request.getParameter("BT_RECHERCHER") == null) {
			try {
				lstEncheres = articleManager.selectAll();
				request.setAttribute("lstEncheres", lstEncheres);

				
			} catch (BLLException e) {
				e.printStackTrace();
				e.getMessage();
			}
		} else if (request.getParameter("BT_RECHERCHER") != null) {
			Categorie categorie = new Categorie();
			categorie.setNoCategorie(Integer.parseInt(request.getParameter("Categories")));
			String motCle = request.getParameter("keyword").toLowerCase();
						
			try {
				List<ArticleVendu> lstEncheresParMotCle = new ArrayList<ArticleVendu>();	
				lstEncheresParMotCle = articleManager.selectAll();
				
				for (ArticleVendu articleVendu : lstEncheresParMotCle) {
					if (articleVendu.getNomArticle().toLowerCase().contains(motCle) || articleVendu.getCategorie().getNoCategorie() == categorie.getNoCategorie()) {
						lstEncheres.add(articleVendu);
					}
				}		
				request.setAttribute("lstEncheres", lstEncheres);
				
			} catch (BLLException e) {
				e.printStackTrace();
				e.getMessage();
			}
		} 
		
		List<Object> modelList = new ArrayList<Object>();
		modelList.add(articleModel);
		modelList.add(categorieModel);
		modelList.add(userModel);
		
		request.setAttribute("model", modelList);
		
		request.getRequestDispatcher("/WEB-INF/accueilConnecte.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
