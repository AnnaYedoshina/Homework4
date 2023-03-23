public class Task2 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}};

        int[][] matrix2 = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};
        int m = matrix1.length;
        int n = matrix2[0].length;
        int o = matrix2.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += matrix1[i][k] * matrix2[k][j];

                }

            }

        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + "   ");
            }


        }
    }
}

