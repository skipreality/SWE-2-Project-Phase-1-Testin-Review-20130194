import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TeacherController extends Controller
{
	protected GamesHandler gamesTable;
	private CreateGameForm gameForm;
	
	
	
	
	public TeacherController() 
	{
		super();
		gamesTable = new GamesHandler("games.txt");
	}
	
	public void setTeacherHomeButtons()
	{
		

		tHome.createGame.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				gameForm.getFrame().setVisible(true);
				
			}
			
		});
			tHome.startGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int selected = tHome.gameList.getSelectedIndex();
				String gamePath = "Games/" + allGames.get(selected).id;
				currentGame = new TrueFalseGame(
						allGames.get(selected).id,
						allGames.get(selected).name,
						allGames.get(selected).teacherName
						);
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
	
	public void setCreateGameButtonEvents() throws FileNotFoundException
	{
		
		gameForm.btnAddQuestion.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				TrueFalseGame game = new TrueFalseGame();
				String qa[] = gameForm.getQA();
				game.setName(qa[0]);
				game.addQuestion_Answer(qa[1], qa[2]);
				try {
					game.setTeacherName(user.name);
					game.writeGame();
					gamesTable.addGame(game);
					gameForm.qText.setText("");
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	
	
	
	public boolean createGame(Game game) throws FileNotFoundException
	{
		game.setTeacherName(user.name);
		return gamesTable.addGame(game);
	}


	public CreateGameForm getGameForm() {
		return gameForm;
	}


	public void setGameForm(CreateGameForm gameForm) {
		this.gameForm = gameForm;
	}
	
}
