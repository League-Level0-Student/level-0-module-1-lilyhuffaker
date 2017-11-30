import javax.swing.JOptionPane;

public class ChatRoomm {
public static void main(String[] args) {
String Password=JOptionPane.showInputDialog("Computer: Please Create Account Password.");	
JOptionPane.showMessageDialog(null, "Computer: Dont share your password to others!");
String Login=JOptionPane.showInputDialog("Computer: Would You Like To Log In?"); 
if(Login.equals("yes")) {
	String Attempt=JOptionPane.showInputDialog("Computer: Please Enter Your Password");
	if(Attempt.equals(Password)) {
		JOptionPane.showMessageDialog(null, "Computer: Welcome to the Chat Room.");
	}else {
		JOptionPane.showMessageDialog(null, "Computer: Your password is incorrect.");
	}
}else {
	JOptionPane.showMessageDialog(null, "Computer: Ok, please Login some other time.");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
