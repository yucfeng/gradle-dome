package hello;

import org.joda.time.DateTime;

public class Hello {
    
    public static void main(String[] args) {
        DateTime dateTime2000Year = new DateTime(2018,2,29,0,0,0);
        System.out.println(dateTime2000Year); // out: 2000-02-29T00:00:00.000+08:00
        DateTime dateTime1997Year = 
                dateTime2000Year.withYear(1997); 
        System.out.println(dateTime1997Year);
    }
}
