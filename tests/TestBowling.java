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
	}
	
	@Test(expected = BowlingException.class)
	public void test_invalid_number_of_pins2() throws BowlingException
	{
		Frame frame = new Frame(2,10);
	}

}
