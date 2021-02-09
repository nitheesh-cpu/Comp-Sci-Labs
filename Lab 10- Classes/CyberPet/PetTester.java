import java.util.Scanner;
import java.io.*;

public class PetTester
{
	public static void main(String args[]) throws IOException
     {        
       Scanner input = new Scanner(new File("CyberPet.txt"));
       CyberPet pet1 = new CyberPet();
       pet1.eat();
       pet1.sleep();
       pet1.eat();
       pet1.eat();
       pet1.eat();
       
       System.out.println("This pet's name is "+pet1.getName());
       pet1.setName("Max");
       pet1.setKind("dog");
       System.out.println(pet1.getName()+ " is a "+pet1.getKind());
       System.out.println();

       System.out.println("Enter name of your pet: ");
       String text = input.nextLine();
       System.out.println("Enter the kind of pet: ");
       String kind = input.nextLine();
       CyberPet myPet = new CyberPet(text,kind);
       
       myPet.eat();
       myPet.sleep();	
       myPet.eat();
       myPet.eat();
       myPet.eat();
       CyberPet.checkFood();
       
       System.out.println("This pet's name is "+myPet.getName());
       System.out.println(myPet.getName()+ " is a "+myPet.getKind());
       System.out.println(myPet.getName()+ " is "+myPet.getState());
        
       System.out.println(pet1);	
        
       pet1.play();
       System.out.println(pet1+" and it is "+ pet1.getState());
       
       myPet.encounter(pet1);
       }		
}	
	
