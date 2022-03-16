package ex03_bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MainEntry {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("더할 숫자 입력하세요");
		int su1,su2;
		
		su1 = Integer.parseInt(br.readLine());
		su2 = Integer.parseInt(br.readLine());
		System.out.println(su1+su2);
		
		
		
		
		
		
		/*
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		String str = br.readLine();//예외발생
		System.out.println(str);
		*/
	}
}
