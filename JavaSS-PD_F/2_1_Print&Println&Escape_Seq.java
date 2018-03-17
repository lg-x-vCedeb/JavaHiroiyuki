package 2_1_Print&Println&Escape_Seq_RecordTime;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PrintPrintlnEscape_Seq_RecordTime {
	public static void main(String[] args) {
		System.out.println("  \"I made this letter longer than usual "
				+ "because I lack the time to \nmake it short.\"");
		System.out.print("  Blaisse Pascal\n");
		
		String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(new Date());  
	    System.out.println("Now is:\n" + str); 
		
	    Calendar cale = Calendar.getInstance();
		Date tasktime = cale.getTime();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println(df.format(tasktime));
		
	}
}
