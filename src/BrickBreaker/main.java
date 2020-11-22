package BrickBreaker;

import java.awt.AWTException;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) throws AWTException {
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10, 10, 707, 607);
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
		
		

	}

}
