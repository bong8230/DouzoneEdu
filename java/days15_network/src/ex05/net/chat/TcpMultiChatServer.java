package ex05.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

//outer class
public class TcpMultiChatServer {
	
	HashMap clients; //key value
	ServerSocket ss = null;// socket1
	Socket s = null; // socket2
	
	//TcpMultiChatServer() start
	public TcpMultiChatServer() {
		clients = new HashMap(); // ��ü����
		Collections.synchronizedMap(clients); // ����ȭ
	}// TcpMultiChatServer() end
	
	//start() start
	public void start() {
		try {
			ss = new ServerSocket(8000);
			System.out.println("���� ���� ���� ~!!\n" + "ä���� �����ϼ���." );
			while(true) {
				s = ss.accept();
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "]���� �����ϼ̽��ϴ�.");
				ServerReceiver thread = new ServerReceiver(s);
				thread.start(); //run method ������
			}
			
		} catch (Exception e) { System.out.println("���� ���� ���� �̤�"); }
	}// start() end
	
	public void sendToAll(String msg) {
		
		Iterator it = clients.keySet().iterator(); // key�� ���
		
		while(it.hasNext()) {
			try {
				DataOutputStream dos = (DataOutputStream) clients.get(it.next());
					
				dos.writeUTF(msg);
			} catch (Exception e) {	e.printStackTrace();	}
		}//while end
	} // sendToAll() end
	
	
	//inner class
	class ServerReceiver extends Thread{
		Socket s; //Ŭ���̾�Ʈ ����
		DataInputStream dis;
		DataOutputStream dos;
		String name ="";
		
		public ServerReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream()); // ��Ʈ��ũ�� ���ؼ� �б�
				dos = new DataOutputStream(s.getOutputStream());// ��Ʈ��ũ�� ���ؼ� ����
			} catch (Exception e) { System.out.println("���� ���ú� ����");	}
		}

		@Override
		public void run() { //������ �����(������)
			try {
				name = dis.readUTF();
				sendToAll("@" + name +"���� �����ϼ̽��ϴ�."); // user method
				clients.put(name, dos); // HashMap�� �ֱ�
				System.out.println("���� " + clients.size()+"���� �������Դϴ�.");

				while(dis != null) {
					sendToAll(dis.readUTF());
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				sendToAll("@" + name +"���� �����ϼ̽��ϴ�.");
				clients.remove(name); //������ ����
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "]���� �����̽��ϴ�.");
				System.out.println("���� " + clients.size()+"���� �������Դϴ�.");
			}
		}//run() end
		
	}//ServerReceiver class end
	
	
	//main method
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}//main method end
	
}
