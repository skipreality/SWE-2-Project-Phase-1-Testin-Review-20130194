import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class UsersHandler extends DatabaseHandler
{

	protected UsersHandler(String fileName) 
	{
		super(fileName);
	}
	
	public boolean checkUsername(User user) throws FileNotFoundException
	{
		Scanner input = new Scanner(dataFile);
		String[] userData = null;
		while(input.hasNextLine())
		{
			userData = input.nextLine().split(",");
			User dummyUser = new User(Integer.parseInt(userData[0]), userData[1], userData[2], userData[3], userData[4]);
			if(dummyUser.getUserName().equals(user.getUserName()))
			{
				input.close();
				return true;
			}
		}
		input.close();
		return false;
	}
	
	public boolean checkUser(User user) throws FileNotFoundException
	{
		Scanner input = new Scanner(dataFile);
		String[] userData = null;
		while(input.hasNextLine())
		{
			userData = input.nextLine().split(",");
			User dummyUser = new User(Integer.parseInt(userData[0]), userData[1], userData[2], userData[3], userData[4]);
			if(dummyUser.getUserName().equals(user.getUserName()) && dummyUser.getPassword().equals(user.getPassword()) && dummyUser.getType().equals(user.getType()))
			{
				input.close();
				return true;
			}
		}
		input.close();
		return false;
	}
	
	public User selectUser(String username, String password) throws FileNotFoundException
	{
		User user = null;
		Scanner input = new Scanner(dataFile);
		String[] userData = null;
		while(input.hasNextLine())
		{
			userData = input.nextLine().split(",");
			User dummyUser = new User(Integer.parseInt(userData[0]), userData[1], userData[2], userData[3], userData[4]);
			if(dummyUser.getUserName().equals(username) && dummyUser.getPassword().equals(password))
			{
				user = dummyUser;
				input.close();
                               
				return user;
                                
			}
		}
		input.close();
		return user;
	}
	
	public boolean addUser(User user) throws FileNotFoundException
	{
		boolean success = true;
		PrintWriter output = new PrintWriter(new FileOutputStream(dataFile, true));
		Scanner input = new Scanner(dataFile);
		String[] userData = null;
		while(input.hasNextLine())
		{
			userData = input.nextLine().split(",");
			User dummyUser = new User(Integer.parseInt(userData[0]), userData[1], userData[2], userData[3], userData[4]);
			if(dummyUser.getUserName().equals(user.getUserName()))
			{
				success = false;
			}
			else if(dummyUser.equals(user))
			{
				success = false;
			}
		}
		if(success)
		{
			if(userData != null)
			{
				user.setId(Integer.parseInt(userData[0]) + 1);
			}
			else
			{
				user.setId(1);
			}
			
			output.println(user);
		}
		input.close();
		output.flush();
		output.close();
		return success;
	}
	
	
}
