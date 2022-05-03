import java.applet.*;
import java.io.*;
import java.net.*;
/**
 * Beschreiben Sie hier die Klasse AFFE.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KATZENGERAEUSCH implements TIER
{
    private String name;
    private File datei;
    private AudioClip clip;
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    /**
     * Konstruktor für Objekte der Klasse ESEL
     */
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
        return "MAIUZ";
    }
}