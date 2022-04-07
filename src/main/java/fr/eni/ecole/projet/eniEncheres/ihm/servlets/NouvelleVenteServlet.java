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
import fr.eni.ecole.projet.eniEncheres.bo.Categorie;
import fr.eni.ecole.projet.eniEncheres.bo.Retrait;
import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.DAOFact;
import fr.eni.ecole.projet.eniEncheres.dal.categorie.CategorieDAO;
import fr.eni.ecole.projet.eniEncheres.dal.utilisateur.UtilisateurDAO;
import fr.eni.ecole.projet.eniEncheres.ihm.models.ArticleVenduModel;
import fr.eni.ecole.projet.eniEncheres.ihm.models.RetraitModel;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/NouvelleVenteServlet")
public class NouvelleVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RetraitManager retraitManager = RetraitManagerSing.getInstance();
	private ArticleVenduManager articleManager = ArticleVenduManagerSing.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NouvelleVenteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArticleVenduModel articlemodel = new ArticleVenduModel();	
		RetraitModel retraitModel = new RetraitModel();
		
		Retrait retraitArticle = new Retrait();
		ArticleVendu articleVendu = new ArticleVendu();
		
		Integer noUser = Integer.parseInt(request.getParameter("noUtilisateur"));
		UtilisateurDAO daoUser = DAOFact.getUtilisateurDAO();
		try {
			Utilisateur user = daoUser.getUtilisateurByID(noUser);
			retraitArticle.setRue(user.getRue());
			retraitArticle.setCodePostal(user.getCodePostal());
			retraitArticle.setVille(user.getVille());
		} catch (DALException e) {
			e.getMessage();
		}
				
		if ((request.getParameter("BT_ENREGISTRER")) != null) {
			
			Integer noCategorie = Integer.parseInt(request.getParameter("categorie"));
			CategorieDAO daoCat = DAOFact.getCategorieDAO();
			Categorie categorie = new Categorie();
			try {
				categorie = daoCat.selectById(noCategorie);
			} catch (DALException e1) {
				e1.getMessage();
			}
			
			articleVendu.setNomArticle(request.getParameter("articleNom"));
			articleVendu.setDescription(request.getParameter("description"));
			articleVendu.setCategorie(categorie);
			articleVendu.setMiseAPrix(Integer.parseInt(request.getParameter("miseAPrix")));
			articleVendu.setDateDebutEncheres(LocalDate.parse(request.getParameter("bid-start")));
			articleVendu.setDateFinEncheres(LocalDate.parse(request.getParameter("bid-end")));
			
			retraitArticle.setNoArticle(articleVendu.getNoArticle());
			retraitArticle.setRue(request.getParameter("nomRue"));
			retraitArticle.setCodePostal(request.getParameter("codePostal"));
			retraitArticle.setVille(request.getParameter("ville"));
		
			try {
				articleManager.addArticle(articleVendu);
			} catch (BLLException e) {
				e.printStackTrace();
				articlemodel.setMessage("!: " + e.getMessage());
			}
			
			try {
				retraitManager.addRetrait(retraitArticle);
			} catch (Exception e) {
				e.printStackTrace();
				retraitModel.setMessage(e.getMessage());
			}
			articlemodel.setCurrent(articleVendu);
			
		}		

		
		List<Object> modelList = new ArrayList<Object>();
		modelList.add(articlemodel);
		modelList.add(retraitModel);
		
		request.setAttribute("model", modelList);
		request.getRequestDispatcher("/WEB-INF/nouvelleVente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
