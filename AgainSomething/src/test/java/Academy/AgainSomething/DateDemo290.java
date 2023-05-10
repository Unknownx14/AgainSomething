package Academy.AgainSomething;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo290 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date d = new Date();
		System.out.println(d.toString()); //For current date and time
		
		//mm//dd/yyyy HH:MM:SS
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sdf02 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		sdf.format(d);
		System.out.println(sdf.format(d));
		System.out.println(sdf02.format(d));
		
	}

}
