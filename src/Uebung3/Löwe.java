package Uebung3;
import java.util.Random;

public class Löwe extends Tier{

    public Löwe(String name, double hunger, double durst, int groesse) {
        super(name, hunger, durst, groesse);
    }

    public String toString() {
        return berechneRuf();
    }

    private String berechneRuf(){
        Random rand = new Random();
        int zufallszahl = rand.nextInt(2);
        if(zufallszahl==0){
            return "Grooooooooooooooar";
        }
        else{ return "..."; }
    }
}
