package Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestStringDemo {

	public static void main(String[] args) {

SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String date=sdf.format(new Date());
System.out.println(date);


LocalDate localDate=LocalDate.now();
DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/uuuu");
String str1=localDate.format(f);
System.out.println(str1);
Date date2 = new Date();

// 使用 toString() 函数显示日期时间
System.out.println(date2.toString());

/*Date date3 = new Date();

// 使用toString()显示日期和时间
String str5 = String.format(" %tc", date3 );*/
String str5=String.format("%tc", new Date());

System.out.println(str5);




// 使用toString()显示日期和时间
System.out.printf("%1$s %2$tB %2$td, %2$tY", 
                  "Due date:", new Date());
}
	}


