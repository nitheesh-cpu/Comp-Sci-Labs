public int matrixSum( int[][] mat ) {
    int sum = 0;
    for(int r = 0; r < mat.length; r++)
        for(int c = 0; c < mat[r].length; c++)
            sum += mat[r][c];
    return sum;
}
