public class DigitAdder {

    public static int digitAdder(int num) {
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += digit;
            num = (num - digit)/10;
        }

        return sum;
    }

}
