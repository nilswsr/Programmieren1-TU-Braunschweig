package Uebung3;

public class Elefant extends Tier{

    public Elefant(String name, double hunger, double durst, int groesse) {
        super(name, hunger, durst, groesse);
    }

    public String toString(){
        if(this.groesse >= 2){
            return super.toString() + "Töröö";
        }
        else{
            return super.toString();
        }
    }
}
