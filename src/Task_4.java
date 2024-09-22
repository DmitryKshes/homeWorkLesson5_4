import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args){
        System.out.println("Enter size of array: ");
        Random r = new Random();
        int i = new Scanner(System.in).nextInt();
        int j = new Scanner(System.in).nextInt();
        int[][] array = new int[i][j];
        if (i >=3 && j >=3){
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array[i].length; j++) {
                    array[i][j] = r.nextInt(10);
                }
            }
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array[i].length; j++) {
                   Arrays.sort(array[i]);
                }
            }
            System.out.println(Arrays.deepToString(array));
        } else {
            System.out.println("Invalid input");
        }
    }
}
