import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class LoginWindow 
{

	private JFrame frame;
	private JTextField userNameTextField;
	private JPasswordField passwordTextField;
	private JLabel loginLabel;
	public JButton btnLogin;
	public JButton btnRegister;
	public JComboBox typeList;


	public LoginWindow()
	{
		initialize();
	}

	private void initialize()
	{
		setFrame(new JFrame());
		getFrame().getContentPane().setFont(new Font("Arial", Font.BOLD, 12));
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		loginLabel = new JLabel("Please login, if you don't have an account register for free!");
		loginLabel.setFont(new Font("Arial", Font.BOLD, 11));
		loginLabel.setBounds(57, 11, 338, 14);
		getFrame().getContentPane().add(loginLabel);
		
		setUserNameTextField(new JTextField());
		getUserNameTextField().setBounds(129, 65, 234, 20);
		getFrame().getContentPane().add(getUserNameTextField());
		getUserNameTextField().setColumns(10);
		
		JLabel userNameLabel = new JLabel("Username:");
		userNameLabel.setFont(new Font("Arial", Font.BOLD, 11));
		userNameLabel.setBounds(41, 68, 78, 14);
		getFrame().getContentPane().add(userNameLabel);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 11));
		passwordLabel.setBounds(41, 109, 78, 14);
		getFrame().getContentPane().add(passwordLabel);
		
		setPasswordTextField(new JPasswordField());
		getPasswordTextField().setColumns(10);
		getPasswordTextField().setBounds(129, 106, 234, 20);
		getFrame().getContentPane().add(getPasswordTextField());
		
		typeList = new JComboBox();
		typeList.setModel(new DefaultComboBoxModel(new String[] {"Student", "Teacher"}));
		typeList.setFont(new Font("Arial", Font.BOLD, 12));
		typeList.setBounds(170, 137, 89, 20);
		getFrame().getContentPane().add(typeList);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Arial", Font.BOLD, 12));
		btnLogin.setBounds(129, 185, 89, 23);
		getFrame().getContentPane().add(btnLogin);
		
		btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Arial", Font.BOLD, 12));
		btnRegister.setBounds(245, 186, 89, 23);
		getFrame().getContentPane().add(btnRegister);
		
		
		
		
		
	}
	
	
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
		
	
	public void updateLabel(String s)
	{
		loginLabel.setText(s);
	}

	public JTextField getUserNameTextField() {
		return userNameTextField;
	}

	public void setUserNameTextField(JTextField userNameTextField) {
		this.userNameTextField = userNameTextField;
	}

	public JPasswordField getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(JPasswordField passwordTextField) {
		this.passwordTextField = passwordTextField;
	}
	
}
