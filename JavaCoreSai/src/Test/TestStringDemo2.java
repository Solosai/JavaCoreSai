package Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestStringDemo2 {

	public static void main(String[] args) throws InterruptedException  {
		String months[] = {
			      "Jan", "Feb", "Mar", "Apr",
			      "May", "Jun", "Jul", "Aug",
			      "Sep", "Oct", "Nov", "Dec"};
		int year;
		 GregorianCalendar gcalendar = new GregorianCalendar();
	      // 显示当前时间和日期的信息
	      System.out.print("Date: ");
	      System.out.print(months[gcalendar.get(Calendar.MONTH)]);
	      System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
	      System.out.println(year = gcalendar.get(Calendar.YEAR));
	      System.out.print("Time: ");
	      System.out.print(gcalendar.get(Calendar.HOUR) + ":");
	      System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
	      System.out.println(gcalendar.get(Calendar.SECOND));
	      if(gcalendar.isLeapYear(year)) {
	          System.out.println("当前年份是闰年");
	       }
	       else {
	          System.out.println("当前年份不是闰年");
	       }
	    }
	 
	         
	      
	   }

	


