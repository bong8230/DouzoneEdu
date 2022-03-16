package ex04_net_TCP;

import java.io.*;
import java.net.*;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin =null;
		BufferedWriter bw = null;
		ServerSocket server = null;// socket 1
		Socket client = null; // socket 2
		
		System.out.println("서버가 시작됩니다.");
		
		try {
			server = new ServerSocket(9999);
			client = server.accept(); //응답대기, 클라이언트소켓
			//클라이언트한테 받은 메시지 // 클라이언트 --> 서버
			br = new BufferedReader(new InputStreamReader(client.getInputStream())); 

			//키보드로부터 입력받기 // 사용자(서버)입력 -->서버
			stin = new BufferedReader(new InputStreamReader(System.in)); 
			
			//클라이언트로의 출력스트림 //서버 -> 클라이언트
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String inputMessage;
			
			while(true) {
				inputMessage = br.readLine();
				
				if(inputMessage.equalsIgnoreCase("exit")) break;
				System.out.println(inputMessage);
				
				System.out.print(">>");
				String outputMessage = stin.readLine();
				bw.write("서버 작성 : " + outputMessage + "\n");
				bw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				client.close(); server.close();
			} catch (IOException e) {
				 e.printStackTrace();
			}
		}
	}
}
