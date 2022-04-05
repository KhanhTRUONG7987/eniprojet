package fr.eni.ecole.projet.eniEncheres.ihm.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD:src/main/java/fr/eni/ecole/projet/eniEncheres/ihm/utilisateur/UtilisateurServlet.java
import fr.eni.ecole.projet.eniEncheres.bll.utilisateur.BLLException;
=======
import fr.eni.ecole.projet.eniEncheres.bll.util.BLLException;
>>>>>>> dc59039531f775364fd66fdc610693cf253bae70:src/main/java/fr/eni/ecole/projet/eniEncheres/ihm/servlets/UtilisateurServlet.java
import fr.eni.ecole.projet.eniEncheres.bll.utilisateur.UtilisateurManager;
import fr.eni.ecole.projet.eniEncheres.bll.utilisateur.UtilisateurManagerSing;
import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;
import fr.eni.ecole.projet.eniEncheres.ihm.models.UtilisateurModel;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UtilisateurModel model = new UtilisateurModel();
		if (request.getParameter("BT_CREER") != null) {
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
			utilisateur.setConfirmation(request.getParameter("confirmation"));

			try {
				manager.addUtilisateur(utilisateur);
			} catch (BLLException e) {
				e.printStackTrace();
				model.setMessage("Erreur!: " + e.getMessage());
			}
			model.setCurrent(utilisateur); 
		}
	
		try {
			model.setLsUtilisateurs(manager.getAllUtilisateurs());
		} catch (BLLException e) {
			e.printStackTrace();
			model.setMessage("!: " + e.getMessage());
		}

		request.setAttribute("model", model);
		request.getRequestDispatcher("/WEB-INF/utilisateur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}