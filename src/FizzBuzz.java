public class FizzBuzz {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.toString(i+1);
        }

        for(int j = 0; j < n; j++) {
            int value = Integer.parseInt(arr[j]);
            if((value%3==0) && (value%5==0)) {
                arr[j] = "Fizz-Buzz";
            }
            else if (value%3==0){
                arr[j] = "Fizz";
            }
            else if (value%5==0) {
                arr[j] = "Buzz";
            }
        }
        printArray(arr);
        }
    public static void printArray(String[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    }
