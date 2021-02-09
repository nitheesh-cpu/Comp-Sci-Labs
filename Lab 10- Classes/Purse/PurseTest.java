
public class PurseTest
{
	public static void main(String args[])
	{
		Purse p1 = new Purse();		
		p1.addNickels(13);
		p1.addDimes(1);
		p1.addQuarters(2);
		double totalValue = p1.getTotal();
		System.out.println("The total of p1 is "+totalValue);
		
		Purse p2 = new Purse(5, 4, 8);
		p2.addNickels(8);
		p2.addDimes(3);
		p2.addQuarters(6);
		totalValue = p2.getTotal();
		System.out.println("The total of p2 is "+totalValue);
		
		System.out.println("The number of nickels in p1 is "+p1.getNickels());
		System.out.println("The number of dimes in p1 is "+p1.getDimes());
		System.out.println("The number of quarters in p1 is "+p1.getQuarters());
		System.out.println("The number of nickels in p2 is "+p2.getNickels());
		System.out.println("The number of dimes in p2 is "+p2.getDimes());
		System.out.println("The number of quarters in p2 is "+p2.getQuarters());
		
		
	}
}
