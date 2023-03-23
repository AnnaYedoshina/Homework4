import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {


        int[][][] array = new int[3][3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(1, 10);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + "   ");
                }
                System.out.println();
            }

        }
        System.out.println("Введите число: ");
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {

                                array[i][j][k] += n;
                            }
                        }
                    }System.out.println(Arrays.deepToString(array));
                }
            }

