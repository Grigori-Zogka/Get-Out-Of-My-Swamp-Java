import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class KeyInput extends KeyAdapter {
	//instantiate Handler class
	Handler handler;

	public static int Velocity = 200;//movement coordinates that change with every movement

	//constructor - passing in Handler class 
	public KeyInput(Handler handler) {
		this.handler = handler;


	}//end KeyInput

	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		//1 to 3 chance to summon a creature every time the player moves
		if(key == KeyEvent.VK_SPACE) {
			Random summonRand = new Random();
			int summon = summonRand.nextInt(3);

			if (summon == 1) {
				handler.createlevel();
				System.out.println("msummon chance-"+  summon);

			}//if
		}//if


		//generate random movement for every summoned creature in the swamp
		for(int i = 0; i <handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);	

			if(key == KeyEvent.VK_SPACE){	

				//generate a random number to determine the movement direction of the objects
				Random movementRand = new Random();
				int movement = movementRand.nextInt(8);
				System.out.println("move - "+  movement);

				if (tempObject.getId() == ObjectId.Donkey ) {


					if (movement == 0) {tempObject.setxPosition(tempObject.getxPosition()-Velocity);
					break;
					}//up 
					if (movement == 1) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);
					tempObject.setyPosition(tempObject.getyPosition()-Velocity);//-
					break;
					}//right-up
					if (movement == 2) {tempObject.setyPosition(tempObject.getyPosition()+Velocity);
					break;
					}//right
					if (movement == 3) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);
					tempObject.setyPosition(tempObject.getyPosition()+Velocity);
					break;
					}//right-dawn
					if (movement == 4) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);
					break;
					}//down
					if (movement == 5) {//tempObject.setVelY(-Velocity);
						tempObject.setxPosition(tempObject.getxPosition()+Velocity);//+
						tempObject.setyPosition(tempObject.getyPosition()-Velocity);
						break;
					}//left- down
					if (movement == 6) {tempObject.setxPosition(tempObject.getxPosition()-Velocity);
					break;
					}//left

					else{tempObject.setxPosition(tempObject.getxPosition()-Velocity);//-
					tempObject.setyPosition(tempObject.getyPosition()-Velocity);//-
					break;
					}//left-up
				}//end if
			}//donkey
		}//end for

		///OGRE move
		//generate random movement for every summoned creature in the swamp
		for(int i = 0; i <handler.object.size(); i++) {


			GameObject tempObject = handler.object.get(i);

			System.out.println("Object-"+   handler.object.get(i));
			System.out.println("Array size-"+   handler.object.size());		

			if(key == KeyEvent.VK_SPACE){	

				//generate a random number to determine the movement direction of the objects
				Random movementRand = new Random();
				int movement = movementRand.nextInt(8);
				System.out.println("move - "+  movement);

				if (tempObject.getId() == ObjectId.Ogre ) {


					if (movement == 0) {tempObject.setxPosition(tempObject.getxPosition()-Velocity);
					break;
					}//up 
					if (movement == 1) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);
					tempObject.setyPosition(tempObject.getyPosition()-Velocity);//-
					break;

					}//right-up
					if (movement == 2) {tempObject.setyPosition(tempObject.getyPosition()+Velocity);
					break;

					}//right
					if (movement == 3) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);
					tempObject.setyPosition(tempObject.getyPosition()+Velocity);
					break;

					}//right-dawn
					if (movement == 4) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);
					break;
					}//down
					if (movement == 5) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);//+
					tempObject.setyPosition(tempObject.getyPosition()-Velocity);
					break;
					}//left- down
					if (movement == 6) {tempObject.setxPosition(tempObject.getxPosition()-Velocity);
					break;
					}//left

					else{tempObject.setxPosition(tempObject.getxPosition()-Velocity);//-
					tempObject.setyPosition(tempObject.getyPosition()-Velocity);//-
					break;
					}//left-up
				}//end if
			}//Ogre
		}//end for

		//PARROT
		//generate random movement for every summoned creature in the swamp
		for(int i = 0; i <handler.object.size(); i++) {


			GameObject tempObject = handler.object.get(i);

			System.out.println("Object-"+   handler.object.get(i));
			System.out.println("Array size-"+   handler.object.size());		

			if(key == KeyEvent.VK_SPACE){	

				//generate a random number to determine the movement direction of the objects
				Random movementRand = new Random();
				int movement = movementRand.nextInt(8);
				System.out.println("move - "+  movement);

				if (tempObject.getId() == ObjectId.Parrot ) {


					if (movement == 0) {tempObject.setxPosition(tempObject.getxPosition()-Velocity);
					break;
					}//up 
					if (movement == 1) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);
					tempObject.setyPosition(tempObject.getyPosition()-Velocity);//-
					break;

					}//right-up
					if (movement == 2) {tempObject.setyPosition(tempObject.getyPosition()+Velocity);
					break;

					}//right
					if (movement == 3) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);
					tempObject.setyPosition(tempObject.getyPosition()+Velocity);
					break;

					}//right-dawn
					if (movement == 4) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);
					break;
					}//down
					if (movement == 5) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);//+
					tempObject.setyPosition(tempObject.getyPosition()-Velocity);
					break;
					}//left- down
					if (movement == 6) {tempObject.setxPosition(tempObject.getxPosition()-Velocity);
					break;
					}//left

					else{tempObject.setxPosition(tempObject.getxPosition()-Velocity);//-
					tempObject.setyPosition(tempObject.getyPosition()-Velocity);//-
					break;
					}//left-up
				}//end if
			}//Parrot
		}//end for

		//generate random movement for every summoned creature in the swamp
		for(int i = 0; i <handler.object.size(); i++) {


			GameObject tempObject = handler.object.get(i);

			System.out.println("Object-"+   handler.object.get(i));
			System.out.println("Array size-"+   handler.object.size());		

			if(key == KeyEvent.VK_SPACE){	

				//generate a random number to determine the movement direction of the objects
				Random movementRand = new Random();
				int movement = movementRand.nextInt(8);
				System.out.println("move - "+  movement);

				if (tempObject.getId() == ObjectId.Snake ) {


					if (movement == 0) {tempObject.setxPosition(tempObject.getxPosition()-Velocity);
					break;
					}//up 
					if (movement == 1) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);
					tempObject.setyPosition(tempObject.getyPosition()-Velocity);//-
					break;

					}//right-up
					if (movement == 2) {tempObject.setyPosition(tempObject.getyPosition()+Velocity);
					break;

					}//right
					if (movement == 3) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);
					tempObject.setyPosition(tempObject.getyPosition()+Velocity);
					break;

					}//right-dawn
					if (movement == 4) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);
					break;
					}//down
					if (movement == 5) {tempObject.setxPosition(tempObject.getxPosition()+Velocity);//+
					tempObject.setyPosition(tempObject.getyPosition()-Velocity);
					break;
					}//left- down
					if (movement == 6) {tempObject.setxPosition(tempObject.getxPosition()-Velocity);
					break;
					}//left

					else{tempObject.setxPosition(tempObject.getxPosition()-Velocity);//-
					tempObject.setyPosition(tempObject.getyPosition()-Velocity);//-
					break;
					}//left-up
				}//end if
			}//Snake
		}//end for
	}//end keyPressed         


	public void keyReleased(KeyEvent e) {

		int key = e.getKeyCode();

		//1 to 3 chance to summon a creature every time the player moves
		if(key == KeyEvent.VK_SPACE) {

			int summon = 0;//no creature is being summoned

			if (summon == 1) {
				handler.createlevel();
				System.out.println("msummon-"+  summon);

			}//if
		}//if



		//generate random movement for every summoned creature in the swamp
		for(int i = 0; i < handler.object.size(); i++) {


			if(key == KeyEvent.VK_SPACE){


				GameObject tempObject = handler.object.get(i);

				Random movementRand = new Random();
				int movement = movementRand.nextInt(8);
				//System.out.println("move-"+  movement);

				if (movement == 0) {tempObject.setyPosition(tempObject.getyPosition());
				break;
				}//up 
				if (movement == 1) {tempObject.setxPosition(tempObject.getxPosition());
				tempObject.setyPosition(tempObject.getyPosition());//-
				break;

				}//right-up
				if (movement == 2) {tempObject.setxPosition(tempObject.getxPosition());
				break;

				}//right
				if (movement == 3) {tempObject.setxPosition(tempObject.getxPosition());
				tempObject.setyPosition(tempObject.getyPosition());
				break;

				}//right-dawn
				if (movement == 4) {tempObject.setyPosition(tempObject.getyPosition());
				break;
				}//down
				if (movement == 5) {tempObject.setxPosition(tempObject.getxPosition());//+
				tempObject.setyPosition(tempObject.getyPosition());
				break;
				}//left- down
				if (movement == 6) {tempObject.setxPosition(tempObject.getxPosition());
				break;
				}//left

				else{tempObject.setxPosition(tempObject.getxPosition());//-
				tempObject.setyPosition(tempObject.getyPosition());//-
				break;
				}//left-up
			}//end if
		}//end for
	}//end  method




}///end class
