import java.util.Random;

import javax.swing.JOptionPane;

public class guessinggame {
public static void main(String[] args) {
	Random jake=new Random();
	int jack = jake.nextInt(100)+1;
	for (int i = 0; i <100; i++)
	{
		String answer= JOptionPane.showInputDialog("guess the Number");
		int cas=Integer.parseInt(answer);
		
		if(cas==jack){
			JOptionPane.showMessageDialog(null , "you got it right");
			i=100;
		}
		if(cas>jack){
			JOptionPane.showMessageDialog(null , "guess another Number");
		}
		if(cas<jack){
			JOptionPane.showMessageDialog(null , "guess a number from 1-100");
		}
	}
}
}
