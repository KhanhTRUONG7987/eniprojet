package fr.eni.ecole.projet.eniEncheres.ihm.servlets;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bll.enchere.EnchereManager;
import fr.eni.ecole.projet.eniEncheres.bll.enchere.EnchereManagerSing;
import fr.eni.ecole.projet.eniEncheres.bo.Enchere;
import fr.eni.ecole.projet.eniEncheres.ihm.models.EnchereModel;

/**
 * Servlet implementation class Encherir
 */
@WebServlet("/Encherir")
public class EncherirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EnchereManager enchereManager = EnchereManagerSing.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EncherirServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EnchereModel enchereModel = new EnchereModel();
		
		if (request.getParameter("BT_ENCHERIR") != null) {
			Enchere enchere = new Enchere();
			LocalDateTime dateEnchere = LocalDateTime.now(); 
			
			enchere.setDateEnchere(dateEnchere);
			enchere.setMontantEnchere(Integer.parseInt( request.getParameter("enchere_proposition")));
			enchere.setNoArticle(Integer.parseInt(request.getParameter("noArticle")));
			enchere.setNoUtilisateur(Integer.parseInt(request.getParameter("noUtilisateur")));
			
			try {
				enchereManager.addEnchere(enchere);
			} catch (BLLException e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
		request.setAttribute("enchereModel", enchereModel);
		request.getRequestDispatcher("/WEB-INF/utilisateur.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
