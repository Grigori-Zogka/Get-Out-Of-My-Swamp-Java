import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JOptionPane;

public class Ogre  extends GameObject{
	//object dimensions
	private int width = 200, height =200;//rectangle  dimentions
	int health  = 3;//setting up the Ogre's health - the health is being lowered by 1 every time 
	//				there is a collision with an enemy - if health = 0 then Hek is dead.
	Handler handler;

	public Ogre(float xPosition, float yPosition, Handler handler, ObjectId id) {
		super(xPosition, yPosition, id);
		this.handler = handler;
		// TODO Auto-generated constructor stub
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

			if(tempObject.getId() == Id.Donkey ||
					tempObject.getId() == Id.Parrot || 
					tempObject.getId() == Id.Snake
					) {

				if(getBounds().intersects(tempObject.getBounds())){

					this.health = health-2;
					System.out.println("Hek health - " + health);	

					if( this.health == 0) {

						handler.removeObject(this);
						handler.setState(State.dead);//set game state to dead
						System.out.println("Hek is dead!");
						JOptionPane.showMessageDialog(null, "HEK is dead!", "GAME OVER",JOptionPane.INFORMATION_MESSAGE);

					}this.health = health + 1;
					System.out.println("Hek health - " + health);

				}//end if 
			}//end if 

		}//end for
	}//end collision

	@Override
	public void render(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect  ((int)xPosition,(int)yPosition, width, height); //casting floats to integers

		//drawing object in 2D order to set collisions parameters
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.BLUE);//draw outlay on the objects
		g2d.draw(getBounds());//draw collision bounds on the object

	}

	//setting collision bounds on the object
	public Rectangle getBounds() {

		return new Rectangle((int)xPosition,(int)yPosition, width, height);//casting floats to integers
	}



	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
