
public class Teacher extends User
{

	public Teacher(int id, String userName, String password, String name, String type)
	{
		super(id, userName, password, name, type);
	}
	
	public Teacher(String userName, String password, String name, String type)
	{
		super(userName, password, name, type);
	}

}
