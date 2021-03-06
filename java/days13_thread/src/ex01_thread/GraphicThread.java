package ex01_thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread 
					extends JFrame implements Runnable {
							  // Frame : window
	int num, x, y;
	Color color;
	Random random;
	
	public GraphicThread(int num) {  // ??±??¨?  - μ΄κΈ°?
		this.num = num;
		color = Color.BLUE;
		random = new Random();
		
		setSize(500, 400);  // ?? ?(?λ©?) ?¬κΈ? - ?λΉ?, ??΄ 
		setVisible(true);  // ?λ©΄λ³΄?¬μ£ΌκΈ°
		setLocation(300, 150);		// ?μΉμ?? 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // ?«κΈ?
	}

	@Override
	public void run() {  // ?€? ? ?€?λΆ?(κ΅¬νλΆ?)
		Rectangle rect = getBounds();
		
		for (int i = 0; i < num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			repaint();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // end for
	} // end run();
	
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, 3, 3);
//		g.fillOval(x, y, 3, 3);
	}

	public static void main(String[] args) {
		//2.
		new Thread(new GraphicThread(2000)).start();
		
		
		//1.
//		GraphicThread gframe = new GraphicThread(2000);
//		Thread t = new Thread(gframe);
//		t.start();
	}

}




