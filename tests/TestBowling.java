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

}
