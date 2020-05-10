
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public abstract class GameObject {
	
	
	protected float xPosition;
	protected float yPosition;
	protected ObjectId Id;
	
	
	


	public GameObject(float xPosition2, float yPosition2, ObjectId id ) {
		
		this.setxPosition(xPosition2);
	    this.setyPosition(yPosition2);
	    this.setId(id);
	}

	
	public abstract void move();
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds();
	
	
	
	
/////////////Getters and Setters\\\\\\\\\\\\\\\
	
	public ObjectId getId() {
		return Id;
	}


	public void setId(ObjectId id) {
		Id = id;
	}
	
	public float getxPosition() {
		return xPosition;
	}


	public void setxPosition(float xPosition2) {
		this.xPosition = xPosition2;
	}


	public float getyPosition() {
		return yPosition;
	}


	public void setyPosition(float yPosition2) {
		this.yPosition = yPosition2;
	}
	
	

}//end GameObject
