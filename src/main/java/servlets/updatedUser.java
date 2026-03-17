package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import beans.Utilisateur;
import dao.UtilisateurDao;

/**
 * Servlet implementation class updatedUser
 */
@WebServlet("/updatedUser")
public class updatedUser extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String UPDATED_USERS_VIEW = "/WEB-INF/modifierUtilisateur.jsp";

    @Override
    public void init() {
        UtilisateurDao dao = new UtilisateurDao();
        getServletContext().setAttribute("utilisateurDao", dao);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        UtilisateurDao dao = (UtilisateurDao) getServletContext().getAttribute("utilisateurDao");

        Utilisateur utilisateur = dao.lister().stream()
            .filter(u -> u.getId() == id)
            .findFirst()
            .orElse(null);

        request.setAttribute("utilisateur", utilisateur);
        getServletContext().getRequestDispatcher(UPDATED_USERS_VIEW).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        UtilisateurDao dao = (UtilisateurDao) getServletContext().getAttribute("utilisateurDao");

        dao.modifier(id, prenom, nom, login, password);

        response.sendRedirect("listUser");
    }
}
