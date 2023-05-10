package Academy.AgainSomething;

public class AustralianTraffic273 implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CentralTraffic a = new AustralianTraffic273(); //This "a" is an pobject of this interface CentralTraffic
		a.redStop();
		a.greenGo();
		a.yellowFlash();
		
		AustralianTraffic273 b = new AustralianTraffic273(); //This "b" is an object of this Class AustralianTraffic
		b.walkOn();
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green light implementation.");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red light implementation.");
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("Yellow light implementation.");
	}
	
	public void walkOn()
	{
		System.out.println("Pedestrians can walk now.");
	}

}
