package stream;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

public class CharWriteEx5 {
	
	public static void main(String[] args) throws IOException {
		
		//close 를 안쓰고 하는 방식(생략이 가능) 
		// 가능한 이유는 리소스를 가지고 try with resource문이 있음
		// try() {
		// } catch {
		// }
		
//		try {
//			Writer writer = new FileWriter("test3.txt");
//			
//			
//			writer.write("STU");
//			writer.flush();
//			writer.close();
//			
//			
//		} catch (IOException e) {
//
//			System.out.println("여러 입출력 관련 예외가 발생함");
//		
//		}
		
		// 위 문구를 try with resource문으로 변경(close 생략 가능)
		
//		try(Writer writer = new FileWriter("test4.txt");) {
//			
//			writer.write("XYZ");
////			writer.flush();
////			writer.close();
//			
//		} catch (IOException e) {
//			System.out.println("여러 입출력 관련 예외가 발생함");
//		}
		
		
		// 최근 문법
		
		Writer writer = new FileWriter("test8.txt");
		try(writer) {

			
			writer.write('A');
			writer.write('B');
			writer.write('C');

			
		} catch (IOException e) {
			System.out.println("여러 입출력 관련 예외가 발생함");
		}
		
		
		
		System.out.println("-------------------");
		
		InputStream is = new FileInputStream("C:/Users/Administrator/eclipse-workspace/io_study/test8.txt");
		
		System.out.println(is);
		
		while(true) {
			int res = is.read();
			System.out.println((char)res);
			// 컴퓨터에서는 파일의 끝을 만나면 -1을 반환함
			if(res == -1) {
				break;
			}
		}
		
		
	}

}
