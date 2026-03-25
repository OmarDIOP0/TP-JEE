package servlets;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class AuthFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {}

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request  = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String contextPath = request.getContextPath(); 
        String uri = request.getRequestURI();           

        boolean estPublique = uri.equals(contextPath + "/login")
                           || uri.startsWith(contextPath + "/css/")
                           || uri.startsWith(contextPath + "/images/")
                           || uri.startsWith(contextPath + "/js/");

        HttpSession session = request.getSession(false);
        boolean estConnecte = (session != null 
                            && session.getAttribute("utilisateurConnecte") != null);

        if (estPublique || estConnecte) {
            chain.doFilter(req, res);
        } else {
            response.sendRedirect(contextPath + "/login");
        }
    }

    public void destroy() {}
}