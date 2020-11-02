public class BiggestSmallest {

    public int biggestDigit( int num ) {
        int big = Integer.MIN_VALUE;
        while(num != 0){
            int digit = num%10;
            if(digit > big){
                big = digit;
            }
            num = (num-digit)/10;
        }
        return big;
    }

    public int smallestDigit( int num ) {
        int small = Integer.MAX_VALUE;
        while(num != 0){
            int digit = num%10;
            if(digit < small){
                small = digit;
            }
            num = (num-digit)/10;
        }
        return small;
    }

}
