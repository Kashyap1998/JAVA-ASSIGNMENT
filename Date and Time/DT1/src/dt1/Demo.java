package dt1;
import java.util.Date;

public class Demo {

	

	public static void main(String[] args) {
	       Date current_date=new Date();
	       System.out.println("The current date is:" +current_date);
	       java.text.SimpleDateFormat formatTime=new java.text.SimpleDateFormat("hh.mm aa");
           String result_time=formatTime.format(current_date);
           System.out.println("\nThe current Time in AM/PM format is: " + result_time);
	}

}
