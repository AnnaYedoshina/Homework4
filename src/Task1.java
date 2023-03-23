import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] arrayColor = new String[8][8];
        for (int i = 0; i < arrayColor.length; i++) {
            for (int j = 0; j < arrayColor[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("W" + " ");
                } else {
                    System.out.print("B" + " ");
                }

            }
            System.out.println();
        }
    }
}
