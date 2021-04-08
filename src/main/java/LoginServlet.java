import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        String output = "";
        output += "<h1>Login Page</h1>";
        output += "<form action='/login' method='POST'>";
        output += "<input name='username' type='text' placeholder='Enter username'>";
        output += "<button>Submit</button>";
        output += "</form>";
        out.println(output);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Login post request submitted");
        String username = req.getParameter("username");
        System.out.println(username);

        if (username.equals("hi")) {
            resp.sendRedirect("/hello-world?name=" + username);
        } else {
            resp.sendRedirect("/about");
        }

    }
}
