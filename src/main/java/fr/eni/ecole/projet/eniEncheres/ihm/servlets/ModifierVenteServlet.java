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
<<<<<<< HEAD

=======
			
>>>>>>> 269ef3b14a5af8feef620dec6ae9f7f4b595a3e5
			articleVendu.setNomArticle(request.getParameter("articleNom"));
			articleVendu.setDescription(request.getParameter("description"));
			articleVendu.setNoCategorie(Integer.parseInt(request.getParameter("categorie")));
			articleVendu.setMiseAPrix(Integer.parseInt(request.getParameter("miseAPrix")));
			articleVendu.setDateDebutEncheres(LocalDate.parse(request.getParameter("bid-start")));
			articleVendu.setDateFinEncheres(LocalDate.parse(request.getParameter("bid-end")));
<<<<<<< HEAD

=======
			
>>>>>>> 269ef3b14a5af8feef620dec6ae9f7f4b595a3e5
			retraitArticle.setNoArticle(articleVendu.getNoArticle());
			retraitArticle.setRue(request.getParameter("nomRue"));
			retraitArticle.setCodePostal(request.getParameter("codePostal"));
			retraitArticle.setVille(request.getParameter("ville"));
<<<<<<< HEAD

=======
		
>>>>>>> 269ef3b14a5af8feef620dec6ae9f7f4b595a3e5
			try {
				articleManager.updateArticle(articleVendu);
			} catch (BLLException e) {
				e.printStackTrace();
				articlemodel.setMessage("!: " + e.getMessage());
			}
<<<<<<< HEAD

=======
			
>>>>>>> 269ef3b14a5af8feef620dec6ae9f7f4b595a3e5
			try {
				retraitManager.updateRetrait(retraitArticle);
			} catch (Exception e) {
				e.printStackTrace();
				retraitModel.setMessage(e.getMessage());
			}
			articlemodel.setCurrent(articleVendu);
<<<<<<< HEAD

		}

		if (request.getParameter("BT_ANNULERVENTE") != null) {

=======
			
		}		
		
		if (request.getParameter("BT_ANNULERVENTE") != null) {
			
			
>>>>>>> 269ef3b14a5af8feef620dec6ae9f7f4b595a3e5
			try {
				articleManager.deleteArticle(articleVendu);
			} catch (BLLException e) {
				e.printStackTrace();
				articlemodel.setMessage("!: " + e.getMessage());
			}
<<<<<<< HEAD

		}

		List<Object> modelList = new ArrayList<Object>();
		modelList.add(articlemodel);
		modelList.add(retraitModel);

		request.setAttribute("modelList", modelList);
		request.getRequestDispatcher("/WEB-INF/modifierVente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
=======
			
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
>>>>>>> 269ef3b14a5af8feef620dec6ae9f7f4b595a3e5
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
