package Academy.AgainSomething;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("NZ");
		hs.add("USA");
		hs.add("AUS");
		hs.add("CAN");
		System.out.println(hs);
		//hs.remove("NZ");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		
		//Iterator
		Iterator<String> iter = hs.iterator();
		
		while(iter.hasNext())
		{
		System.out.println(iter.next());
		}
		
		
	}

}
