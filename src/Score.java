import java.awt.*;

public class Score extends Rectangle{
	
	static int GAME_WIDHT;
	static int GAME_HEIGHT;
	int player1;
	int player2;
	
	Score(int GAME_WIDHT, int GAME_HEIGHT) {
		Score.GAME_WIDHT = GAME_WIDHT;
		Score.GAME_HEIGHT = GAME_HEIGHT;
	}
	public void draw(Graphics g) {
	    g.setColor(Color.white);
	    g.setFont(new Font("Consolas", Font.PLAIN, 60));
	    
	    g.drawLine((GAME_WIDHT/2), 0, (GAME_WIDHT/2), GAME_HEIGHT);
	    
	    g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDHT/2)-85, 50);
	    g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDHT/2)+20, 50);
	}

}
