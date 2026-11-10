class Level0_MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int diagonalSum = 0;

        for (int i = 0; i < mat.length; i++) {
            diagonalSum += mat[i][i];

            if (mat.length % 2 == 1 && i != (mat.length - 1) / 2) 
                diagonalSum += mat[i][mat.length - i - 1];
            else if (mat.length % 2 == 0) 
                diagonalSum += mat[i][mat.length - i - 1];
        }

        return diagonalSum;
    }
}
