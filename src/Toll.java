import java.util.Scanner;
public class Toll implements TollBooth {
public Toll()
	{
	   int truckcount = 0;
	   int receipts = 0;
	}
	@Override
	public void display() {
		
	System.out.println("");

	}

	@Override
	public void calculate() {
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter axles and weight");
		int axles = s.nextInt();
		int weight = s.nextInt();
		int tollDue = 5 * axles + 10 * (weight/1000);
		System.out.println("number of axles:" + axles);
		System.out.println("weight of truck" + weight);
	
		
		int truckcount += 1;
		
	}

	
	}


