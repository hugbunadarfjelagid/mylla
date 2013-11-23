package is.ru.mylla;

import static spark.Spark.*;
import spark.*;

public class Mylla
{
	public static void main(String[] args)
	{
		get(new Route("/mylla"))
		{
			@Override
			public Object handle(Request request, Response response)
			{
				Game game = new Game();
				return game.play();
//				System.out.println(game.play());				
			}
		}
	}
}
