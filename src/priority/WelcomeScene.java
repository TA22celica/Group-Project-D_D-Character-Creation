//Spring 2021 C201 Group Project 
//Group Member who Completed this Class: Blaine Rudow

package priority;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeScene implements ActionListener {
	JFrame window = new JFrame("Dungeons & Dragons Character Creator - Welcome");
	JLabel WelcomeLabel = new JLabel("Welcome to the Dungeons & Dragons Character Creator");
	JButton nextButton = new JButton("Next");
	GridLayout gl = new GridLayout();
	WelcomeScene(){
		
		//Layout stuff
		gl.setRows(2);
		gl.setColumns(1);
		window.setLayout(gl);
		
		//Add listener to buttons
		nextButton.addActionListener(this);
		
		// Add window objects
		window.add(WelcomeLabel);
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
			window.dispose();
			NameScene n = new NameScene();						
		}
	}
}
