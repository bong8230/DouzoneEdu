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
			//�������� ���� �޽��� //  ���� --> Ŭ���̾�Ʈ
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//Ű����κ��� �Է¹ޱ� // �����(Ŭ���̾�Ʈ)�Է� --> Ŭ���̾�Ʈ
			stin = new BufferedReader(new InputStreamReader(System.in));
			//�������� ��½�Ʈ�� // Ŭ���̾�Ʈ --> ����
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputMessage;
			System.out.println("������ �����Ͽ����ϴ�.");
			while(true) {
				System.out.print("message input: ");
				outputMessage = stin.readLine();
				
				if(outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				} // end if
				
				bw.write("Ŭ���̾�Ʈ �ۼ� : " + outputMessage + "\n");
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
