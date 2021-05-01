//Spring 2021 C201 Group Project 
//Group Member who Completed this Class: Blaine Rudow, Michael Sheppard revised to accomodate ArrayList

package priority;

public class Character {
	String name;
	String race;
	String charClass;
	
	Character(){
		name = "";
		race = "";
		charClass = "";
	}
	Character(String n){
		name = n;
	}
	Character(String n, String r){
		name = n;
		race = r;
	}
	Character(String n, String r, String c){
		name = n;
		race = r;
		charClass = c;
	}

	@Override
	public String toString() {
		return "<br/>Character Name: " + name + "<br/>" +
				"Race: " + race + "<br/>" +
				"Character Class: " + charClass;
	}
}
