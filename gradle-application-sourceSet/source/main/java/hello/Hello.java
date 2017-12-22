package hello;

import org.joda.time.DateTime;

public class Hello {

    public static void main(String[] args) {
        DateTime dateTime2000Year = new DateTime(2000, 2, 29, 0, 0, 0);
        System.out.println(dateTime2000Year); // 2000-02-29T00:00:00.000+08:00
        DateTime dateTimeYear = dateTime2000Year.withYear(Integer.parseInt(args[0]));
        System.out.println(dateTimeYear);
    }
}
