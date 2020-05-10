import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
/*
 * this Class sets up all the Menu setting and 
 * functionality
 */
public class Menu {
		
	public Rectangle startButton = new Rectangle(Board.getWIDTH() +200, 250,400,50);
	public Rectangle quitButton = new Rectangle(Board.getWIDTH() +200, 350,400,50);
	public Rectangle helpButton = new Rectangle(Board.getWIDTH() +200, 450,400,50);
	public Rectangle creditsButton = new Rectangle(Board.getWIDTH() +200, 550,400,50);
			

	public void render(Graphics g) {
		
		Font font = new Font("arial", Font.BOLD, 50);
		g.setFont(font);
		g.setColor(Color.GREEN);
		g.drawString("Get out of my Swamp!", Board.getWIDTH()/2 + 130, 100);
		
		Graphics2D g2d = (Graphics2D) g;
		
		
		Font font2 = new Font("arial", Font.BOLD, 30);
		g.setFont(font2);
		g.drawString("PLAY", Board.getWIDTH() + 360 , 285);
		g.drawString("QUIT", Board.getWIDTH() + 360 , 385);
		g.drawString("HELP", Board.getWIDTH() + 360 , 485);
		g.drawString("CREDITS", Board.getWIDTH() + 335 , 585);
		
		g2d.draw(startButton);
		g2d.draw(quitButton);
		g2d.draw(helpButton);
		g2d.draw(creditsButton);
		
		
		
		
	}//end  render
	
}// end class menu
