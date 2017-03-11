
public class User 
{
	protected int id;
	protected String userName;
	protected String password;
	protected String name;
	protected String type;
	
	protected String getType() {
		return type;
	}
	protected void setType(String type) {
		this.type = type;
	}
	protected int getId() {
		return id;
	}
	protected String getUserName() {
		return userName;
	}
	protected String getPassword() {
		return password;
	}
	protected String getName() {
		return name;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected void setUserName(String userName) {
		this.userName = userName;
	}
	protected void setPassword(String password) {
		this.password = password;
	}
	protected void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return id + "," + userName + "," + password + "," + name + "," + type;
	}
	
	
	public User(){}
	
	public User(int id, String userName, String password, String name, String type)
	{
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.type = type;
	}
	
	public User(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}
	
	public User(String userName, String password, String name, String type)
	{
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.type = type;
	}
	
	public User(String userName, String password, String type)
	{
		this.userName = userName;
		this.password = password;
		this.type = type;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	};
	
	
	
	

}
