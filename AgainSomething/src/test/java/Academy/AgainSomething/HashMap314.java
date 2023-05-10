package Academy.AgainSomething;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Hello");
		hm.put(1, "Bonjour");
		hm.put(2, "Au revoir");
		hm.put(3, "Goodbye");
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));
		System.out.println(hm+" JK");
		
		//We now make this as a Set
		Set sm = hm.entrySet();
		Iterator iter = sm.iterator();
		
		while(iter.hasNext())
		{
			Map.Entry me= (Map.Entry)iter.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		

	}

}
