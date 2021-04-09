import model.Contact;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/contacts")
public class ViewContactsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Contact> contacts = Arrays.asList(
                new Contact(
                        1,
                        "Billy Bob",
                        "bbthorton@yahoo.com",
                        "0987 No Way Way, No Clue, Somewhere, 00000",
                        "1243989873",
                        false
                ),
                new Contact(
                        2,
                        "Halle Berry",
                        "agentberry@msn.com",
                        "123 Drive, Lake Tahoe, California, 61378",
                        "09709730297",
                        true
                ),
                new Contact(
                        3,
                        "Terry Cruz",
                        "haha@gmail.com",
                        "89738 Ric Flair Dr, Los Angeles, California, 36262",
                        "98613489689",
                        true
                )
        );

        request.setAttribute("contacts", contacts);
        request.getRequestDispatcher("contacts.jsp").forward(request, response);

        // MVC
        // M - model -
        // C - controller - server controlling what to do once it receives an HTTP request
        // V - view - how the data will be presented to the client/user/browser
    }

}
