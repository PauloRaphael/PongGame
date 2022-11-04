import java.awt.*;
import java.awt.event.*;

public class Paddle extends Rectangle{
	
	int id;
	int yVelocity;
	int speed = 10;
	
	Paddle(int x, int y, int PADDLE_WIDHT, int PADDLE_HEIGHT, int id) {
		super(x,y,PADDLE_WIDHT, PADDLE_HEIGHT);
		this.id = id;
	}
    
	public void keyPressed(KeyEvent e) {
		switch(id) {
		case 1:
			if(e.getKeyCode() == KeyEvent.VK_W) {
				setYDIretion(-speed);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_S) {
				setYDIretion(speed);
				move();
			}
			break;
		case 2:
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				setYDIretion(-speed);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDIretion(speed);
				move();
			}
			break;
		}
	}
	public void keyReleased(KeyEvent e) {
		switch(id) {
		case 1:
			if(e.getKeyCode() == KeyEvent.VK_W) {
				setYDIretion(0);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_S) {
				setYDIretion(0);
				move();
			}
			break;
		case 2:
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				setYDIretion(0);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDIretion(0);
				move();
			}
			break;
		}
	}
	public void setYDIretion(int yDirection) {
		yVelocity = yDirection;
	}
	public void move() {
		y = y + yVelocity;
	}
	public void draw(Graphics g) {
		if(id==1) {
			g.setColor(Color.blue);
		}
		else {
			g.setColor(Color.red);
		}
		g.fillRect(x, y, width, height);
	}
}


