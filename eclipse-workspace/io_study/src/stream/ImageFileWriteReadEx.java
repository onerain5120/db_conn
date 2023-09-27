package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageFileWriteReadEx {
	
	public static void main(String[] args) throws IOException {
		
		
		// 쓰기(Byte, 문자)
		// 파일(FileWriter)
		
		
		//읽을 이미지 파일(바이트) 객체
		InputStream is = new FileInputStream("C:/ex/data/dog1.jpg");
		System.out.println(is);
		
		//읽은 고양이 파일을 쓸 이미지파일(바이트) 객체
		OutputStream os = new FileOutputStream("C:/ex/data/dog_copy.jpg");
		System.out.println(os);
		
	    // 고양이 그림을 읽으면(바이트 형태) 바이트 배열의 공간에 일단 넣어놔야 함
	    // 임의의 바이트 배열 선언
		// 1024 byte = 1KB
		// 1KB * 1024 = 1MB
		
		byte buffer[] = new byte[1024];
	    //고양이 이미지 읽은 바이트 크기가 어떻게 될 지 모르므로 while
		
		while(true) {
			
			int num = is.read(buffer);
			
			// 실제로 읽은 바이트 수(num)를 정수로 반환됩니다.
			System.out.println(num);
			
			// 스트림이 파일 끝에 있어서 사용 가능한 바이트가 없으면 -1 값이 반환됩니다.
			if (num == -1) {
				break;
			}
			
			os.write(buffer, 0, num);
		}
		
		
		
		
		
	}
}



