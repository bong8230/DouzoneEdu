package ex06_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
	public static void main(String[] args) {
		File src = new File ("C:/Windows/explorer.exe");
		File dist = new File ("explorer.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos =null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dist);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while((c=bis.read()) != -1) {
				bos.write((char)c);
			}
			
			System.out.println("¼º°ø");
		} catch(Exception e) {
			e.printStackTrace();
		}
			
	}
}
