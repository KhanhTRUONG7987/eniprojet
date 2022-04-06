package fr.eni.ecole.projet.eniEncheres.ihm.servlets;

import java.io.IOException;
import java.time.LocalDate;
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
import fr.eni.ecole.projet.eniEncheres.bll.Retrait.RetraitManager;
import fr.eni.ecole.projet.eniEncheres.bll.Retrait.RetraitManagerSing;
import fr.eni.ecole.projet.eniEncheres.bll.utilisateur.UtilisateurManager;
import fr.eni.ecole.projet.eniEncheres.bll.utilisateur.UtilisateurManagerSing;
import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.bo.Retrait;
import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;
import fr.eni.ecole.projet.eniEncheres.ihm.models.ArticleVenduModel;
import fr.eni.ecole.projet.eniEncheres.ihm.models.RetraitModel;

/**
 * Servlet implementation class ModifierVenteServlet
 */
@WebServlet("/ModifierVenteServlet")
public class ModifierVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RetraitManager retraitManager = RetraitManagerSing.getInstance();
	private ArticleVenduManager articleManager = ArticleVenduManagerSing.getInstance();
	private UtilisateurManager userManager = UtilisateurManagerSing.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierVenteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArticleVenduModel articlemodel = new ArticleVenduModel();	
		RetraitModel retraitModel = new RetraitModel();
		ArticleVendu articleVendu = new ArticleVendu();
		
		if ((request.getParameter("BT_ENREGISTRER")) != null) {
			
			Retrait retraitArticle = new Retrait();

			
			
			Utilisateur user = new Utilisateur();
			
			try {
				user = userManager.getUtilisateurById(articleVendu.getNoUtilisateur());
			} catch (BLLException e1) {
				e1.getMessage();
			}
			
			articleVendu.setNomArticle(request.getParameter("articleNom"));
			articleVendu.setDescription(request.getParameter("description"));
			articleVendu.setNoCategorie(Integer.parseInt(request.getParameter("categorie")));
			articleVendu.setMiseAPrix(Integer.parseInt(request.getParameter("miseAPrix")));
			articleVendu.setDateDebutEncheres(LocalDate.parse(request.getParameter("bid-start")));
			articleVendu.setDateFinEncheres(LocalDate.parse(request.getParameter("bid-end")));
			
			retraitArticle.setNoArticle(articleVendu.getNoArticle());
			retraitArticle.setRue(request.getParameter("nomRue"));
			retraitArticle.setCodePostal(request.getParameter("codePostal"));
			retraitArticle.setVille(request.getParameter("ville"));
		
			try {
				articleManager.updateArticle(articleVendu);
			} catch (BLLException e) {
				e.printStackTrace();
				articlemodel.setMessage("!: " + e.getMessage());
			}
			
			try {
				retraitManager.updateRetrait(retraitArticle);
			} catch (Exception e) {
				e.printStackTrace();
				retraitModel.setMessage(e.getMessage());
			}
			articlemodel.setCurrent(articleVendu);
			
		}		
		
		if (request.getParameter("BT_ANNULERVENTE") != null) {
			
			
			try {
				articleManager.deleteArticle(articleVendu);
			} catch (BLLException e) {
				e.printStackTrace();
				articlemodel.setMessage("!: " + e.getMessage());
			}
			
		}
		
		List<Object> modelList = new ArrayList<Object>();
		modelList.add(articlemodel);
		modelList.add(retraitModel);
		
		request.setAttribute("modelList", modelList);
		request.getRequestDispatcher("/WEB-INF/modifierVente.jsp").forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
