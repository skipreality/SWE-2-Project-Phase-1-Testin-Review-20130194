import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TrueFalseGame extends Game 
{

	public ArrayList<String> q_a;
	
	public HashMap<String, String> q_a2 = new HashMap<String, String>();
	
	
	
	public void loadGame()
	{
		try {
			Scanner in = new Scanner(gameData);
			String Q , A;
			while(in.hasNextLine())
			{
				Q = in.nextLine();
				A = in.nextLine();
				
				q_a.add(Q);
				q_a.add(A);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	public TrueFalseGame(int id, String name, String teacherName)
	{
		super(id , name , teacherName);
		gameData = new File("Games/" + name +".txt");
		q_a = new ArrayList<String>();
		score = 0;
	}
	
	public TrueFalseGame() {
		// TODO Auto-generated constructor stub
	}

	
	
	public void addQuestion_Answer(String q, String a)
	{
		q_a2.put(q, a);
	}
	
	public void writeGame() throws FileNotFoundException
	{
		PrintWriter output = new PrintWriter(new FileOutputStream("Games/"+ name + ".txt", true));
		for(String key: q_a2.keySet())
		{
			output.println(key);
			output.println(q_a2.get(key));
		}
		output.close();
	}
	
	
	
	
	
	
}
