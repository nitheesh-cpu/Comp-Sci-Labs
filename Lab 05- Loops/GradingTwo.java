import java.util.*;
import java.io.*;

public class GradingTwo {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(new File("GradingTwo.txt"));
        int NumOfMa = 0, NumOfMi = 0, NumOfOth = 0;
        String cat = "";
        double major = 0, minor = 0, other = 0, overall = 0, grade = 0;
        boolean repeat = true;

        while (repeat) {
            System.out.println("Enter grade(negative value to stop):");
            grade = input.nextDouble();
            if (grade <= -1){
                break;
            }
            System.out.println("Enter category");
            cat = input.next();
            if (cat.toUpperCase().equals("MA")) {
                major += grade;
                NumOfMa++;
            } else if (cat.toUpperCase().equals("MI")) {
                minor += grade;
                NumOfMi++;
            } else if (cat.toUpperCase().equals("OTH")) {
                other += grade;
                NumOfOth++;
            }

        }
        major /= NumOfMa;
        minor /= NumOfMi;
        other /= NumOfOth;
        System.out.println("Major average " + major);
        System.out.println("Minor average " + minor);
        System.out.println("Other average " + other);
        overall = (major * 0.7) + (minor * 0.2) + (other * 0.1);
        System.out.println("Overall average " + overall);
    }

}
