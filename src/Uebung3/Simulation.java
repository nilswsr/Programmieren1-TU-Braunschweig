package Uebung3;

public class Simulation {
    public static void main(String[] args) {
        Zoo neuer_zoo = new Zoo(400, 300, 3);

        neuer_zoo.neuesTier(new Löwe("Dieter", 10, 5, 1));
        neuer_zoo.neuesTier(new Löwe("Peter", 13, 3, 1));
        neuer_zoo.neuesTier(new Elefant("Dieter", 20, 15, 3));
        simulationGo(neuer_zoo);
    }

    public static void simulationGo(Zoo zoo){
        int zeit = 0;
        while(true){
            for(Tier tier : zoo.getTiere()){
                if(tier != null){

                    if(!zoo.fuettern(tier)){
                        System.out.println("Kein Futter mehr an Tag " + zeit);
                        return;
                    }

                    if(!zoo.traenken(tier)){
                        System.out.println("Kein Wasser mehr an Tag " + zeit);
                        return;
                    }
                }
            }
            zeit++;
        }
    }
}
