import java.io.File;

public class DatabaseHandler
{
	protected File dataFile;

	protected void setFile(String fileName)
	{
		dataFile = new File(fileName);
	}
	
	protected File getFile()
	{
		return dataFile;
	}
	
	protected DatabaseHandler(String fileName)
	{
		dataFile = new File(fileName);
	}
	
	
}
