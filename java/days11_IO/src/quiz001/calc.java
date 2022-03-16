package quiz001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calc {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("숫자2개와 기호를 입력하세요");
		int su1,su2;
		String m;
		
		su1 = Integer.parseInt(br.readLine());
		su2 = Integer.parseInt(br.readLine());
		m = br.readLine();
		if(m.equals("+"))	System.out.println(su1+su2);
		else if(m.equals("-"))	System.out.println(su1-su2);
		else if(m.equals("*"))	System.out.println(su1*su2);
		else if(m.equals("/"))	System.out.println(su1/su2);
		
	}
}
