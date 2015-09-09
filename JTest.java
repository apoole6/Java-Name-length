import java.awt.Component;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JTest {

	  public static void main(String[] args) {
		  
		  Scanner keyboard = new Scanner(System.in); /* Sets up scanner class for keyboard input */
		  
		 JFrame frame = new JFrame("Myframe"); /* Construct frame */
		  
		  
		  
		  
		  String first_name = JOptionPane.showInputDialog(frame, "What is your first name?"); /* Users' first name */
		  
		  
		  String last_name = JOptionPane.showInputDialog(frame, "What is your last name?"); /* Users' last name */
		  
		  
		  String full_name;
		  full_name = first_name + last_name; /* Adding first and last name characters for the length of name */
		  
		  
		  
		  
		  JOptionPane.showMessageDialog(
				  null, "You're name has " + full_name.length() + " characters"); /* Concatenate message w/ length of name */
		  System.exit(0);
		  
	  }
}
