package ex02_io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args)  {
		InputStream is = System.in; //ǥ���Է�
		
			
			System.out.print("input = ");
			System.out.println();
			try {
				int su;
				while((su = System.in.read()) != -1) {
					
					if(su ==10 || su==13 || su==32 ) continue; //�����̽�, ����
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
		InputStream is = System.in; //ǥ���Է�
		
		try {
			System.out.print("���� ���� �Է� ��� : ");
		
			int num = is.read() - 48; //���ܹ߻���
			is.read(); is.read();  //�����߻�ó�� - �ڹٿ��� '����'2����Ʈ ó����
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