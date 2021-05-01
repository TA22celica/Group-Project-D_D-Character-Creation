//Spring 2021 C201 Group Project 
//Group Member who Completed this Class: Michael Sheppard

package priority;

import java.util.HashMap;
import java.util.Map;

public class Util {
    static int numberOfTeamsBasedOnRace(){
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<Main.players.size();i++){
            String race = Main.players.get(i).race;
            Integer in = map.get(race);
            if(in == null)in = 0;
            else in++;
            map.put(race, in);
        }
        return map.size();
    }
}
