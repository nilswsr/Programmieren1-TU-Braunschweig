package Uebung2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class COVID19 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("RKI_COVID19.csv");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int count = 0;
        assert fileReader != null;
        int spalten = fileReader.nextLine().split(",").length;
        while (fileReader.hasNextLine()) {
            fileReader.nextLine();
            count++;
        }
        File file2 = new File("RKI_COVID19.csv");
        Scanner fileReader2;
        fileReader2 = new Scanner(file2);
        String[][] table = new String[count][spalten];
        for (int i = 0; i < count; i++) {
            String[] zeile = fileReader2.nextLine().split(",");
            table[i] = zeile;
        }
        int genesene = 0;
        for (int j = 1; j < count; j++) {
            if (table[j][16] != null) {
                if (!table[j][16].equals("-9")) {
                    genesene += Integer.parseInt(table[j][16]);
                }
            }
            }
        System.out.println("" + genesene);

        }

    }
