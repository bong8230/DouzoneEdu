//*
package ex03_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerMain {  // outer class
	
	public static void main(String[] args) {
		Frame frame = new Frame("?ù¥Î≤§Ìä∏ Ï≤òÎ¶¨ - ?ù¥?Ñà?Å¥?ûò?ä§");
		Button btn = new Button("Button-Start");
		
		//2. 
		btn.addActionListener(new ActionListener() {  // ?ùµÎ™ÖÌÅ¥?ûò?ä§
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent Î∞úÏÉù?ñà?äµ?ãà?ã§. 22222");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
			}
		});
		
		// Frame event
		frame.addWindowListener(new WindowAdapter() {  // 
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.add(btn);
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}
}
//*/


/*
package ex03.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain {  // outer class
	
	class EventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ActionEvent Î∞úÏÉù?ñà?äµ?ãà?ã§. ");
			System.out.println(e.getActionCommand());
			System.out.println(e.getSource());
		}
	}  // inner class end

	public static void main(String[] args) {
		Frame frame = new Frame("?ù¥Î≤§Ìä∏ Ï≤òÎ¶¨ - ?ù¥?Ñà?Å¥?ûò?ä§");
		Button btn = new Button("Button-Start");
		
		//1.
		EventHandler handler = new InnerMain().new EventHandler();
		btn.addActionListener(handler);
		
		frame.add(btn);
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}
}
//*/






