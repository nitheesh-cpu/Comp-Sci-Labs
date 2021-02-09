import java.util.ArrayList;
class Digits {
    private final ArrayList<Integer> digitList = new ArrayList<>();

    public Digits(int num) {
        while (num>0) {
            digitList.add(0, num%10);
            num=num/10;
        }
    }
    public boolean isStrictlyIncreasing () {
        double x = -1;
        for (Integer integer : digitList) {
            if (!(integer > x)) {
                return false;
            }
            else
                x = integer;
        }
        return true;
    }
}
