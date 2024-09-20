import java.util.Scanner;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args){
        System.out.println("Enter the size of the array");
        int n = new Scanner(System.in).nextInt();
        int[][] array = new int[n][n];
        if (n > 2 && n < 6){
            Random rand = new Random();
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    array[i][j] = rand.nextInt(-100, 101);
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            int sumMainDiagonal = 0;
            int sumSubDiagonal = 0;
            for (int i = 0; i < array.length; i++){
                    sumMainDiagonal += array[i][i];
                    sumSubDiagonal += array[i][array[i].length - 1 - i];
            }
            System.out.println("Summa main diagonal: " +sumMainDiagonal);
            System.out.println("Summa main diagonal: " +sumSubDiagonal);
        } else {
            System.out.println("Invalid input");
        }
    }
}
