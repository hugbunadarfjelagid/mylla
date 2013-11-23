package is.ru.mylla;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTest
{
	@Test
	public void greetResultsInHello()
	{
		Game game = new Game();
		assertEquals("Mylla!", game.play());
	}
}
