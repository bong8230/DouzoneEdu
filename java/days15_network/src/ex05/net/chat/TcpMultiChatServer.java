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
		clients = new HashMap(); // 객체생성
		Collections.synchronizedMap(clients); // 동기화
	}// TcpMultiChatServer() end
	
	//start() start
	public void start() {
		try {
			ss = new ServerSocket(8000);
			System.out.println("서버 접속 성공 ~!!\n" + "채팅을 시작하세요." );
			while(true) {
				s = ss.accept();
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "]에서 접속하셨습니다.");
				ServerReceiver thread = new ServerReceiver(s);
				thread.start(); //run method 유도됨
			}
			
		} catch (Exception e) { System.out.println("서버 접속 실패 ㅜㅜ"); }
	}// start() end
	
	public void sendToAll(String msg) {
		
		Iterator it = clients.keySet().iterator(); // key값 출력
		
		while(it.hasNext()) {
			try {
				DataOutputStream dos = (DataOutputStream) clients.get(it.next());
					
				dos.writeUTF(msg);
			} catch (Exception e) {	e.printStackTrace();	}
		}//while end
	} // sendToAll() end
	
	
	//inner class
	class ServerReceiver extends Thread{
		Socket s; //클라이언트 소켓
		DataInputStream dis;
		DataOutputStream dos;
		String name ="";
		
		public ServerReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream()); // 네트워크를 통해서 읽기
				dos = new DataOutputStream(s.getOutputStream());// 네트워크를 통해서 쓰기
			} catch (Exception e) { System.out.println("서버 리시브 실패");	}
		}

		@Override
		public void run() { //스레드 실행부(구현부)
			try {
				name = dis.readUTF();
				sendToAll("@" + name +"님이 입장하셨습니다."); // user method
				clients.put(name, dos); // HashMap에 넣기
				System.out.println("현재 " + clients.size()+"명이 접속중입니다.");

				while(dis != null) {
					sendToAll(dis.readUTF());
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				sendToAll("@" + name +"님이 퇴장하셨습니다.");
				clients.remove(name); //접속자 제거
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "]에서 나가셨습니다.");
				System.out.println("현재 " + clients.size()+"명이 접속중입니다.");
			}
		}//run() end
		
	}//ServerReceiver class end
	
	
	//main method
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}//main method end
	
}
