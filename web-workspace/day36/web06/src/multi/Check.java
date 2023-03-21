package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/check.do")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String today = request.getParameter("today");
		if(today.equals("맑음")) {
			out.print("나가자");
		} else if(today.equals("흐림")) {
			out.print("쇼핑");
		} else {
			out.print("그냥 있자");
		}
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String pass = request.getParameter("pass");
		String result = "들어올 수 없습니다.<img src='shoes1.jpg'>";
		if (pass.equals("나는왕이다")) {
			result = "들어오세요.<img src='shoes2.jpg'>";
		} 
		// setContentType은 out만들기 전에 설정!!
		out.print(result);
		out.close();
	}
	

}
