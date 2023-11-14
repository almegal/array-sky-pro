import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //task 1
        int[] arrayInt = new int[]{1,2,3};
        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
        String[] arrayString = {"abc", "aba", "adda"};

        //task2
        for (int i = 0; i <= arrayInt.length - 1; i++){
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i <= arrayDouble.length - 1; i++){
            System.out.print(arrayDouble[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i <= arrayString.length - 1; i++){
            System.out.print(arrayString[i] + " ");
        }

        //second way to print array
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println(Arrays.toString(arrayString));

        //task3
        System.out.println("");
        System.out.println("reverse print arrays");
        for (int i = arrayInt.length - 1; i >= 0; i--){
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("");
        for (int i = arrayDouble.length - 1; i >= 0; i--){
            System.out.print(arrayDouble[i] + " ");
        }
        System.out.println("");
        for (int i = arrayString.length - 1; i >= 0; i--){
            System.out.print(arrayString[i] + " ");
        }

        //task 4
        System.out.println("");
        for (int i = 0; i <= arrayInt.length - 1; i++) {
            int element = arrayInt[i];
            if(element % 3 == 0 || element == 1) {
                arrayInt[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}