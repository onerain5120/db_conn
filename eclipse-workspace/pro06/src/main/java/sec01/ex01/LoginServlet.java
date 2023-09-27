package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public LoginServlet() {

	}
	
	public void init(ServletConfig config) throws ServletException {

	}

	public void destroy() {

	}

	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
//		response.setContentType("text/html;charset=utf-8");

		// System.out.println("여기는 로그인서블릿");
//		String user_id = request.getParameter("user_id");
//		System.out.println(user_id);
//		String user_pw = request.getParameter("user_pw");
//		System.out.println(user_pw);

//		PrintWriter pw = response.getWriter();
//		pw.print("<html><head></head><body>" + user_id + "님 반갑습니다.</body></html>");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doHandle(request, response);
		
//		resp.setContentType("text/html;charset=utf-8");
//		String user_id = req.getParameter("user_id");

//		response.setContentType("text/html;charset=utf-8");
		
//		String[] menus = req.getParameterValues("menu");
//
//		for (String menu : menus) {
//			System.out.println(menu);
//
//		}
		
		
//		Enumeration<String> enu = req.getParameterNames();
//		
////		System.out.println(enu);
//		
//		while(enu.hasMoreElements()) {
//			String name = enu.nextElement();
//			System.out.println(name);
//		}
//		
//
////		System.out.println(user_id);
//		System.out.println("이 곳은 post 요청 방식에 의해 동작함");
//		PrintWriter pw = resp.getWriter();

//		pw.print("<html><head></head><body>" + user_id + "님 반갑습니다.</body></html>");

	}

	
	
	void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		String user_id = request.getParameter("user_id");
		pw.print("<html><head></head><body>" + user_id + "님 반갑습니다.</body></html>");

		
	}
	
	
	
	
	
	
	
}
