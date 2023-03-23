import java.util.Random;

public class Task3 {
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
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summ += array[i][j];
            }

        }
        System.out.println("Общая сумма всех элеиентов: " + summ);
    }
}
