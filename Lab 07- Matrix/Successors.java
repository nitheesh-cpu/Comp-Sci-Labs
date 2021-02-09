public class Successors {
    public static Position findPosition(int num, int[][] intArr)
    {
        int r = 0, c = 0;
        outerloop:
        for( int i = 0 ; i < intArr.length; i++){
            for( int x = 0 ; x < intArr[r].length; x++){
                if(intArr[i][x] == num){
                    return new Position(i,x);
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] intArr)
    {
        Position[][] position = new Position[intArr.length][intArr[0].length];
        for(int i= 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                position[i][j] = findPosition(intArr[i][j] + 1, intArr);
            }
        }
        return position;
    }
}
