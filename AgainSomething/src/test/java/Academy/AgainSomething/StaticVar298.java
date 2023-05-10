package Academy.AgainSomething;

public class StaticVar298 {
	
	//These are instance variables
	String name;
	String address;
	String city;
	static String state = "New Zealand"; //A Class variable
	static int i =0; //static means this variable is shared among other
	static String something;
	static int j;
	
	//Local variables in the Constructor
	public StaticVar298(String name, String address, String city)
	{
		this.name=name;
		this.address = address;
		this.city = city;
		i++;
		System.out.println(i);
	}
	
	public String getAddress()
	{
		return address+" "+state;
	}
	
	public static void getState() //A static method accepts only static variables
	{
		System.out.println(state);
	}
	
	
	static
	{
		something="qwer";
		j=15;
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar298 sv = new StaticVar298("Pedro", "Maple road", "Wellington");
		StaticVar298 sv02 = new StaticVar298("Pablo", "Nelson Mandela avenue", "Wellington");
		
		System.out.println(sv.getAddress()); 
		System.out.println(sv02.getAddress());
		getState();
		System.out.println(StaticVar298.i=14);
		System.out.println(sv.address="xyz");
		
		
	}

}
