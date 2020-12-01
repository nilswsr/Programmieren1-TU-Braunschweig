import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class haeufigkeitsanalyse {
    public static void main(String[] args) {
        File file = new File("shrek_transscript.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[][] symbole = new int[256][2];
        while(fileReader.hasNextLine()) {
            String[] zeichen = fileReader.nextLine().split("");
            for (String z : zeichen) {
                char c = z.charAt(0);
                if (!symbolInArray(symbole, c)) {
                    symbole[c][0] = c;
                    symbole[c][1] = 1;
                }
                else{
                    symbole[c][1]++;
                }
                int ind = findSymbol(symbole, c);
            }
        }
        symbole = sortArray(symbole);
        printArray(symbole);
        }
    public static boolean symbolInArray(int[][] a, char c){
        boolean in = false;
        for(int i = 0; i < a.length; i++){
            if (c == a[i][0]) {
                in = true;
                break;
            }
        }
        return in;
    }
    public static int findSymbol(int[][] a, char c){
        int index = -1;
        for (int i = 0; i < a.length; i++){
            if(c == a[i][0]){
                index = i;
                break;
            }
        }
        return index;
    }
    public static int[][] sortArray(int[][] a){
        Arrays.sort(a, Comparator.comparingDouble(b -> b[1]));
        Collections.reverse(Arrays.asList(a));
        return a;
    }
    public static void printArray(int[][] a){
        for(int i = 0; i < a.length; i++){
            if(a[i][1] != 0) {
                System.out.println("" + (char) a[i][0] + " " + a[i][1]);
            }
        }
    }
}
