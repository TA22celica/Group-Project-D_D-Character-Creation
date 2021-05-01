//Spring 2021 C201 Group Project 
//Group Member who Completed this Class: Blaine Rudow

package priority;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RaceScene implements ActionListener{
	JFrame window = new JFrame("Dungeons & Dragons Character Creator - Race");
	JLabel titleLabel = new JLabel("Character Race Selection:");
	JLabel nameLabel = new JLabel( "Character Name: " + Main.players.get(Main.players.size() - 1).name );
	JLabel raceLabel = new JLabel( "Enter Race" );
	JTextField raceText = new JTextField("");
	JButton previousButton = new JButton("Previous");
	JButton nextButton = new JButton("Next");	
	GridLayout gl = new GridLayout();
	RaceScene(){
		
		//Layout stuff
		gl.setRows(6);
		gl.setColumns(1);
		window.setLayout(gl);
		
		//Add listener to buttons
		nextButton.addActionListener(this);
		previousButton.addActionListener(this);
		
		// add to window
		window.add(titleLabel);
		window.add(nameLabel);
		window.add(raceLabel);
		window.add(raceText);
		window.add(previousButton);
		window.add(nextButton);
		
		// more layout stuff
		window.setSize(800,400);
		window.setLocation(500,200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==nextButton ) {
			Main.players.get(Main.players.size() - 1).race = raceText.getText();
			ClassScene c = new ClassScene();
		}
		if(ae.getSource()==previousButton ) {
			NameScene n = new NameScene();
		}
		window.dispose();
	}
}