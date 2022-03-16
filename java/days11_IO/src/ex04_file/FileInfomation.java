package ex04_file;

import java.io.File;
import java.io.IOException;

public class FileInfomation {
	public static void main(String[] args) throws IOException  {
		
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		
		System.out.print("file name = ");//
		
		System.in.read(fileName); //예외발생
		strName = new String(fileName).trim();
		
		file = new File(strName);
		System.out.println("절대경로 : " + file.getAbsolutePath());
		System.out.println("표준경로 : "+ file.getCanonicalPath());
		System.out.println("최종 수정일 : " + file.lastModified());
		System.out.println("파일크기 : " + file.length());
		System.out.println("읽기속성 : " + file.canRead());
		System.out.println("쓰기속성 : " + file.canWrite());
		System.out.println("숨김속성 : " + file.isHidden());
		System.out.println("파일경로속성 : " + file.getPath());
	}
}
