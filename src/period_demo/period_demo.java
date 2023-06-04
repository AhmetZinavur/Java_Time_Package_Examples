package period_demo;

import java.time.LocalDate;
import java.time.Period;

public class period_demo {
    
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.of(2000,8,8);
        
        // tarihe 15 gün ekledim 
        LocalDate newDate = date.plus(Period.ofDays(15));
        
        System.out.println("Yeni Tarih : " + newDate);
        
        // yeni ile eski tarih arasındaki fark
        int difference = Period.between(date, newDate).getDays();
        
        System.out.println("Fark " +  difference + " gün");
        
    }
}
