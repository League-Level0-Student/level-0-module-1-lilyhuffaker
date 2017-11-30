import javax.swing.JOptionPane;

public class SecretMessage {
public static void main(String[] args) {
String Password= "Murpy";	
String Message=JOptionPane.showInputDialog("Please enter secret message");
String User=JOptionPane.showInputDialog("Please Enter The Password");
if(User.equals(Password)) {
	JOptionPane.showMessageDialog(null, ""+Message);
}else {
	JOptionPane.showMessageDialog(null, "ERROR!");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
