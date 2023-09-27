package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamEx {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		 OutputStream os = new FileOutputStream("C:/ex/data/test6.txt");
		
		try(os) {
			
			PrintWriter ps= new PrintWriter(os);
			ps.print("<html>");
			ps.print("<body>hi<p>");
			ps.print("</body>");
			ps.print("<html>");
			ps.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
