import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class RegistrationForm 
{

	private JFrame frame;
	public JTextField usernameTF;
	public JPasswordField passwordField;
	public JTextField nameTF;
	public JComboBox type;
	public JButton btnRegister; 


	public RegistrationForm()
	{
		initialize();
	}

	
	private void initialize() 
	{
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().getContentPane().setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Arial", Font.BOLD, 11));
		usernameLabel.setBounds(60, 14, 78, 14);
		getFrame().getContentPane().add(usernameLabel);
		
		usernameTF = new JTextField();
		usernameTF.setColumns(10);
		usernameTF.setBounds(148, 11, 234, 20);
		getFrame().getContentPane().add(usernameTF);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 11));
		passwordLabel.setBounds(60, 55, 78, 14);
		getFrame().getContentPane().add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(148, 52, 234, 20);
		getFrame().getContentPane().add(passwordField);
		
		JLabel label_2 = new JLabel("Name:");
		label_2.setFont(new Font("Arial", Font.BOLD, 11));
		label_2.setBounds(60, 96, 78, 14);
		getFrame().getContentPane().add(label_2);
		
		nameTF = new JTextField();
		nameTF.setColumns(10);
		nameTF.setBounds(148, 93, 234, 20);
		getFrame().getContentPane().add(nameTF);
		
		type = new JComboBox();
		type.setModel(new DefaultComboBoxModel(new String[] {"Student", "Teacher"}));
		type.setFont(new Font("Arial", Font.BOLD, 12));
		type.setBounds(174, 124, 89, 20);
		getFrame().getContentPane().add(type);
		
		btnRegister= new JButton("Register");
		btnRegister.setFont(new Font("Arial", Font.BOLD, 11));
		btnRegister.setBounds(174, 192, 89, 23);
		getFrame().getContentPane().add(btnRegister);
		
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public User getUser()
	{
		return new User(usernameTF.getText(), passwordField.getText(), nameTF.getText(), type.getSelectedItem().toString());
	}
	
}
