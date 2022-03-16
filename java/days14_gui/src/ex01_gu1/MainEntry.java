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
//		f.pack(); // â ���� ����ũ�⿡ ����Ͽ� ����
//		f.setSize(500,400); //â�� ũ��
//		f.setLocation(500, 350); //��ġ����
		
		
		f.addWindowListener(new WindowAdapter() { //�͸� Ŭ����

			@Override
			public void windowClosing(WindowEvent e) { // â �ݱ�
				System.exit(0);
			} 
			
		});
	}
}
