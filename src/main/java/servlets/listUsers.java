package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import dao.UtilisateurDao;

@WebServlet("/listUser")
public class listUsers extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private static final String LIST_USERS_VIEW = "/WEB-INF/listerUtilisateurs.jsp"; 
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UtilisateurDao utilisateurDao =
                (UtilisateurDao) getServletContext().getAttribute("utilisateurDao");

        if (utilisateurDao == null) {
            utilisateurDao = new UtilisateurDao();
            getServletContext().setAttribute("utilisateurDao", utilisateurDao);
            System.out.println("DAO créé par listUser");
        }

        request.setAttribute("utilisateurs", utilisateurDao.lister());
        getServletContext().getRequestDispatcher(LIST_USERS_VIEW).forward(request, response);
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
