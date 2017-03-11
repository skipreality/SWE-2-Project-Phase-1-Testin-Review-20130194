import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class TeacherHome {

	private JFrame frame;
	public JButton createGame; 
	public JButton startGame;
	public JComboBox<String> mygamesList;
	public JComboBox<String> gameList;

	public TeacherHome()
	{
		initialize();
	}


	private void initialize() {
		setFrame(new JFrame());
		getFrame().setTitle("Home");
		getFrame().setBounds(100, 100, 288, 286);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		gameList = new JComboBox();
		gameList.setEditable(true);
		gameList.setBounds(143, 125, 104, 20);
		getFrame().getContentPane().add(gameList);
		
		startGame = new JButton("Start Game");
		startGame.setBounds(20, 124, 104, 23);
		getFrame().getContentPane().add(startGame);
		
		createGame = new JButton("Create Game");
		createGame.setBackground(Color.GREEN);
		createGame.setBounds(55, 30, 163, 40);
		getFrame().getContentPane().add(createGame);
		
		JLabel lblMyGames = new JLabel("My Games");
		lblMyGames.setFont(new Font("Arial", Font.BOLD, 11));
		lblMyGames.setBounds(106, 167, 70, 14);
		frame.getContentPane().add(lblMyGames);
		
		mygamesList = new JComboBox();
		mygamesList.setBounds(90, 189, 112, 20);
		frame.getContentPane().add(mygamesList);
		
		JLabel lblChooseGame = new JLabel("Choose game");
		lblChooseGame.setFont(new Font("Arial", Font.BOLD, 11));
		lblChooseGame.setBounds(158, 106, 78, 14);
		frame.getContentPane().add(lblChooseGame);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
