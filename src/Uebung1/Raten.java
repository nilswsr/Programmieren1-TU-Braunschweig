package Uebung1;

import java.util.Scanner;
public class Raten {
    public static void main(String[] args) {
        if (args.length > 0) {
            //computerRaten(Integer.parseInt(args[0]));
        }
        else if (args.length == 0) {
            System.out.println("Ok");
            selberRaten();
        }
    }

    private static void selberRaten() {
        int zufallszahl = (int) (Math.random()*100);
        Scanner sc = new Scanner(System.in);
        while(true) {
            int nextNumber = sc.nextInt();
            if(nextNumber == zufallszahl) {
                System.out.println("Geschafft!");
                break;
            }
            else if(nextNumber < zufallszahl) {
                System.out.println("Die eingebene Zahl ist kleiner als die gesuchte Zufallszahl");
            }
            else {
                System.out.println("Die eingebene Zahl ist groesser als die gesuchte Zufallszahl");
            }
        }

        }

}

