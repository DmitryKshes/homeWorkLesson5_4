import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Enter size of three-dimensional array: ");
        int i = new Scanner(System.in).nextInt();
        int j = new Scanner(System.in).nextInt();
        int k = new Scanner(System.in).nextInt();
        Random rand = new Random();
        int[][][] threeDimensionalArray = new int[i][j][k];
        for (int index = 0; index < i; index++) {
            for (int index2 = 0; index2 < j; index2++) {
                for (int index3 = 0; index3 < k; index3++) {
                    threeDimensionalArray[index][index2][index3] = rand.nextInt(-100, 101);
                }
            }
        }
        System.out.println("Array start: " + Arrays.deepToString(threeDimensionalArray));
        System.out.println("Enter please value for increase: ");
        int increase = new Scanner(System.in).nextInt();
        for (int index = 0; index < i; index++) {
            for (int index2 = 0; index2 < j; index2++) {
                for (int index3 = 0; index3 < k; index3++) {
                    threeDimensionalArray[index][index2][index3] += increase;
                }
            }
        }
        System.out.println("Array end: " + Arrays.deepToString(threeDimensionalArray));
    }
}
