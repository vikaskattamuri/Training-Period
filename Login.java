import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Login extends JFrame{
	
	JLabel username,password,welcome;
	
	public Login()
	{
	
		
		welcome =new JLabel("Welcome to Login Page");
		welcome.setBounds(180, 10, 20, 50);
		add(welcome);
		
		username =new JLabel("Username");
		username.setBounds(55, 30, 20,50);
		add(username);
		
		password =new JLabel("Password");
		password.setBounds(100, 30, 20, 50);
		add(password);
		
		
		JTextField user=new JTextField(15);
		user.setBounds(100, 75, 20, 50);
		add(user);
		
		setSize(500,500);
		setLocation(200, 220);
		
		setLayout(null);
		setBackground(Color.cyan);
		setVisible(true);
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
			new Login();
	}
}
