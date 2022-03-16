package ex04_net_TCP;

import java.io.*;
import java.net.*;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin =null;
		BufferedWriter bw = null;
		Socket client = null; // socket 1
		
		try {
			client = new Socket("localhost",9999);
			//서버한테 받은 메시지 //  서버 --> 클라이언트
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//키보드로부터 입력받기 // 사용자(클라이언트)입력 --> 클라이언트
			stin = new BufferedReader(new InputStreamReader(System.in));
			//서버로의 출력스트림 // 클라이언트 --> 서버
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputMessage;
			System.out.println("서버에 접속하였습니다.");
			while(true) {
				System.out.print("message input: ");
				outputMessage = stin.readLine();
				
				if(outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				} // end if
				
				bw.write("클라이언트 작성 : " + outputMessage + "\n");
				bw.flush();
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				client.close();
			} catch (IOException e) {
				 e.printStackTrace();
			}
		}
	}
}
