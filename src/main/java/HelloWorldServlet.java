import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String queryInputGreeted = req.getParameter("name");

        if (queryInputGreeted == null || queryInputGreeted.isEmpty()) {
            queryInputGreeted = "World";
        }
        String output = String.format("<h1>Hello, %s!</h1>", queryInputGreeted);
        out.println(output);


        out.println("<a href='/about'>About </a><a href='/login'>Login </a><a href='/count'>Page Counter</a>");

    }


}
