import java.util.Scanner;
public class StarWarsName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //step one
        System.out.println("What is your name:");
        String name = input.nextLine();
        String firstName = name.substring(0, name.indexOf(' '));
        int nameLength = name.length();
        String lastThree = name.substring(nameLength - 3, nameLength).toLowerCase();
        String reverse = new StringBuilder(lastThree).reverse().toString();
        reverse = reverse.substring(0, 1).toUpperCase() + reverse.substring(1);
        System.out.println("What street do you live on:");
        String street = input.nextLine();
        String firstFive = street.substring(0,5).toLowerCase();
        System.out.println("What car does your family own:");
        String car = input.nextLine();
        String withoutEnd = car.substring(1,car.length()-1);
        withoutEnd = withoutEnd.substring(0, 1).toUpperCase() + withoutEnd.substring(1);
        String StarWarsName = reverse + firstFive + " of " + withoutEnd;
        System.out.println("Hi, " + firstName + "! Did you know your Star Wars name is " + StarWarsName + "?");
    }
}
