package fr.eni.ecole.projet.eniEncheres.ihm.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bll.categorie.CategorieManager;
import fr.eni.ecole.projet.eniEncheres.bll.categorie.CategorieManagerSing;
import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.bo.Categorie;
import fr.eni.ecole.projet.eniEncheres.ihm.models.CategorieModel;


/**
 * Servlet implementation class AccueilUserConnecteServlet
 */
@WebServlet("/AccueilUserConnecteServlet")
public class AccueilUserConnecteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CategorieManager categorieManager = CategorieManagerSing.getInstance();
       
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
		
		if(request.getParameter("BT_RECHERCHER") !=null) {
			Categorie categorie = new Categorie();
			ArticleVendu article = new ArticleVendu();
			//categorie.setNoCategorie(request.getParameter("noCategorie"));
			article.setNomArticle(request.getParameter("nom_article"));
			categorie.setLibelle(request.getParameter("libelle"));
			
			try {
				categorieManager.getCategorie(categorie.getNoCategorie());
			} catch (BLLException e) {
				e.printStackTrace();
				categorieModel.setMessage("Erreur ! : " + e.getMessage());
			}
			categorieModel.setCurrent(categorie);
		}
		request.setAttribute("categorieModel", categorieModel);
		request.getRequestDispatcher("/WEB-INF/accueilConnecte.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
