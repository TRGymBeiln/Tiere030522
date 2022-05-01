
/**
 * Beschreiben Sie hier die Klasse AFFE.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AFFE implements TIER
{
    private String name;
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    /**
     * Konstruktor für Objekte der Klasse ESEL
     */
    public AFFE()
    {
        name = "Affe";

    }

    /**
     * Gerausch eines Affe
     * 
     * @return        gib das Gerausch zurueck
     */
    public String machtGeraesch()
    {
        return "UhUhAhAh";
    }
}