import static org.junit.Assert.*;

import org.junit.Test;

public class HandlerTest {

	

	@Test
	public void testGetState() {
		Handler h1 = new Handler();
		Level level = Level.Game;

		Level excpected = Level.Game;
		h1.setLevel(level);
		Level actual = h1.getLevel();
		assertTrue(actual == excpected);
	}

	@Test
	public void testSetState() {
		Handler h1 = new Handler();
		State state = State.alive;
		
		h1.setState(state);
		State excpected = State.alive;
		State actual = h1.getState();
		assertTrue(actual == excpected);
	}

	@Test
	public void testGetLevel() {
		Handler h1 = new Handler();
		Level level = Level.Game;
		
		Level excpected = Level.Game;
		h1.setLevel(level);
		Level actual = h1.getLevel();
		assertTrue(actual == excpected);
	}

	@Test
	public void testSetLevel() {
		Handler h1 = new Handler();
		Level level = Level.Game;
		
		h1.setLevel(level);
		Level excpected = Level.Game;
		Level actual = h1.getLevel();
		assertTrue(actual == excpected);
	}

}
