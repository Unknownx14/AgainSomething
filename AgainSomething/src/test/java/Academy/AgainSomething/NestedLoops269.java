package Academy.AgainSomething;

public class NestedLoops269 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	for(int i=1; i<=4; i++)
		{
			System.out.println("Outerloop" +i);
			for(int j=1; j<=4; j++)
			{
				System.out.println("Innerloop" +j);
			}
		}*/
		
		
		
		
		//Pyramid
		
/*		int k=1;
		for(int i=0; i<4; i++)
		{
			
			for(int j=1; j<=4-i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
			
		}*/
		
		
		//Pyramid
		
	/*			int m=1;
				for(int i=0; i<4; i++)
				{
					
					for(int j=4; j<=4+i;j++)
					{
						System.out.print(m+" ");
						m++;
					}
					System.out.println();
					
				}*/
				
				
				//Pyramid
				
				
	/*			for(int i=0; i<4; i++)
				{
					int m=1;
					for(int j=4; j<=4+i;j++)
					{
						System.out.print(m+" ");
						m++;
					}
					System.out.println();
					
				}*/
				
				
//Pyramid
				
				int m=3;
				int n=3;
				for(int i=0; i<4; i++)
				{
					
					for(int j=4; j<=4+i;j++)
					{
						System.out.print(m+" ");
						m=m+n;
					}
					System.out.println();
					
				}
		
		
	}

}
