package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class WriteEx {
	
	public static void main(String[] args) {
		
		// 입출력을 하기 위해서 스트림이라는 공간이 필요
		// 그 공간을 만들 객체가
		// 그 객체는 바로 입출력 관련 클래스에서 만들 수 있음
		// 입출력 관련 클래스(바이트스트림, 문자스트림)
		
		// 1) 바이트 스트림(동영상, 이미지 등...., 메모장 열었을 때 깨짐)
		
		// 입출력은 여러 상황에 대한 예외 처리를 항상 해 주서야 함
		
		// 바이트스트림 : InputStream, OutputStream
		
		
		// FileOutputStream 은 파일명을 집어넣어서 파일로 출력이 되게하는 파일출력 객체를 만드는 클래스
		
//		new FileOutputStream("C:\\ex\\data\\test1.db");

		try {			
			OutputStream outputstream = new FileOutputStream("C:/ex/data/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 20;
			byte d = 20;
			byte e = 20;
			
			outputstream.write(a);
			outputstream.write(b);
			outputstream.write(c);
			outputstream.write(d);
			outputstream.write(e);
			// 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움, 버퍼를 사용하는 이유는 출력 성능 향상을 위해
			outputstream.flush();
			// 출력 스트림(리소스 자원)을 사용했으나 다시 반납한다라는 개념으로 닫아줘야 함...
			
			outputstream.close();
			
			
		} catch(FileNotFoundException e) {
			System.out.println("바이트데이터(텍스트 파일이 아닌 형태, 이미지 같은)로 만들어서 쓸 파일이 없는 예외");
		} catch(IOException e) {
			System.out.println("여러 입출력 관련 예외가 발생함");
		}
		
		
		
		
	}

}
