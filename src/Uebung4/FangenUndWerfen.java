package Uebung4;

import java.util.InputMismatchException;

public class FangenUndWerfen {
    public static void main(String[] args) {
        try {
            int zahl = Integer.parseInt(args[0]);
            if(zahl>10){
                throw new IllegalArgumentException("Ueber 10");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Nichts eingegeben");
            int zahl = 1;
        }
        catch (NumberFormatException e) {
            System.out.println("Keinen Integer eingegeben");
            int zahl = 1;
        }
    }

    public static int twentyBy(int value){
        return 20/value;
    }
}
