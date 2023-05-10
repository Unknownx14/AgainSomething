package Academy.AgainSomething;

import java.util.ArrayList;

public class ArrayList309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Shetty");
		a.add("Shetty");
		System.out.println(a);
		a.add(0, "Mister");
		System.out.println(a);
		/*a.remove(1);
		System.out.println(a);
		a.remove("Shetty");
		System.out.println(a);*/
		System.out.println(a.get(2));
		System.out.println(a.contains("Selenium"));
		System.out.println(a.indexOf("Rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		
	}

}
