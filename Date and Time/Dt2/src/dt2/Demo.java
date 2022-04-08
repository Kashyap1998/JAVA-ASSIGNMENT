package dt2;
import java.util.*;
import java.time.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Demo {

	public static void main(String[] args) {
		//Date current_Date=new Date();
		//System.out.println(current_Date);
		//LocalDate date=LocalDate.now();
		//System.out.println(date);
		Date localTime=new Date();
		DateFormat s=new SimpleDateFormat("dd/mm/yyyy" +" "+"HH:mm:ss");
		s.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println("local Time:" + localTime);
		System.out.println("Time IN Gmt: " + s.format(localTime));
		Date current_date=new Date();
	       System.out.println("The current date is:" +current_date);
	       java.text.SimpleDateFormat formatTime=new java.text.SimpleDateFormat("hh.mm aa");
        String result_time=formatTime.format(current_date);
        System.out.println("\nThe current Time in AM/PM format is: " + result_time);
	}
}