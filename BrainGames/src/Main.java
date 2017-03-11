import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class Main 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		TeacherHome tHome = new TeacherHome();
		StudentHome sHome = new StudentHome();
		LoginWindow w = new LoginWindow();
		CreateGameForm gForm = new CreateGameForm();
		TFGameForm tfGame = new TFGameForm();
		RegistrationForm r = new RegistrationForm();
		
		Controller controller = new Controller();
		
		TeacherController tController = new TeacherController();
		
		tController.setGameTF(tfGame);
		tController.setGameForm(gForm);
		tController.setCreateGameButtonEvents();
		tController.setLoginWindow(w);
		tController.openLoginWindow();
		tController.setRegForm(r);
		tController.setSHome(sHome);
		tController.setTHome(tHome);

		tController.setGameButtons();
		
		tController.setStudentHomeListenner();
		
		tController.setLoginButtonEvents();
		tController.setRegFormButtonEvents();
		tController.setTeacherHomeButtons();

		
		
		
		
		
		
		
		
		

	}

}
