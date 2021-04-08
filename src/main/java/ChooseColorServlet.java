import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/choose-color")
public class ChooseColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        out.println("<form method='POST' action='/choose-color'>\n" +
                "    <input type=\"text\" name=\"choice\" placeholder=\"Enter a color\">\n" +
                "    <button>Submit</button>\n" +
                "</form>");

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // redirect to another servlet "/view-color"
        String colorChoice = req.getParameter("choice");
        resp.sendRedirect("/view-color?choice=" + colorChoice);

    }
}
