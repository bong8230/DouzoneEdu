package ex02_lambda;

import java.util.*;


public class MainEntry {
	public static void main(String[] args) {
		Thread t = new Thread(()-> {
			System.out.println("Thread Start");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				 e.printStackTrace();
			}
			System.out.println("Thread End");
		});
//		t.start();
//		System.out.println(t);
		
		
		System.out.println("=============================");
		List<String> list = new ArrayList();
		list.add("jabva");
		list.add("jabva");
		list.add("jabva");
		
//		System.out.println(list);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		//(매개변수 목록) -> (실행문)
		list.forEach((item)->{
			System.out.println(item);
			});
	}
}
