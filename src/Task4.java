import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int newarray[][] = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < newarray.length; i++) {
            for (int j = 0; j < newarray[i].length; j++) {
                newarray[i][j] = random.nextInt(1, 10);
            }
        }
        for (int i = 0; i < newarray.length; i++) {
            for (int j = 0; j < newarray[i].length; j++) {
                System.out.print(newarray[i][j] + " ");

            }
            System.out.println();

        }

        for (int i = 0; i < newarray.length; i++) {
            for (int j = 0; j < newarray[i].length; j++) {
                if (i == j) {
                    System.out.print(newarray[i][j] + " ");

                }
                System.out.println();
            }
        }
        for (int i = 0; i < newarray.length; i++) {
            for (int j = 0; j < newarray[i].length; j++) {
                if ((i + j) == newarray.length - 1) {
                    System.out.print(newarray[i][j] + " ");

                }
                System.out.println();
            }
        }
    }
}