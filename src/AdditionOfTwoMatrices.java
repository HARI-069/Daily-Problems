public class AdditionOfTwoMatrices {
    public static void main(String... args) {
        int[][] mat1 = {{2, 4}, {6, 8}};
        int[][] mat2 = {{8, 4}, {6, 3}};

        int[][] newMatrix = new int[mat1.length][mat1[0].length];

        for(int i=0; i< mat1[0].length; i++){
            for (int j = 0; j < mat1[1].length; j++) {
                newMatrix[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for(int i=0; i< mat1[0].length; i++){
            for (int j = 0; j < mat1[1].length; j++) {
                System.out.println(newMatrix[i][j]);
            }
        }

    }
}
