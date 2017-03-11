import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GamesHandler extends DatabaseHandler
{

	protected GamesHandler(String fileName)
	{
		super(fileName);
	}
	
	public ArrayList<Game> getGames(){
		ArrayList <Game>games = new ArrayList<Game>();
		try {
			Scanner in = new Scanner(dataFile);
			String[] gameData = null;
			while(in.hasNextLine())
			{
				gameData = in.nextLine().split(",");
				Game dummyGame = new Game(
						Integer.parseInt(gameData[0]), gameData[1], gameData[2]
								);
				games.add(dummyGame);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return games;
	}
	
	public boolean addGame(Game game) throws FileNotFoundException
	{
		boolean success = true;
		PrintWriter output = new PrintWriter(new FileOutputStream(dataFile, true));
		Scanner input = new Scanner(dataFile);
		String[] gameData = null;
		while(input.hasNextLine())
		{
			gameData = input.nextLine().split(",");
			Game dummyGame = new Game(Integer.parseInt(gameData[0]), gameData[1], gameData[2]);
			if(dummyGame.getName().equals(game.getName()))
			{
				success = false;
			}
			else if(dummyGame.equals(game))
			{
				success = false;
			}
		}
		if(success)
		{
			if(gameData != null)
			{
				game.setId(Integer.parseInt(gameData[0]) + 1);
			}
			else
			{
				game.setId(1);
			}
			
			output.println(game);
		}
		input.close();
		output.flush();
		output.close();
		return success;
	}
	
	public ArrayList<Game> teacherGames(String tn){
		ArrayList<Game> myGames = getGames();
		
		for(int i = 0; i < myGames.size(); i++)
		{
			if(!myGames.get(i).teacherName.equals(tn))
				myGames.remove(i);
		}
		return myGames;
	}
	
	
	
	
}
	
