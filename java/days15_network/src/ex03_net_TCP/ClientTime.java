package ex03_net_TCP;

import java.io.*;
import java.net.Socket;
import java.util.*;

public class ClientTime {
	public static void main(String[] args) throws IOException {
		Socket s = null;
		
		try {
			s = new Socket("127.0.0.1",7000);
			InputStream is = s.getInputStream();// read
			OutputStream os = s.getOutputStream(); //write
			
			String str = "Hello hlehlehlehlehle ";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{s.close();} catch(Exception e) {e.printStackTrace();}
		}
	}
}
