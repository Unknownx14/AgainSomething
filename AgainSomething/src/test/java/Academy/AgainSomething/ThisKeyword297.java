package Academy.AgainSomething;

public class ThisKeyword297 {

	int a=2;
	
	public void getData()
	{
		int a=3;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword297 t = new ThisKeyword297();
		t.getData();

	}

}
