

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JOptionPane;



public class Handler {

	public LinkedList<GameObject> object = new LinkedList<GameObject>();

	private GameObject tempObject;
	private State state;
	private Level level;

	//handler constructor
	public Handler() {

		state = State.alive;//starting the handler in alive state
		level = Level.Menu;//initiating game with the menu screen
	}//end constructor

	//method to  move all the objects stored in the linkedList in the game window
	public void move() {

		if (this.getState() == State.alive) {
			for(int i  = 0; i< object.size(); i++) {

				tempObject = object.get(i);
				tempObject.move();
			}//for

		} else if (this.getState() == State.dead) {
			clearEnemies();
			state = State.alive;//starting the handler in alive state
			setLevel(level.Menu);

		}//end else

	}//end move

	//this method removes all the objects from the swamp 
	public void clearEnemies(){
		for (int i = 0; i < object.size(); i++){
			GameObject tempObject = object.get(i);
			this.removeObject(tempObject);
			i--;
		}
	}//end clearEnemies


	//method to render object into the frame
	public void render(Graphics g) {

		for(int i  = 0; i< object.size(); i++) {

			tempObject = object.get(i);
			tempObject.render(g);
		}
	}//render


	public void addObject(GameObject object) {
		this.object.add(object);	

	}

	public void removeObject(GameObject object) {
		this.object.remove(object);
	}


	//method to determine that enemy will be summoned in the swamp at position 0,0
	public void createlevel() {

		Random rand = new Random();
		// Add new character to game by 1 in 3 chance

		int type = rand.nextInt(3);
		System.out.println("Enemy type -"+ type);

		if(type == 0) {
			addObject(new Parrot( 0, 0, this, ObjectId.Parrot));
		}
		if(type == 1) {
			addObject(new Donkey( 0, 0, this, ObjectId.Donkey));
		}
		else {
			addObject(new Snake( 0, 0, this, ObjectId.Snake));

		}	

	}//end createlevel()

	public void createOgre() {

		/*
		 * Hek is being summoned randomly at any position of the grid except 0,0
		 * since the grid is 800x800 Ogre's starting coordinates should be a random combination of 200,400,600
		 */
		int[] intArray = {200, 400, 600};

		int xAxis = new Random().nextInt(intArray.length);
		int yAxis = new Random().nextInt(intArray.length);

		addObject(new Ogre( intArray[xAxis], intArray[yAxis], this, ObjectId.Ogre));

	}//end createOgre


	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;

	}


	public Level getLevel() {
		return level;
	}


	public void setLevel(Level level) {
		this.level = level;
	}



}//end class
