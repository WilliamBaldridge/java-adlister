package controllers;

import beans.Ad;
import models.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/profile.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("ad-title");
        String description = request.getParameter("ad-description");
        long userId = 1;
        long id = 5;

        Ad adToInsert = new Ad(id, userId, title, description);
        System.out.println(adToInsert);
        DaoFactory.getAdsDao().insert(adToInsert);

        response.sendRedirect("/ads");

    }
}
