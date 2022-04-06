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
import fr.eni.ecole.projet.eniEncheres.bll.categorie.CategorieManager;
import fr.eni.ecole.projet.eniEncheres.bll.categorie.CategorieManagerSing;
import fr.eni.ecole.projet.eniEncheres.bll.utilisateur.UtilisateurManager;
import fr.eni.ecole.projet.eniEncheres.bll.utilisateur.UtilisateurManagerSing;
import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.bo.Categorie;
import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;
import fr.eni.ecole.projet.eniEncheres.ihm.models.ArticleVenduModel;
import fr.eni.ecole.projet.eniEncheres.ihm.models.CategorieModel;

/**
 * Servlet implementation class AccueilNonConnecte
 */
@WebServlet("/AccueilNonConnecte")
public class AccueilNonConnecteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CategorieManager categorieManager = CategorieManagerSing.getInstance();
	private ArticleVenduManager articleManager = ArticleVenduManagerSing.getInstance();
	private UtilisateurManager utilisateurManager = UtilisateurManagerSing.getInstance(); 
	List<ArticleVendu> lstEncheres;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilNonConnecteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategorieModel categorieModel = new CategorieModel();
		ArticleVenduModel articleModel = new ArticleVenduModel();
<<<<<<< HEAD
		List<ArticleVendu> lstEncheres ;
		
		try {
			lstEncheres = articleManager.selectAll();
			for(ArticleVendu articleVendu : lstEncheres) {
				Utilisateur user = utilisateurManager.getUtilisateurById(articleVendu.getNoUtilisateur());
				System.out.println(articleVendu.getNomArticle() + "Prix :" + articleVendu.getPrixVente() + "Fin de l'ench�re : " + articleVendu.getDateFinEncheres()
				+ "Vendeur : " + user.getPseudo());
			}
		} catch (BLLException e) {
			e.printStackTrace();
		}
=======
>>>>>>> d89fd0681bb34e6006d0321640dff2101b505fb5
		
		
		if(request.getParameter("BT_RECHERCHER") !=null) {
			Categorie categorie = new Categorie();
			categorie.setNoCategorie(Integer.parseInt(request.getParameter("Categories")));
			String motCle = request.getParameter("name");
						
			try {
				lstEncheres = articleManager.selectAll();
				
				for (ArticleVendu articleVendu : lstEncheres) {
					if (articleVendu.getNomArticle().contains(motCle) && articleVendu.getNoCategorie() == categorie.getNoCategorie() && articleVendu.getEtatVente() == "En Cours") {
						Utilisateur utilisateur = utilisateurManager.getUtilisateurById(articleVendu.getNoUtilisateur());
						
						System.out.println(articleVendu.getNomArticle() + "Prix : " + articleVendu.getPrixVente() + "Fin de l'ench�re : " + articleVendu.getDateFinEncheres() 
						+ "Vendeur : " + utilisateur.getPseudo());
					}
				}
			} catch (BLLException e) {
				e.printStackTrace();
			}

		}
		
		List<Object> modelList = new ArrayList<Object>();
		modelList.add(articleModel);
		modelList.add(categorieModel);
		
		request.setAttribute("model", modelList);
		request.getRequestDispatcher("/WEB-INF/accueilNonConnecte.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		try {
			lstEncheres = articleManager.selectAll();
			for(ArticleVendu articleVendu : lstEncheres) {
				Utilisateur user = utilisateurManager.getUtilisateurById(articleVendu.getNoUtilisateur());
				System.out.println(articleVendu.getNomArticle() + "Prix :" + articleVendu.getPrixVente() + "Fin de l'ench�re : " + articleVendu.getDateFinEncheres()
				+ "Vendeur : " + user.getPseudo());
			}
		} catch (BLLException e) {
			e.printStackTrace();
		}
	}

}
