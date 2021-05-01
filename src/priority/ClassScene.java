//Spring 2021 C201 Group Project 
//Group Member who Completed this Class: Blaine Rudow, Michael Sheppard revised to accomodate ArrayList

package priority;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClassScene implements ActionListener{
	JFrame window = new JFrame("Dungeons & Dragons Character Creator - Class");
	JLabel titleLabel = new JLabel("Character Class Selection:");
	JLabel charLabel = new JLabel( "Character Name: " +  Main.players.get(Main.players.size() - 1).name );
	JLabel raceLabel = new JLabel( "Character Race: " +  Main.players.get(Main.players.size() - 1).race );
	JLabel classLabel = new JLabel("Select Class");
	JTextField classText = new JTextField("");
	JButton nextButton = new JButton("Next");
	JButton previousButton = new JButton("Previous");
	GridLayout gl = new GridLayout();
	ClassScene(){
		
		//Layout stuff
		gl.setRows(7);
		gl.setColumns(1);
		window.setLayout(gl);
		
		//Add listener to buttons
		nextButton.addActionListener(this);
		previousButton.addActionListener(this);
		
		window.add(titleLabel);
		window.add(charLabel);
		window.add(raceLabel);
		window.add(classLabel);
		window.add(classText);
		window.add(previousButton);
		window.add(nextButton);
		
		window.setSize(800,400);
		window.setLocation(500,200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==nextButton ) {
			Main.players.get(Main.players.size() - 1).charClass = classText.getText();
			StatScene s = new StatScene();
		}
		if(ae.getSource()==previousButton ) {
			RaceScene r = new RaceScene();
		}
		window.dispose();
		
	}
}
