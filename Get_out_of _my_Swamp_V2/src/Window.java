import java.awt.*; 

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Window {

	public Window(int width, int height, String title, Board board) {

		//change the background colour of the JoptionPane window
		UIManager uim =new UIManager();  
		uim.put("OptionPane.background",new ColorUIResource(78, 191, 191));  
		uim.put("Panel.background",new ColorUIResource(78, 191, 191));  
		
		//main window set up
		board.setPreferredSize(new Dimension(width,height));
		board.setMaximumSize(new Dimension(width,height));
		board.setMinimumSize(new Dimension(width,height));

		JFrame frame = new JFrame(title);
		frame.add(board);
		frame.pack();


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board board = new Board();
		
		new Window(800,800, "Get out of my Swamp!", new Board());
		

	}

}
