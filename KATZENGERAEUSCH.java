import java.applet.*;
import java.io.*;
import java.net.*;
//made by KASTLBAUER05
public class KATZENGERAEUSCH implements TIER
{
    private String name;
    private File datei;
    private AudioClip clip;
    
    
    public KATZENGERAEUSCH()
    {
        name = "mia";

    }

    /**
     * Gerausch eines Affe
     * 
     * @return        gib das Gerausch zurueck
     */
    public String machtGeraesch(){

        datei = new File("cat.mp3");

        try {
            clip = Applet.newAudioClip(datei.toURL());
            clip.play();            
        }
        catch (MalformedURLException e) {
            System.out.println("Error: " + e);
        }
        return "MAIUUUUUUUUUUU";
    }
}