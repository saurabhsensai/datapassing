package lenovo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet  {

	public void service(HttpServletRequest req,HttpServletResponse rep) throws IOException {
		
		
		int k = (int)  req.getAttribute("k");
		
		
		PrintWriter out = rep.getWriter();
		out.println("Result is : " + k*k);
		
			
		
		
	}
	
}