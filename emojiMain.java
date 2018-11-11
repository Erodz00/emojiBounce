import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

public class emojiMain {
	double x,y,vx,vy, sizex, sizey;
	Image Image1;
	int total = 12;


	public emojiMain(int startx, int starty){
		this.x = startx;
		this.y = starty;
		this.vx = Math.random()*60;
		this.vy = Math.random()*60;
		
		for(int i = 0 ;i<total;i++){
			Image1 = Toolkit.getDefaultToolkit().getImage("kms.png");
		}
		
	}
	public void update(){
		this.x += vx;
		this.y +=vy;
		if (x<0){
			vx = Math.abs(vx);
		}
		if (y<0){
			vy = Math.abs(vy);
		}
		else if (x > 1085){
			vx = -Math.abs(vx);
		}
		else if (y > 550){
			vy = -Math.abs(vy);
		}
	}
	
	public Image getImage(){
		return this.Image1;
	}
	public void paint(Graphics g, ImageObserver io){
		g.drawImage(Image1, (int) x, (int) y, io);
	}
}