package ex04_net_TCP;

import java.io.*;
import java.net.*;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin =null;
		BufferedWriter bw = null;
		ServerSocket server = null;// socket 1
		Socket client = null; // socket 2
		
		System.out.println("������ ���۵˴ϴ�.");
		
		try {
			server = new ServerSocket(9999);
			client = server.accept(); //������, Ŭ���̾�Ʈ����
			//Ŭ���̾�Ʈ���� ���� �޽��� // Ŭ���̾�Ʈ --> ����
			br = new BufferedReader(new InputStreamReader(client.getInputStream())); 

			//Ű����κ��� �Է¹ޱ� // �����(����)�Է� -->����
			stin = new BufferedReader(new InputStreamReader(System.in)); 
			
			//Ŭ���̾�Ʈ���� ��½�Ʈ�� //���� -> Ŭ���̾�Ʈ
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String inputMessage;
			
			while(true) {
				inputMessage = br.readLine();
				
				if(inputMessage.equalsIgnoreCase("exit")) break;
				System.out.println(inputMessage);
				
				System.out.print(">>");
				String outputMessage = stin.readLine();
				bw.write("���� �ۼ� : " + outputMessage + "\n");
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
