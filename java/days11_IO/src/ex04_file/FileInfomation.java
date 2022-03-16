package ex04_file;

import java.io.File;
import java.io.IOException;

public class FileInfomation {
	public static void main(String[] args) throws IOException  {
		
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		
		System.out.print("file name = ");//
		
		System.in.read(fileName); //���ܹ߻�
		strName = new String(fileName).trim();
		
		file = new File(strName);
		System.out.println("������ : " + file.getAbsolutePath());
		System.out.println("ǥ�ذ�� : "+ file.getCanonicalPath());
		System.out.println("���� ������ : " + file.lastModified());
		System.out.println("����ũ�� : " + file.length());
		System.out.println("�б�Ӽ� : " + file.canRead());
		System.out.println("����Ӽ� : " + file.canWrite());
		System.out.println("����Ӽ� : " + file.isHidden());
		System.out.println("���ϰ�μӼ� : " + file.getPath());
	}
}
