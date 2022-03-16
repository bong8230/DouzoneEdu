package ex06_net_UDP;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import org.omg.PortableInterceptor.ServerIdHelper;

public class DatagramClient {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		
		int port = 5000;
		String str;
		byte[] b;
		
		try {
			System.out.println("@@@@ File UDP client @@@@");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("전송대상(server ip) : ");
			String serverIPAdress = br.readLine();
			
			System.out.println("전송파일 : ");
			String fileName = br.readLine(); //C:\\Users\\82108\\JavaStudy\\zzexmaplezztestzz.txt
			
			File file = new File(fileName);
			
			if(!file.exists()) {
				System.out.println("파일이 존재하지않습니다.");
				System.exit(0);
			}
			
			ds = new DatagramSocket();
			InetAddress ip = InetAddress.getByName(serverIPAdress); // 문자로 받은 ip주소를 ip형태로 변환
			str = "start";
			b = str.getBytes("utf-8");
			
			dp = new DatagramPacket(b,b.length,ip,port);
			ds.send(dp);//송신;
			
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			b = new byte[65536];
			
			while(true) {
				int count = dis.read(b,0,b.length);
				if(count == -1) break;
				dp = new DatagramPacket(b, count, ip, port);
				ds.send(dp);
			}
			
			str = "end";
			b = str.getBytes("utf-8");
			
			dp = new DatagramPacket(b, b.length, ip, port);
			ds.send(dp);
			
		} catch (Exception e) {
			 e.printStackTrace();
		} finally {
			try {
				br.close(); dis.close(); 
			} catch (Exception e) {
				 e.printStackTrace();
			}
		}
	}
}
