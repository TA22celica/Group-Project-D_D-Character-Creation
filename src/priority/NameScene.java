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

public class NameScene implements ActionListener{
	
	JFrame window = new JFrame("Dungeons & Dragons Character Creator - Name");
	
	JLabel nameLabel = new JLabel("Enter Character Name");
	JTextField nameText = new JTextField("");
	JButton previousButton = new JButton("Previous");
	JButton nextButton = new JButton("Next");
	GridLayout gl = new GridLayout();
	NameScene(){
		
		//Layout stuff
		gl.setRows(4);
		gl.setColumns(1);
		window.setLayout(gl);
		
		//Add listener to buttons
		nextButton.addActionListener(this);
		previousButton.addActionListener(this);
		
		window.add(nameLabel);
		window.add(nameText);
		window.add(previousButton);
		window.add(nextButton);
		
		window.setSize(800,400);
		window.setLocation(500,200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		Main.players.add(new Character(nameText.getText()));
		if(ae.getSource()==nextButton ) {
			RaceScene r = new RaceScene();			
		}
		if(ae.getSource()==previousButton ) {
			WelcomeScene w = new WelcomeScene();
		}
		window.dispose();
	}
}
