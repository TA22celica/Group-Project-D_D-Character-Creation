//Spring 2021 C201 Group Project 
//Group Member who Completed this Class: Blaine Rudow

package priority;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StatScene implements ActionListener{
	JFrame window = new JFrame("Dungeons & Dragons Character Creator - Stats");
	JLabel titleLabel = new JLabel("<html>Character Attributes: <br></html>");
	JLabel charLabel = new JLabel("Character Name: " + Main.players.get(Main.players.size() - 1).name );
	JLabel raceLabel = new JLabel( "Character Race: " + Main.players.get(Main.players.size() - 1).race );
	JLabel classLabel = new JLabel("Character Class: " + Main.players.get(Main.players.size() - 1).charClass );
	JButton previousButton = new JButton("Add New");
	GridLayout gl = new GridLayout();
	
	StatScene(){
		String temp = "<html>";
		for(int i=0;i<Main.players.size();i++){
			temp+=Main.players.get(i).toString() + "</br>";
		}
		temp += "</html>";
		raceLabel.setText("Unique Races : " + Util.numberOfTeamsBasedOnRace() );
		charLabel.setText(temp);
		//Layout stuff
		gl.setRows(5);
		gl.setColumns(1);
		window.setLayout(gl);
		
		//Add listener to buttons
		previousButton.addActionListener(this);
		
		window.add(titleLabel);
		window.add(charLabel);
		window.add(raceLabel);
		window.add(previousButton);
		
		// more layout stuff
		window.setSize(800,400);
		window.setLocation(500,200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==previousButton ) {
			NameScene c = new NameScene();
			window.dispose();
		}	
	}
	
}
