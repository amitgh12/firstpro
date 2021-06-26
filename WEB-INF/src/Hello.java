
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Hello() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<html><body>");
		out.print("<h3>Hello World!</h3>");
		out.print("<h3>Welcome to My Server!</h3>");
		out.print("</body></html>");
	}

}
