import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JOptionPane;

public class Parrot extends GameObject {

	//object dimensions
		private int width = 200, height =200;
		Handler handler;
		
	public Parrot(float xPosition, float yPosition, Handler handler, ObjectId id) {
		super(xPosition, yPosition, id);
		this.handler = handler;
	}

	@Override
	public void move() {
		
		//collision against walls
		if(xPosition<=0) {
			
			xPosition = 0;
		}
		if(xPosition>=600) {
			
			xPosition =600;
		}
		if(yPosition<=0) {
			
			yPosition = 0;
		}
		if(yPosition>=600) {
			
			yPosition=600;
		}
		//collision against other objects	
		collision();
	}//end move
	
	public void collision() {

		for(int i=0; i < handler.object.size(); i++) {

			GameObject tempObject = handler.object.get(i);
			if(tempObject.getId() == Id.Ogre) {
				
			
			if(getBounds().intersects(tempObject.getBounds())){
				
				System.out.println("Parrot is dead!");
				JOptionPane.showMessageDialog(null, "HEK killed the Parrot", "Fight",JOptionPane.INFORMATION_MESSAGE);
				handler.removeObject(this);
			}//end if 

			}//end if 	
		}//end for
	}//end collision

	@Override
	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval((int)xPosition,(int)yPosition, width, height); //casting floats to integers

		//drawing object in 2D order to set collisions parameters
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.BLUE);//draw outlay on the objects
		g2d.draw(getBounds());//draw collision bounds on the object


	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle((int)xPosition,(int)yPosition, width, height);//casting floats to integers
		
	}

	
}
