package ex03_net_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) {
		int port = 7000;
		Socket s = null;
		ServerSocket ss = null;
		System.out.println("Server Start!!!");

		try {
			ss = new ServerSocket(port); // socket 1
			s = ss.accept(); //socket2

			// I/O
			InputStream is = s.getInputStream();// read
			OutputStream os = s.getOutputStream();// write

			byte[] arr = new byte[100];
			is.read(arr);

			System.out.println(new String(arr));
			String msg = "안녕 클라이언트~";
			os.write(msg.getBytes());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
