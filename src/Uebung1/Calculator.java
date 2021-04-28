package Uebung1;

public class Calculator{
    public static void main(String[] args) {
        int loesung;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String symbol = args[2];

        if (symbol.equals("+")) {
            loesung = a+b;
        }
        else if (symbol.equals("-")) {
            loesung = a-b;
        }
        else {
            System.out.println("Ungueltiger Rechenoperator");
            return;
        }

        System.out.println(loesung);
    }
}