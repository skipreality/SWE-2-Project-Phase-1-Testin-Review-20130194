import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class StudentHome {

	private JFrame frame;
	public JComboBox<String> gameList = new JComboBox<String>();
	public JButton startGame = new JButton("Start Game");



	public StudentHome() {
		initialize();
	}


	private void initialize() {
		setFrame(new JFrame());
		getFrame().setTitle("Home");
		getFrame().setBounds(100, 100, 288, 133);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		
		gameList.setEditable(true);
		gameList.setBounds(146, 40, 101, 20);
		getFrame().getContentPane().add(gameList);
		
		
		startGame.setBounds(24, 39, 101, 23);
		getFrame().getContentPane().add(startGame);
	}


	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
