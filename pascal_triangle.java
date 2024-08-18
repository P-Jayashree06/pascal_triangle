public class pascal_triangle {
    public static void main(String[] args) {
        int numRows = 5;
        generatePascalTriangle(numRows);
    }

    public static void generatePascalTriangle(int numRows) {
        int[][] triangle = new int[numRows][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

