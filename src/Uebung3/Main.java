package Uebung3;

/**
 * Ein sehr tolles Programm
 * @author nilswsr
 */
public class Main {
    /**
     * Main-Methode bla
     * @param args super toll
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto("gruen", 10);
        Auto auto2 = new Auto("gruen", 10);

        if (auto1.geschwindigkeit > auto2.geschwindigkeit) {
            System.out.println("Auto 1 ist schneller als Auto2");
        } else if (auto1.geschwindigkeit < auto2.geschwindigkeit) {
            System.out.println("Auto 2 ist schneller als Auto 1");
        } else {
            System.out.println("Die Autos sind gleich schnell");
        }

        if (auto1.getFarbe().equals(auto2.getFarbe())) {
            System.out.println("Die Autos haben die gleiche Farbe");
        } else {
            System.out.println("Die Autos haben nicht die gleiche Farbe");
        }

        if (auto1.equals(auto2)) {
            System.out.println("Die Autos sind die Gleichen");
        } else {
            System.out.println("Die Autos sind nicht die Gleichen");
        }
    }
}
