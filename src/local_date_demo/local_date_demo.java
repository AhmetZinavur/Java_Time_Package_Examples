package local_date_demo;

import java.time.LocalDate;

public class local_date_demo {
    
    public static void main(String[] args) {
        
        LocalDate birthdate = LocalDate.of(2000, 9, 1);
        
        System.out.println("Doğum günü: " + birthdate);
        
        LocalDate date = LocalDate.now();
        
        System.out.println("Bugünün tarihi : " + date);
        
        date = LocalDate.ofYearDay(2023, 100);
        
        System.out.println("2023 yılının 100. günü " + date);       
        
    }
   
}
