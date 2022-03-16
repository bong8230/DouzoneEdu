package ex01_gu1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextAreaMain extends Frame implements ActionListener {
	TextArea ta;
	Button btn;

	public TextAreaMain(String str) {

		setBackground(Color.pink);
		setVisible(true);
		setBounds(500, 350, 500, 400); // setLocation + set Size

		btn = new Button("Button1");
		ta = new TextArea("문장을 넣으세요", 5, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);

		this.add(btn);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
			}
		});

		addWindowListener(new WindowAdapter() { // 익명 클래스
			@Override
			public void windowClosing(WindowEvent e) { // 창 닫기
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new TextAreaMain("ohohohoh");
	}
}
