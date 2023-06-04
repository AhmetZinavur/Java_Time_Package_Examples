package format_date_time_formatter_demo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class format_date_time_formatter_demo {
    
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        System.out.println("Default Format : " + date);
        
        System.out.println("==========================");
        System.out.println("==========================");
        
        System.out.println("Format 1 :" + date.format(DateTimeFormatter.ofPattern("d-MM-YYYY")));
        System.out.println("Format 2 :" + date.format(DateTimeFormatter.ofPattern("d-MMM-YYYY")));
        System.out.println("Format 3 :" + date.format(DateTimeFormatter.ofPattern("d-MMMM-YYYY")));
        
        LocalTime time = LocalTime.now();
        System.out.println("Default Format : " + time);
        
        System.out.println("==========================");
        System.out.println("==========================");
        
        System.out.println("Format 1 :" + time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
