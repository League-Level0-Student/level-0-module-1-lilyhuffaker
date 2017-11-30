import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
	int Score=0;
	String Answerone=JOptionPane.showInputDialog("If I drink, I die. If I eat I'm fine. What am I?");
	if(Answerone.equals("Fire")) {
		JOptionPane.showMessageDialog(null, "Nice! One down and sevral more to go!");
		Score++;
	}else {
		JOptionPane.showMessageDialog(null, "Sorry. that Is incorrect.");
		Score--;
	}
	String Answertwo=JOptionPane.showInputDialog("What can you catch but never throw?");
	if(Answertwo.equals("A Cold")){
		JOptionPane.showMessageDialog(null, "Not bad, can you try this one?");
		Score++;
	}else {
		JOptionPane.showMessageDialog(null, "Sorry, Um try again on the next one...");
		Score--;
	}
	JOptionPane.showMessageDialog(null, "Hah Lol there are no more riddles. Your final score was\n" +Score);
	}
}

