package controllers;

import beans.Ad;
import models.Ads;
import models.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "IndexServlet", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Ads indexOfAds = DaoFactory.getAdsDao();
        List<Ad> ads = indexOfAds.all();

        try {
            request.setAttribute("ads", ads);
            request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
        } catch (ServletException se) {
            System.out.println(se.getMessage());
        }


    }
}
