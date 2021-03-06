import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		if(frames.size() <10)
		{
			frames.add(frame);
		}
		else
		{
			throw new BowlingException();
		}
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
			//poslednji frame
		if(frames.get(frames.size()-1).isSpare() || frames.get(frames.size()-1).isStrike())
			{
				bonus = new Frame(firstThrow, 0);
				frames.add(bonus);
			}
			
		}
	
	public void addBonus()
	{
		for(int i=0; i<frames.size(); i++)
		{
			if(frames.get(i).isStrike())
			{
				bonus = new Frame(frames.get(i+1).getFirstThrow(),frames.get(i+1).getSecondThrow());
				frames.add(bonus);
			}
			else if(frames.get(i).isSpare())
			{
				bonus = new Frame(frames.get(i+1).getFirstThrow(),0);
				frames.add(bonus);
			}
		}
	}
	
	
	// Returns the game score
	public int score() throws BowlingException{
		int score=0;
		for(int i=0; i<frames.size(); i++)
			score+=frames.get(i).score();
		return score;
	}
}
