import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controller implements ActionListener
{
	protected UsersHandler usersTable;
	protected LoginWindow loginWindow;
	protected RegistrationForm regForm;
	protected StudentHome sHome;
	protected TeacherHome tHome;
	protected TFGameForm gameTF;
	protected User user;
	protected GamesHandler gameHandler;
	protected TrueFalseGame currentGame;
	
	public int gameCounter= 0;
	public String A = "" , Q = "";
	
	protected ArrayList<Game> allGames = new ArrayList<Game>();
	
	public void setGameButtons()
	{
		gameTF.submitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int x = gameTF.bg.getSelection().getMnemonic();
				//System.out.println((char)x);
				if(A.equals(""+(char)x ))
				{
					//System.out.println(gameTF.bg.getSelection().getMnemonic() );
					currentGame.score++;
				}
				
				gameCounter+=2;
				if(gameCounter >= currentGame.q_a.size())
					{
						gameTF.displayQ.setText("You Scored : " + currentGame.score + "/"+ currentGame.q_a.size()/2);
						gameTF.submitButton.setEnabled(false);
						Q = "";
						A = "";
						gameCounter = 0;
					}
				else
				{
					Q = currentGame.q_a.get(gameCounter);
					A = currentGame.q_a.get(gameCounter + 1);
					gameTF.displayQ.setText(Q);
				}
			}
		});
	}
	
	

	
	public void setStudentHomeListenner(){
		sHome.startGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int selected = sHome.gameList.getSelectedIndex();
				String gamePath = "Games/" + allGames.get(selected).id;
				currentGame = new TrueFalseGame(
						allGames.get(selected).id,
						allGames.get(selected).name,
						allGames.get(selected).teacherName
						);
				gameTF.submitButton.setEnabled(true);
				currentGame.loadGame();
				gameTF.getFrame().setVisible(true);
				
				if(Q != currentGame.q_a.get(gameCounter))
				{
					Q = currentGame.q_a.get(gameCounter);
					A = currentGame.q_a.get(gameCounter + 1);
					gameTF.displayQ.setText(Q);
				}
				
				
			}
		});
		
	}
	
	public boolean register() throws FileNotFoundException
	{
		return usersTable.addUser(user);
	}
	
	public void openLoginWindow()
	{
		loginWindow.getFrame().setVisible(true);
	}
	
	public void setLoginButtonEvents()
	{
		loginWindow.btnLogin.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setUser(new User(loginWindow.getUserNameTextField().getText(), loginWindow.getPasswordTextField().getText(), loginWindow.typeList.getSelectedItem().toString()));
				try 
				{
					if(usersTable.checkUser(user))
					{
						setUser(usersTable.selectUser(loginWindow.getUserNameTextField().getText(), loginWindow.getPasswordTextField().getText()));
						loginWindow.getFrame().setVisible(false);
						allGames = gameHandler.getGames();
						if(user.type.equalsIgnoreCase("student"))
						{
							
							sHome.getFrame().setVisible(true);
							sHome.getFrame().setTitle("Welcome! " + user.name);
							for(int i = 0; i < allGames.size(); i++)
								sHome.gameList.addItem(allGames.get(i).name);
							
							
						}
						else
						{
							tHome.getFrame().setVisible(true);
							tHome.getFrame().setTitle("Welcome! " + user.name);

							for(int i = 0; i < allGames.size(); i++)
								tHome.gameList.addItem(allGames.get(i).name);
							
							ArrayList<Game> myGames = gameHandler.teacherGames(user.name);
							
							for(int i = 0; i< myGames.size(); i++)
								tHome.mygamesList.addItem(myGames.get(i).name);

						}
						
						
						
					}
					else
					{
						JOptionPane.showMessageDialog(loginWindow.getFrame(), "Username/Password is incorrect");
					}
					
				} catch (FileNotFoundException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		
		
		
		loginWindow.btnRegister.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				regForm.getFrame().setVisible(true);
			}
		});
		
		
	}
	
	
	public void setRegFormButtonEvents()
	{
		regForm.btnRegister.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				setUser(regForm.getUser());
				try
				{
					register();
					JOptionPane.showMessageDialog(regForm.getFrame(), "Account has been created!");
					regForm.getFrame().setVisible(false);
					
				}
				catch(FileNotFoundException e)
				{
					System.out.println("File not found!");
				}
				
			}
			
		});
	}
	
	public boolean signIn() throws FileNotFoundException
	{
		
		return usersTable.checkUser(user);
	}
	
	

	
	
	
	
	
	
	
	public Controller()
	{
		usersTable = new UsersHandler("users.txt");
		 gameHandler = new GamesHandler("games.txt");
	}
	
	public void setRegForm(RegistrationForm form)
	{
		regForm = form;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	protected UsersHandler getUsersTable() {
		return usersTable;
	}

	protected LoginWindow getLoginWindow() {
		return loginWindow;
	}

	protected void setUsersTable(UsersHandler usersTable) {
		this.usersTable = usersTable;
	}

	protected void setLoginWindow(LoginWindow loginWindow) {
		this.loginWindow = loginWindow;
	}
	
	protected void setSHome(StudentHome home)
	{
		sHome = home;
	}
	protected void setTHome(TeacherHome home)
	{
		tHome = home;
	}
	public void setGameTF(TFGameForm gameTF) {
		this.gameTF = gameTF;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	
}
