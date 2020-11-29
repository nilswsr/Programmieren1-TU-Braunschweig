public class Raten {
    public static void main(String[] args) {
        if(args.length > 0) {
            computerRaten(Integer.parseInt(args[0]));
        }
    }

    private static void computerRaten(int arg) {
        int count = 1;
        while(true) {
            int randomint = (int) (Math.random() * 100);
            if (randomint == arg) {
                System.out.println(""+count);
                break;
            }
            count++;
        }
    }
}
