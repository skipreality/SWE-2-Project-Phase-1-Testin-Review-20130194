import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JButton;

public class TFGameForm {

	private JFrame frame;
	public ButtonGroup bg = new ButtonGroup();
	public JTextPane displayQ = new JTextPane();
	public JButton submitButton = new JButton("Submit");

	
	public TFGameForm() {
		initialize();
	}

	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(UIManager.getColor("FormattedTextField.disabledBackground"));
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().getContentPane().setLayout(null);
		
		
		displayQ.setEditable(false);
		displayQ.setFont(new Font("Tahoma", Font.BOLD, 13));
		displayQ.setBackground(UIManager.getColor("FormattedTextField.disabledBackground"));
		displayQ.setForeground(Color.LIGHT_GRAY);
		displayQ.setBounds(10, 26, 414, 121);
		getFrame().getContentPane().add(displayQ);
		
		JRadioButton trueRadio = new JRadioButton("True");
		trueRadio.setMnemonic('T');
		trueRadio.setSelected(true);
		trueRadio.setBounds(35, 186, 109, 23);
		getFrame().getContentPane().add(trueRadio);
		
		JRadioButton falseRadio = new JRadioButton("False");
		falseRadio.setMnemonic('F');
		falseRadio.setBounds(315, 186, 109, 23);
		getFrame().getContentPane().add(falseRadio);
		
		bg.add(trueRadio);
		bg.add(falseRadio);
		
		
		
		submitButton.setBounds(162, 227, 89, 23);
		frame.getContentPane().add(submitButton);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
