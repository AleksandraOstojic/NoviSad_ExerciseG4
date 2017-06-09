import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void test_initializaton() 
	{
		Frame frame = new Frame(3,4);
		assertNotNull(frame);
	}
	
	@Test(expected = BowlingException.class)
	public void test_invalid_number_of_pins() throws BowlingException
	{
		Frame frame = new Frame(10,2);
		frame.score();
	}
	
	@Test(expected = BowlingException.class)
	public void test_invalid_number_of_pins2() throws BowlingException
	{
		Frame frame = new Frame(2,10);
		frame.score();
	}
	
	@Test
	public void test_strike_method() {
		Frame frame = new Frame(10,0);
		assertTrue(frame.isStrike());
	}
	@Test
	public void test_spare_method() {
		Frame frame = new Frame(6,4);
		assertTrue(frame.isSpare());
	}
	
	@Test
	public void test_score_method() throws BowlingException{
		Frame frame = new Frame(2,3);
		assertEquals(5, frame.score());
	}
	
	@Test
	public void test_game_when_is_strike() throws BowlingException
	{
		Frame frame = new Frame(10,0);
		BowlingGame game = new BowlingGame();
		game.addFrame(frame);
		game.addFrame(new Frame(3,4));
		assertEquals(17, game.score());
		
	}
	@Test
	public void test_game_when_is_spare() throws BowlingException
	{
		Frame frame = new Frame(9,1);
		BowlingGame game = new BowlingGame();
		game.addFrame(frame);
		game.addFrame(new Frame(3,4));
		assertEquals(17, game.score());
		
	}

}
