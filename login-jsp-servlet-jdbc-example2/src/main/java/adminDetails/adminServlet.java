package adminDetails;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registeradmin")
public class adminServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private adminDAO adminDAO;

    public void init() {
    	adminDAO = new adminDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	
    	int registeradminId = 0;
    	
    	
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        admin admin = new admin();
        
        admin.setFirstName(firstName);
        admin.setLastName(lastName);
        admin.setUsername(username);
        admin.setPassword(password);


        try {
        	registeradminId = adminDAO.registerEmployee(admin);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(registeradminId > 0) {
        	
        request.setAttribute("firstName",admin.getFirstName());
          request.setAttribute("lastName",admin.getLastName());
          request.setAttribute("username",admin.getUsername());
          request.setAttribute("password", admin.getPassword());


          RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
          requestDispatcher.forward(request, response);
        }
    }
}
