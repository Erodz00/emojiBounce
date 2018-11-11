import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class emoji extends JComponent implements Runnable {
	emojiMain Alan, Alan1, Alan2, Alan3, Alan4, Alan5, Alan6, Alan7, Alan8, Alan9, Alan10, Alan11;
	ArrayList<emojiMain> arr = new ArrayList<emojiMain>();
	public emoji() {
		for (int i = 0; i < 12; i++) {
			Alan = new emojiMain(0, 0);
			Alan1 = new emojiMain(50, 100);
			Alan2 = new emojiMain(50, 200);
			Alan3 = new emojiMain(150, 200);
			Alan4 = new emojiMain(250, 200);
			Alan5 = new emojiMain(350, 200);
			Alan6 = new emojiMain(450, 200);
			Alan7 = new emojiMain(550, 100);
			Alan8 = new emojiMain(450, 100);
			Alan9 = new emojiMain(350, 100);
			Alan10 = new emojiMain(250, 100);
			Alan11 = new emojiMain(150, 100);
		}
		arr.add(Alan);
		arr.add(Alan1);
		arr.add(Alan2);
		arr.add(Alan3);
		arr.add(Alan4);
		arr.add(Alan5);
		arr.add(Alan6);
		arr.add(Alan7);
		arr.add(Alan8);
		arr.add(Alan9);
		arr.add(Alan10);
		arr.add(Alan11);
		Thread t = new Thread(this);
		t.start();
		for (int i = 0; i < 100; i++)
			arr.add(new emojiMain(300, 300));
		for (int i = 0; i < 100; i++) {
			arr.get(i).update();
		}
	}

	public void paint(Graphics g) {
		Alan.paint(g, this);
		Alan1.paint(g, this);
		Alan2.paint(g, this);
		Alan3.paint(g, this);
		Alan4.paint(g, this);
		Alan5.paint(g, this);
		Alan6.paint(g, this);
		Alan7.paint(g, this);
		Alan8.paint(g, this);
		Alan9.paint(g, this);
		Alan10.paint(g, this);
		Alan11.paint(g, this);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("i wanna die");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280, 720);
		frame.setVisible(true);
		frame.add(new emoji());
		frame.getContentPane().setBackground(Color.black);
	}

	@Override
	public void run() {
		while (true) {
			Alan.update();
			Alan1.update();
			Alan2.update();
			Alan3.update();
			Alan4.update();
			Alan5.update();
			Alan6.update();
			Alan7.update();
			Alan8.update();
			Alan9.update();
			Alan10.update();
			Alan11.update();
			repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}