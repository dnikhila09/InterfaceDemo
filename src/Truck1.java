
public class Truck1 implements Truck {

	private int axles;
	private int weight;

	Truck1(int axles, int weight)
	{
	    this.axles = axles;
	   this.weight = weight;
		
	}
	@Override
	public int getAxles() {
		
		return axles;
	}

	@Override
	public int getWeight() {
		
			return weight;
	}
	

}
