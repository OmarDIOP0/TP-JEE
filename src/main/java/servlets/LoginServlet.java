package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import beans.Utilisateur;
import dao.UtilisateurDao;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String LOGIN_VIEW = "/WEB-INF/login.jsp";
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher(LOGIN_VIEW).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
        String password = request.getParameter("password");

        UtilisateurDao dao = new UtilisateurDao();
        Utilisateur u = dao.connecter(login, password);

        if (u != null) {
            HttpSession session = request.getSession();
            session.setAttribute("utilisateurConnecte", u);
            response.sendRedirect("listUser");
        } else {
            request.setAttribute("erreur", "Login ou mot de passe incorrect.");
            getServletContext().getRequestDispatcher(LOGIN_VIEW).forward(request, response);
        }
	}

}
