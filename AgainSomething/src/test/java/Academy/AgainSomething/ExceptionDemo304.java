package Academy.AgainSomething;

public class ExceptionDemo304 {

	
	
/*	try
	{
		int k=b/c;
		
	}
	catch(Exception e)
	{
		
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =4;
		int b=7;
		int c=0;
		
		try
		{
		//int k=b/c;
			int arr[] = new int[5];
		
		
			//System.out.println(k);
			System.out.println(arr[7]);
		
		}
		catch(ArithmeticException et)
		{
			System.out.println("I have caught the ArithmeticException.");
		}
		catch(IndexOutOfBoundsException ets)
		{
			System.out.println("I have caught the IndexOutOfBoundsException.");
		}
		catch(Exception e)
		{
			System.out.println("I have caught the error/exception.");
		}
		finally
		{
			System.out.println("driver.close();");
		}
		
		
	}

}
