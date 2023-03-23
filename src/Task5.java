import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int array[][] = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(1, 10);

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "   ");

            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
                Arrays.sort(array[i]);
                System.out.println(Arrays.toString(array[i]));
            }
        }
    }


