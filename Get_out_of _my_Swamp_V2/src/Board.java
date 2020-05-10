import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Board extends JPanel implements Runnable{

	private boolean running =false;
	private Thread thread;
	private static int WIDTH, HEIGHT;
	Handler handler;
	Menu menu;

	
	//constructor
	public Board() {

		start();

	}

	public void init() {

		setFocusable(true);
		WIDTH = getWidth();
		HEIGHT = getHeight();

		handler  = new Handler();
		menu = new Menu();//instantiate menu


		this.addKeyListener(new KeyInput(handler));//by pressing SPACE we initiate the enemies and we move both enemies and HEK in our board
		this.addMouseListener(new MouseInput(handler));


	}//end init

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, getWidth(), getHeight());

		if(handler.getLevel()== Level.Menu) {

			menu.render(g);
		}else {
			//creation objects
			handler.render(g);
		}
		g.dispose();
	}//end paintComponent




	public synchronized void start() {
		if(running) {
			return;
		}
		running = true;
		thread = new Thread(this);
		thread.start();
	}//end start


	public void run() {

		init();

		while(running) {
			//game loop
			move();
			repaint();
			try {
				thread.sleep(20);
			}
			catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}//end run

	public void move() {

		if(handler.getLevel()== Level.Menu) {
			//nothing should be updated
		}else if(handler.getLevel()== Level.Game) {
			handler.move();
		}
	}//end move




	/////////////Getters and Setters\\\\\\\\\\\\\\\

	public static int getWIDTH() {
		return WIDTH;
	}

	public static void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}

	public static int getHEIGHT() {
		return HEIGHT;
	}

	public static void setHEIGHT(int hEIGHT) {
		HEIGHT = hEIGHT;
	}


}//end class
