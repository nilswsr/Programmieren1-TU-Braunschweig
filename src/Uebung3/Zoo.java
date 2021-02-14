package Uebung3;

public class Zoo {
    private double essen;
    private double trinken;
    private final int gehegeanzahl;
    private final Tier[] tiere;

    public Zoo(int essen, int wasser, int gehegeanzahl){
        this.essen = essen;
        this.trinken = wasser;
        this.gehegeanzahl = gehegeanzahl;
        tiere = new Tier[gehegeanzahl];
    }

    public void neuesTier(Tier tier){
        boolean found = false;
        for(int i = 0; i < tiere.length; i++) {
            if(tiere[i] == null){
                found = true;
                tiere[i] = tier;
                break;
            }
        }
        if(!found) {
            System.out.println("Es ist leider kein Platz mehr!");
        }
    }

    public double getEssen(){
        return essen;
    }

    public double getTrinken(){
        return trinken;
    }

    public boolean fuettern(Tier tier){
        if(this.essen - tier.essen() >= 0){
            this.essen -= tier.essen();
            return true;
        }
        else{
            return false;
        }
    }

    public boolean traenken(Tier tier){
        if(this.trinken - tier.trinken() >= 0){
            this.trinken -= tier.trinken();
            return true;
        }
        else{
            return false;
        }
    }

    public Tier[] getTiere(){
        return tiere;
    }
}
