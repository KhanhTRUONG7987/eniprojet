package fr.eni.ecole.projet.eniEncheres.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projet.eniEncheres.bll.Utilisateur.UtilisateurManager;
import fr.eni.ecole.projet.eniEncheres.bll.Utilisateur.UtilisateurManagerSing;
import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;

/**
 * Servlet implementation class servletUtilisateur
 */
@WebServlet("/UtilisateurServlet")
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurManager manager = UtilisateurManagerSing.getInstance();

    /**
     * Default constructor. 
     */
    public UtilisateurServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UtilisateurModel model = new UtilisateurModel();
		if(request.getParameter("BT_CREER") !=null) {
			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setPseudo(request.getParameter("pseudo"));
			utilisateur.setNom(request.getParameter("nom"));
			utilisateur.setPrenom(request.getParameter("prenom"));
			utilisateur.setEmail(request.getParameter("email"));
			utilisateur.setTelephone(request.getParameter("telephone"));
			utilisateur.setRue(request.getParameter("rue"));
			utilisateur.setCodePostal(request.getParameter("codePostal"));
			utilisateur.setVille(request.getParameter("ville"));
			utilisateur.setMotDePasse(request.getParameter("motDePasse"));
			utilisateur.setMotDePasse(request.getParameter("confirmationMDP"));
			 if(request.getParameter("motDePasse") == request.getParameter("confirmationMDP")) {
				 utilisateur.getMotDePasse();
			 }
			model.setCurrent(utilisateur);
			
		}
		
		
		request.setAttribute("model", model);
		request.getRequestDispatcher("/WEB-INF/utilisateur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
