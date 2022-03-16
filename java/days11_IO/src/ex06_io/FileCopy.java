package ex06_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("초밥.jpg"); //읽기
		OutputStream os = new FileOutputStream("copy.jpg"); //쓰기
		
		byte[] buffer = new byte[1024 * 8];
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read(buffer);
			if(inputData == -1) break;
			os.write(buffer,0,inputData);;
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		is.close(); os.close();
		System.out.println("성공");
	}
}


/*
public class FileCopy {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("초밥.jpg"); //읽기
		OutputStream os = new FileOutputStream("copy.jpg"); //쓰기
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			os.write(inputData);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		is.close(); os.close();
		System.out.println("성공");
	}
}
*/