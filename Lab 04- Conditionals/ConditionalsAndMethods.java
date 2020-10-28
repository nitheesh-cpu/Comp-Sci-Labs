import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class ConditionalsAndMethods {
    public static void main(String args[]) throws IOException
    {
        Scanner input = new Scanner(new File("ConditionalsAndMethods.txt"));
        out.println("DO1");
        out.println(D01(input.nextInt()));
        out.println(D01(input.nextInt()));
        out.println(D01(input.nextInt()));
        out.println("DO2");
        out.println(D02(input.nextInt()).toUpperCase());
        out.println(D02(input.nextInt()).toUpperCase());
        out.println(D02(input.nextInt()).toUpperCase());
        out.println(D02(input.nextInt()).toUpperCase());
        out.println(D02(input.nextInt()).toUpperCase());
        out.println(D02(input.nextInt()).toUpperCase());
        out.println(D02(input.nextInt()).toUpperCase());
        out.println(D02(input.nextInt()).toUpperCase());
        out.println(D02(input.nextInt()).toUpperCase());
        out.println("DO3");
        out.println(D03(input.nextInt()));
        out.println(D03(input.nextInt()));
        out.println("DO4");
        out.println(D04(input.nextInt()));
        out.println(D04(input.nextInt()));
        out.println("DO5");
        out.println(D05(input.nextInt(),input.nextInt()));
        out.println("DO6");
        out.println(D06(input.nextInt()));
        out.println(D06(input.nextInt()));
        out.println(D06(input.nextInt()));
        out.println("DO7");
        out.println(D07(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()));
    }

    public static String D01(int x){
        if(x <= 20){
            return "SMALL";
        }
        else{
            return "LARGE";
        }
    }

    public static String D02(int x){
        if(x==1){
            return "MERCURY";
        }else if(x==2){
            return "VENUS";
        }else if(x==3){
            return "EARTH";
        }else if(x==4){
            return "MARS";
        }else if(x==5){
            return "JUPITER";
        }else if(x==6){
            return "SATURN";
        }else if(x==7){
            return "URANUS";
        }else if(x==8){
            return "NEPTUNE";
        }else{
            return "NOT A PLANET";
        }

    }

    public static String D03(int x){
        if(x != 2019){
            return "WRONG";
        }
        return "CORRECT";
    }

    public static String D04(int x){
        if(x % 2 == 0){
            return "EVEN";
        }else{
            return "ODD";
        }
    }

    public static int D05(int x, int y){
        return x*y;
    }

    public static int D06(int x){
        return x%3;
    }

    public static int D07(int a, int b, int c, int d, int e){
        if(a<b && a<c && a<d && a<e){
            return a;
        }else if(b<a && b<c && b<d && b<e){
            return b;
        }else if(c<b && c<a && c<d && c<e){
            return c;
        }else if(d<b && d<c && d<a && d<e){
            return d;
        }else {
            return e;
        }
    }

}
