package Uebung3;

/**
 * @author nilswsr
 */
public class Auto {
    /**
     * Auto-Methode super toll
     */
    public int geschwindigkeit;
    private String farbe;

    public Auto(String farbe, int geschwindigkeit) {
        this.farbe = farbe;
        this.geschwindigkeit = geschwindigkeit;
    }

    public String getFarbe() {
        return farbe;
    }

    public boolean equals(Object obj) {
        Auto auto = (Auto) obj;
        return farbe.equals(auto.farbe) && geschwindigkeit == auto.geschwindigkeit;
    }
}
