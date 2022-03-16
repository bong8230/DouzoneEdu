package ex02_io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args)  {
		InputStream is = System.in; //표준입력
		
			
			System.out.print("input = ");
			System.out.println();
			try {
				int su;
				while((su = System.in.read()) != -1) {
					
					if(su ==10 || su==13 || su==32 ) continue; //스페이스, 엔터
					if(su == 113 || su == 81) break; // 'q', 'Q'
					
					char ch = (char) su;
					System.out.print(ch);
					
				}
				System.out.println();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
				
	}//main
}


/*
public class MainEntry {
	public static void main(String[] args)  {
		InputStream is = System.in; //표준입력
		
		try {
			System.out.print("단일 문자 입력 요망 : ");
		
			int num = is.read() - 48; //예외발생함
			is.read(); is.read();  //문제발생처리 - 자바에서 '문자'2바이트 처리됨
			int num2 = is.read() - 48;
			
			System.out.println(num+num2);

		} catch (IOException e) {
//			System.out.println("user error message");
//			System.out.println(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
	}//main
}
*/