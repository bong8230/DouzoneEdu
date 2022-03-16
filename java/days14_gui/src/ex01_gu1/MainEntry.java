package ex01_gu1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainEntry {
	public static void main(String[] args) {
		Frame f = new Frame();
		
		f.setTitle("first frame");
		f.setBackground(Color.yellow);
		f.setVisible(true);
		f.setBounds(500, 350, 500, 400); // setLocation + set Size
//		f.pack(); // 창 안의 내용크기에 비례하여 생성
//		f.setSize(500,400); //창의 크기
//		f.setLocation(500, 350); //위치조정
		
		
		f.addWindowListener(new WindowAdapter() { //익명 클래스

			@Override
			public void windowClosing(WindowEvent e) { // 창 닫기
				System.exit(0);
			} 
			
		});
	}
}
