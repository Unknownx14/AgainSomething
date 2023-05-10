package Academy.AgainSomething;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionDemo317 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,5,5,5,4,6,6,9,9,4,9,3,9,7,};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0; i<a.length; i++ )
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				hm.put(a[i], k);
			}
			
		}
		System.out.println(hm);
		
		//We now make this as a Set
				Set sm = hm.entrySet();
				Iterator iter = sm.iterator();
				
				while(iter.hasNext())
				{
					Map.Entry me= (Map.Entry)iter.next();
					int unique = (int) me.getValue();
					if(unique<=1)
					{
						System.out.println(me.getKey());
					}
					
				}
		
	}

}
