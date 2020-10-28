import java.util.Scanner;
public class PigLatin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, firstName, lastName, lastNameChar0, firstNameChar0, upperFirstNameChar1, upperLastNameChar1, pigLatinFirstName, pigLatinLastName;
        System.out.println("Enter your name:");
        name = input.nextLine().toLowerCase();
        firstName = name.substring(0,name.indexOf(" "));
        lastName = name.substring(name.indexOf(" ")+1);
        lastNameChar0 = lastName.substring(0,1);
        firstNameChar0 = firstName.substring(0,1);
        upperLastNameChar1 = lastName.substring(1,2).toUpperCase();
        upperFirstNameChar1 = firstName.substring(1,2).toUpperCase();
        pigLatinFirstName = upperFirstNameChar1 + firstName.substring(2) + firstNameChar0 + "ay";
        pigLatinLastName = upperLastNameChar1 + lastName.substring(2) + lastNameChar0 + "ay";
        System.out.println("Hello, " + pigLatinFirstName + " " + pigLatinLastName + "!");
    }
}
