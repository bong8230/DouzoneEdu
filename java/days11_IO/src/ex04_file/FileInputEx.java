package ex04_file;

import java.io.*;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) {
			//throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		try {
			OutputStream os = new FileOutputStream("memo.txt"); //����Է°���
			
			while(true) {
				System.out.println("���ڿ� �Է� ��� : ");
				String str = sc.nextLine() + "\r\n";
				
				if(str.toUpperCase().contentEquals("EXIT\r\n")) break;
				os.write(str.getBytes());
			} // end while
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
