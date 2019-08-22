package Question4;

import music.Write.Playable;
import music.string.Write.Veena;
import music.wind.Write.Saxophone;

public class MusicMain {
    public static void main(String args[]) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        Playable pv, ps; 
        pv = new Veena();
        ps = new Saxophone();
        
        v.play(); 
        s.play();         
        pv.play(); 
        ps.play();
        
    }
}
