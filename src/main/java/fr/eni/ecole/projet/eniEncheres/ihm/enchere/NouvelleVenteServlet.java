package fr.eni.ecole.projet.eniEncheres.ihm.enchere;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Manager;

import fr.eni.ecole.projet.eniEncheres.bll.ArticleVendu.ArticleVenduManager;
import fr.eni.ecole.projet.eniEncheres.bll.ArticleVendu.ArticleVenduManagerSing;
import fr.eni.ecole.projet.eniEncheres.bll.Retrait.RetraitManager;
import fr.eni.ecole.projet.eniEncheres.bll.Retrait.RetraitManagerSing;
import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.ihm.models.ArticleVenduModel;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/NouvelleVenteServlet")
public class NouvelleVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RetraitManager retraitManger = RetraitManagerSing.getInstance();
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
		if ((request.getParameter("BT_ENREGISTRER")) != null) {
			ArticleVendu articleVendu = new ArticleVendu();
			articleVendu.setNomArticle(request.getParameter("articleNom"));
			articleVendu.setDescription(request.getParameter("description"));
			articleVendu.setNoCategorie(Integer.parseInt(request.getParameter("categorie")));
			articleVendu.setMiseAPrix(Integer.parseInt(request.getParameter("miseAPrix")));
			articleVendu.setDateDebutEncheres(LocalDate.parse(request.getParameter("bid-start")));
			articleVendu.setDateFinEncheres(LocalDate.parse(request.getParameter("bid-end")));
		
			try {
				articleManager.addArticle(articleVendu);
			} catch (BLLException e) {
				e.printStackTrace();
				articlemodel.setMessage("!: " + e.getMessage());
			}
			articlemodel.setCurrent(articleVendu);
			
		}

		try {
			articlemodel.setLstArticlesVendus(articleManager.selectAll());
		} catch (BLLException e) {
			e.printStackTrace();
			articlemodel.setMessage("!: " + e.getMessage());
		}
		
		
		request.setAttribute("model", articlemodel);
		request.getRequestDispatcher("/WEB-INF/nouvelleVente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
