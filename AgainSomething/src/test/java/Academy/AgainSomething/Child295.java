package Academy.AgainSomething;

public class Child295 extends Parent295 {

	public Child295()
	{
		super();
		System.out.println("The Constructor form the Child class.");
	}
	
	
	String name = "Shetty";
	
	public void getName() 
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("The method form the Child class.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child295 c = new Child295();
		c.getName();
		c.getData();
		
	}

}
