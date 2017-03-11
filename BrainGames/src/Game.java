import java.io.File;

public class Game
{
	protected int id;
	protected String name;
	protected String teacherName;
	int score;
	
	
	public File gameData;

	protected String getTeacherName() {
		return teacherName;
	}
	protected void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	protected int getId() {
		return id;
	}
	protected String getName() {
		return name;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected void setName(String name) {
		this.name = name;
	}
	
	
	public Game(){};
	
	public Game(String name, String teacherName) 
	{
		this.name = name;
		this.teacherName = teacherName;
	}
	public Game(String name) 
	{
		this.name = name;
	}
	
	public Game(int id, String name, String teacherName) 
	{
		this.id = id;
		this.name = name;
		this.teacherName = teacherName;
	}
	
	
	@Override
	public String toString() {
		return id + "," + name + "," + teacherName;
	}

	
	
}
