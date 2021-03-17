import static java.lang.System.*;

public class MonsterTester
{
   public static void main( String args[] )
   {
		MonsterPrime zero = new MonsterPrime();
		MonsterPrime one = new MonsterPrime(8);
		MonsterPrime sue = new MonsterPrime(9, 4);
		MonsterPrime harry = new MonsterPrime(1, 2, 3);
		out.println("zero Monster :: " + zero);		
		out.println("\none Monster :: " + one);
		out.println("\nsue Monster :: " + sue);
		out.println("\nharry Monster :: " + harry);

		out.println("\nchanging harry's properties ");				
		harry.setHeight(7);
		harry.setWeight(6);
		harry.setAge(5);
		out.println("\nharry Monster :: " + harry);

		out.println("\ncloning harry");	
		sue = (MonsterPrime)harry.clone();
		out.println("\nsue Monster :: " + sue);

		MonsterPrime mOne = new MonsterPrime(33,33,11);
		MonsterPrime mTwo = new MonsterPrime(55,33,11);

		out.println("\nMonster 1 :: " + mOne);
		out.println("\nMonster 2 :: " + mTwo);

		out.print("\nmOne.equals(mTwo) == ");
		out.println(mOne.equals(mTwo));

		out.print("\nmOne.compareTo(mTwo) == ");
		out.println(mOne.compareTo(mTwo));
		out.print("\nmTwo.compareTo(mOne) == ");
		out.println(mTwo.compareTo(mOne));
	}
}
