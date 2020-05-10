import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

/*
 * THis c;ass deal with the  mouse section on the options 
 * created on the menu of the game
 */
public class MouseInput implements MouseListener {
	
	Handler handler;

	//constructor
	public MouseInput(Handler handler) {
		this.handler = handler;
	}
	
	public void mouseClicked(MouseEvent e) {	
		
	}


	public void mousePressed(MouseEvent e) {
		
		int xAxis = e.getX();
		int yAxis = e.getY();
		//PLAY Button
		if (xAxis>= Board.getWIDTH() +200 && xAxis< Board.getWIDTH() +600) {
			if (yAxis>= 250 && yAxis< 300) {
				
				handler.setLevel(Level.Game);//setting game state to GAME in order to start the game
				handler.createOgre();//instantiating HEK when the game starts
			}	
		}
		//Quit Button
		if (xAxis>= Board.getWIDTH() +200 && xAxis< Board.getWIDTH() +600) {
			if (yAxis>= 350 && yAxis< 400) {
				System.exit(1);
			}	
		}
		
		//Help Button
		if (xAxis>= Board.getWIDTH() +200 && xAxis< Board.getWIDTH() +600) {
			if (yAxis>= 450 && yAxis< 500) {
				JOptionPane.showMessageDialog(null, "Welcome to GET OUT OF MY SWAMP" +  "\n"+ "See how many rounds HEK can survive in his swamp!"+ "\n" 
						+"Press SPACE in order to randomly move the characters in the swamp", "HELP",JOptionPane.INFORMATION_MESSAGE);
				
			}	
		}
		
		//Credits Button
		if (xAxis>= Board.getWIDTH() +200 && xAxis< Board.getWIDTH() +600) {
			if (yAxis>= 550 && yAxis< 600) {
				JOptionPane.showMessageDialog(null, "Grigori Zogka" +  "\n"+ "Matriculation Number"+ "\n" 
						+"40418304" +  "\n"+ "SET11103 2019-0 TR2 001 - Software Development 2", "CREDITS" ,JOptionPane.INFORMATION_MESSAGE);
				
			}	
		}
		
		
	}//end mousePressed

	
	public void mouseReleased(MouseEvent e) {
		
		
	}

	
	public void mouseEntered(MouseEvent e) {
		
		
	}

	
	public void mouseExited(MouseEvent e) {
		
		
	}

}//MouseInput
