package stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharWriteReadEx1 {
	
	public static void main(String[] args) throws IOException {
		
		
		// 쓰기(Byte, 문자)
		// 파일(FileWriter)
		
		FileWriter fw = new FileWriter("C:/ex/data/test2.txt");
		
		try(fw) {
			fw.write("안녕\n 좋은아침");
		} catch(IOException e) {
			System.out.println("파일 입출력 관련 예외");
		}
		
		
		
		// 읽기(Byte, 문자)
		// 파일(FileReader이나 이걸로 바로 읽을 수는 없는 듯 함)
		FileReader fr = new FileReader("C:/ex/data/test2.txt");
		while(true) {
			int read = fr.read();
			System.out.println((char)read);
			if(read == -1) {
				break;
			}
		}
		
	}
}



