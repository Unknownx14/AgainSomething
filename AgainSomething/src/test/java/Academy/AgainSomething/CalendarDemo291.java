package Academy.AgainSomething;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo291 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf02 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf02.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		
	}

}
