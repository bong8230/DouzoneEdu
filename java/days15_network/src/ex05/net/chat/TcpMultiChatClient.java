package ex05.net.chat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatClient {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("error : TcpMultiChatClient nickName not find ");
			System.exit(0);
		}

		try {
			String ip = "169.254.175.253";
			Socket s = new Socket(ip, 8000);
			System.out.println("������ ����Ǿ����ϴ�.");

			Thread send = new Thread(new ClientSender(s, args[0]));
			Thread receiver = new Thread(new ClientReceiver(s));

			send.start();
			receiver.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// end main

	static class ClientSender extends Thread {
		Socket s;
		DataOutputStream dos;
		String name;

		public ClientSender(Socket s, String name) { // �Ű����� 2�� �������Լ�
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//ClientSender() end

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			try {
				if (dos != null)
					dos.writeUTF(name);
				while (dos != null)
					dos.writeUTF("[" + name + "]" + sc.nextLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}// run() end
	} // ClientSender end

	static class ClientReceiver extends Thread {
		Socket s;
		DataInputStream dis;
		
		public ClientReceiver(Socket s) {
			this.s =s;
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//ClientReceiver() end

		@Override
		public void run() {
			while(dis != null) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}//run() end
		
	}// ClientReceiver end
	
}
