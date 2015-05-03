package projet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjouteContributeur
 */
@WebServlet("/AjouteContributeur")
public class AjouteContributeur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idFichier = Integer.parseInt(request.getParameter("idFichier"));
		String userEnPlus = request.getParameter("userEnPlus");
		System.out.println("ajouteContributeur("+idFichier+","+userEnPlus+")");
		RequetesSQL.ajouteConstributeur(idFichier, userEnPlus);
		response.sendRedirect("EditeurDeTexte.jsp?idFichier="+idFichier);
	}

}
