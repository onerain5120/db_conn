package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 웹브라우저에서 요청시 어떤 url로 요청하는 가에 따라 이 클래스(서블릿)이 동작하도록 매핑해야함
// 매핑시 사용하는 어노테이션 @WebServlet

@WebServlet(urlPatterns = "/first")  // (서블릿을 선언하기 위한 어노테이션)Annotation used to declare a servlet. 
public class FirstServlet extends HttpServlet{

	@Override
	public void init() throws ServletException {
		
		System.out.println("FirstServlet 객체가 만들어지면서 초기화함");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("클라이언트가 서버에게 get방식의 요청을 함");
	}
	
	
	@Override
	public void destroy() {
		System.out.println("destroy() 메서드 호출됨");

	}
	
}



