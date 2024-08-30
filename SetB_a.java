import java.text.SimpleDateFormat;
import java.util.Date;

public class SetB_a
{
    public static void main(String args[])
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Current date is:"+strDate);

        formatter = new SimpleDateFormat("MM-dd-yyyy");
        strDate = formatter.format(date);
        System.out.println("Current date is:"+strDate);

        formatter = new SimpleDateFormat("EEEEE MMMM dd yyyy");
        strDate = formatter.format(date);
        System.out.println("Current date is:"+strDate);

        formatter = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        strDate = formatter.format(date);
        System.out.println("Current date and time is:"+strDate);

        formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        strDate = formatter.format(date);
        System.out.println("Current date and time is:"+strDate);

        formatter = new SimpleDateFormat("hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Current time is:"+strDate);

        formatter = new SimpleDateFormat("w");
        strDate = formatter.format(date);
        System.out.println("Current week of the year is:"+strDate);

        formatter = new SimpleDateFormat("W");
        strDate = formatter.format(date);
        System.out.println("Current weak of the month is:"+strDate);

        formatter = new SimpleDateFormat("D");
        strDate = formatter.format(date);
        System.out.println("Current day of the year:"+strDate);
    }
}