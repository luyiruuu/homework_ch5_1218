package gpt2;
import java.util.*;
import java.text.*;
public class DateDifference {

	public static void main(String[] args) {
		try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = sdf.parse("2024-01-01");
            Date date2 = sdf.parse("2024-12-31");

            long diffInMillis = Math.abs(date2.getTime() - date1.getTime());
            long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);

            System.out.println("Days between " + sdf.format(date1) + " and " + sdf.format(date2) + ": " + diffInDays);
        } catch (ParseException e) {
            e.printStackTrace();
        }

	}

}
