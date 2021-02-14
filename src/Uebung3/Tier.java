package Uebung3;

public class Tier {
    public String name;
    public double hunger;
    public double durst;
    public int groesse;

    public Tier(String name, double hunger, double durst, int groesse) {
        this.name = name;
        this.hunger = hunger;
        this.durst = durst;
        this.groesse = groesse;
    }

    public Tier(String name, double hunger, double durst) {
        this(name, hunger, durst, 1);
    }

    public double trinken(){
        return durst*groesse;
    }

    public double essen(){
        return hunger*groesse;
    }
}
