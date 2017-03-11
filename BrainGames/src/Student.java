
public class Student extends User
{

	public Student(int id, String userName, String password, String name, String type)
	{
		super(id, userName, password, name, type);
	}
	
	public Student(String userName, String password, String name, String type)
	{
		super(userName, password, name, type);
	}

}
