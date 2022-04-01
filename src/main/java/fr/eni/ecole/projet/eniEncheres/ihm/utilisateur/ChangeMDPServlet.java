package fr.eni.ecole.projet.eniEncheres.ihm.utilisateur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bll.utilisateur.UtilisateurManager;
import fr.eni.ecole.projet.eniEncheres.bll.utilisateur.UtilisateurManagerSing;
import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;

/**
 * Servlet implementation class ChangeMDPServlet
 */
@WebServlet("/ChangeMDPServlet")
public class ChangeMDPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurManager manager = UtilisateurManagerSing.getInstance();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeMDPServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UtilisateurModel model = new UtilisateurModel();
		if ((request.getParameter("BT_ENREGISTRER"))!=null && (request.getParameter("BT_SUPPRIMER")) != null) {
			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setPseudo(request.getParameter("pseudo"));
			utilisateur.setNom(request.getParameter("nom"));
			utilisateur.setPrenom(request.getParameter("prenom"));
			utilisateur.setEmail(request.getParameter("email"));
			utilisateur.setTelephone(request.getParameter("telephone"));
			utilisateur.setRue(request.getParameter("rue"));
			utilisateur.setCodePostal(request.getParameter("codePostal"));
			utilisateur.setVille(request.getParameter("ville"));
			utilisateur.setMotDePasse(request.getParameter("motDePasseActuel"));
			utilisateur.setMotDePasseNouveau(request.getParameter("motDePasseNouveau"));
			utilisateur.setConfirmation(request.getParameter("confirmation"));
			//utilisateur.setCredit(request.getParameter("credit"));

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
		request.getRequestDispatcher("/WEB-INF/changeMDP.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
