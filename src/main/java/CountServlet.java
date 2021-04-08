import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/count")
public class CountServlet extends HttpServlet {


    private int pageCount;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        if (req.getParameter("reset") != null) {
            pageCount = 0;
        }

        pageCount += 1;

        String output = "";
        output += "<h1>Page Counter: </h1>" + pageCount;

        output += "<form action='/count' method='POST'>";
        output += "<input name='reset' type='text' placeholder='Would you like to reset? Enter y'>";
        output += "<button>Reset</button>";
        output += "</form>";
        output += "<a href='/about'>About </a><a href='/login'>Login </a><a href='/count'>Page Counter</a>";
        out.println(output);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reset = req.getParameter("reset");

        if (reset.equals("y")) {
            pageCount = 0;
            resp.sendRedirect("/hell-world");
        } else {
            resp.sendRedirect("/count");
        }
    }
}
