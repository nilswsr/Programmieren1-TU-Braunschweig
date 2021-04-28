package Uebung1;

import static java.lang.System.out;

public class Calculator2{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String symbol = args[2];

        switch (symbol) {
            case "+": out.println(a + b); break;
            case "-": out.println(a - b); break;
            case "*": out.println(a * b); break;
            case "/": out.println(a*1.0 / b); break;
            default: out.println("Ungueltiger Paramater"); break;
        }
    }
}