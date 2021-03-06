package ex03_Swing;

import javax.swing.*;
import java.awt.*;

public class JTableEx extends JFrame {
	
	JTable table;
	String[] fieldName = {"학번" ,"국어", "전산", "수학"};
	String[][] data = { {"001", "60", "70", "80"},
							{"002", "65", "85", "77"},
							{"003", "70", "90", "69"},
							{"003", "70", "90", "69"},
							{"003", "70", "90", "69"},
							{"003", "70", "90", "69"}
							};
	
	public JTableEx(String str){
		super(str);
		table = new JTable(data, fieldName);
		JScrollPane  sp = new JScrollPane(table);
		getContentPane().add(sp, "Center");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 150);
		setVisible(true);
	}//end
	
	public static void main(String[] args) {
		new JTableEx("테이블예제");
	}
}
