package JFrames;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tryagain {
	
	private	JFrame ourFrame = new JFrame("Subscribe");
		
		Tryagain(){
		ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ourFrame.setBounds(200, 100, 400, 200);
		
		Container container = ourFrame.getContentPane();
		container.setLayout(null);
		
		JLabel logo = new JLabel("Subscribe to www.freecodecamp.org");
		logo.setBounds(60,5,250,30);
		
		JLabel name_label = new JLabel("Name :");
		name_label.setBounds(20,30,250,30);
		
		JLabel email = new JLabel("Email :");
		email.setBounds(20,60,250,30);
		
		JTextField nameText = new JTextField();
		nameText.setBounds(65,30,250,30);
		
		JTextField emailText = new JTextField();
		emailText.setBounds(65,60,250,30);
		
		JButton sub = new JButton("Subscribe");
		sub.setBounds(150,90,100,30);
		
		
		container.add(logo);
		container.add(name_label);
		container.add(email);
		container.add(nameText);
		container.add(emailText);
		container.add(sub);
		ourFrame.setVisible(true);
		}

	}



