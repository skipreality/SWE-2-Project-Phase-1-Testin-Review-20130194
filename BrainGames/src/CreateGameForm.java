import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class CreateGameForm
{

	private JFrame frame;
	private JComboBox<String> a_List;
	private JTextField gameNameTextField;
	public JButton btnAddQuestion;
	public JTextPane qText;


	public CreateGameForm() {
		initialize();
	}

	private void initialize() 
	{
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblGameName = new JLabel("Game Name:");
		lblGameName.setFont(new Font("Arial", Font.BOLD, 11));
		lblGameName.setBounds(10, 11, 74, 14);
		getFrame().getContentPane().add(lblGameName);
		
		gameNameTextField = new JTextField();
		gameNameTextField.setBounds(90, 8, 334, 20);
		getFrame().getContentPane().add(gameNameTextField);
		gameNameTextField.setColumns(10);
		
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setFont(new Font("Arial", Font.BOLD, 14));
		lblQuestion.setBounds(183, 39, 89, 14);
		getFrame().getContentPane().add(lblQuestion);
		
		qText = new JTextPane();
		qText.setBounds(10, 62, 414, 103);
		getFrame().getContentPane().add(qText);
		
		a_List = new JComboBox<String>();
		a_List.setFont(new Font("Tahoma", Font.BOLD, 12));
		a_List.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
		a_List.setBounds(183, 212, 67, 20);
		getFrame().getContentPane().add(a_List);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAnswer.setBounds(183, 186, 74, 14);
		getFrame().getContentPane().add(lblAnswer);
		
		btnAddQuestion = new JButton("Add Question");
		btnAddQuestion.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddQuestion.setBounds(307, 228, 117, 23);
		getFrame().getContentPane().add(btnAddQuestion);
		
	}
	
	public String[] getQA()
	{
		String qa[] = new String[3];
		qa[0] = gameNameTextField.getText();
		qa[1] = qText.getText();
		
		if(a_List.getSelectedItem().toString().equals("True"))
		{
			qa[2] = "T";
		}
		else
		{
			qa[2] = "F";
		}
		
		
		return qa;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
}
