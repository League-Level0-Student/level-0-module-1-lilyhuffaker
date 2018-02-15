import org.jointheleague.graphical.robot.Robot;

public class ValentinesCheezase {
public static void main(String[] args) {
Robot Carl = new Robot("batman");	
Carl.setWindowImage("Art(Rune).jpg");
Carl.setSpeed(5);	
Carl.turn(180);
Carl.move(150);
Carl.turn(155);
Carl.setPenWidth(7);
Carl.penDown();
Carl.setPenColor(0,255,0);
Carl.move(200);
Carl.setAngle(0);
for(int i=0;i<180;i++) {
	Carl.setSpeed(50000);
	Carl.move(1);
	Carl.turn(1);
	
	
}
Carl.turn(180);
for(int i=0;i<180;i++) {
	Carl.setSpeed(50000);
	Carl.move(1);
	Carl.turn(1);


}
Carl.setSpeed(5);
Carl.setAngle(205);
Carl.move(200);
Carl.setAngle(270);
Carl.move(60);
Carl.penUp();
Carl.move(100);
Carl.turn(180);
Carl.sparkle();
}
}
	
	
	
	
	

