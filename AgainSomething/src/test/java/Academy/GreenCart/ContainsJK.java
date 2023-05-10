package Academy.GreenCart;

public class ContainsJK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String something01="JK";
		String something02="J";
		
		if(something01.contains(something02))
		{
			System.out.println("Wider contains the narrow one.");
		}
		else
		{
			System.out.println("Wider DOES NOT contain the narrow one.");
		}
		
		
		
		if(something02.contains(something01))
		{
			System.out.println("The narrow one contains wider.");
		}
		else
		{
			System.out.println("The narrow one DOES NOT contain wider.");
		}
		
	}

}
