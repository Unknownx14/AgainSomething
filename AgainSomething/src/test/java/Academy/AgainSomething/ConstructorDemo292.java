package Academy.AgainSomething;

public class ConstructorDemo292 {
	
	
	public ConstructorDemo292()
	{
		System.out.println("This is the Constructor.");
	}
	
	public ConstructorDemo292(int a, int b)
	{
		System.out.println("This is the Parameterized Constructor.");
	}
	
	public void getData()
	{
		System.out.println("This is the getData method.");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo292 cd = new ConstructorDemo292();
		//cd.getData();
		ConstructorDemo292 cd02 = new ConstructorDemo292(5, 15);

	}

}
