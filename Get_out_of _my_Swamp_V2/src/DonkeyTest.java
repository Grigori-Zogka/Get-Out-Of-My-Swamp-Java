import static org.junit.Assert.*;

import java.awt.Rectangle;

import org.junit.Test;

public class DonkeyTest {

	@Test
	public void testMove() {
		Donkey d1 = new Donkey(0, 0, null, null);
		float xMin = 0;
		
		
		d1.setxPosition(-10);
		float expectedxMin = xMin;
		float actualXmin =d1.getxPosition();
		

		assertTrue(expectedxMin == actualXmin);
	}


	@Test
	public void testGetId() {
		Donkey d1 = new Donkey(0, 0, null, null);
		ObjectId Donkey = ObjectId.Donkey;
		
		
		ObjectId excpected = ObjectId.Donkey;
		d1.setId(Donkey);
		ObjectId actual = d1.getId();
		assertTrue(actual == excpected);
	}

	@Test
	public void testSetId() {
		
		Donkey d1 = new Donkey(0, 0, null, null);
		ObjectId Donkey = ObjectId.Donkey;
		d1.setId(Donkey);
		
		ObjectId excpected = ObjectId.Donkey;
		ObjectId  actual = d1.getId();
		assertTrue(actual == excpected);
	}

	@Test
	public void testGetxPosition() {
		Donkey d1 = new Donkey(0, 0, null, null);
		float x =100;
		
		float expected = x;
		d1.setxPosition(x);
		float actual = d1.getxPosition();
		

		assertTrue(actual == expected);
	}

	@Test
	public void testSetxPosition() {
		
		Donkey d1 = new Donkey(0, 0, null, null);
		float x =100;
		
		d1.setxPosition(x);
		
		float expected = x;
		float actual = d1.getxPosition();
		
		assertTrue(actual == expected);
	}

	@Test
	public void testGetyPosition() {
		Donkey d1 = new Donkey(0, 0, null, null);
		float y =100;
		
		float expected = y;
		d1.setyPosition(y);
		float actual = d1.getyPosition();
		

		assertTrue(actual == expected);
	}

	@Test
	public void testSetyPosition() {
		
		Donkey d1 = new Donkey(0, 0, null, null);
		float y =100;
		
		d1.setyPosition(y);
		
		float expected = y;
		float actual = d1.getyPosition();
		
		assertTrue(actual == expected);
		
	}

}
