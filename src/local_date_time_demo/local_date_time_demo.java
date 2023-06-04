package local_date_time_demo;

import java.time.LocalDateTime;

public class local_date_time_demo {
    
    public static void main(String[] args) {
        
        LocalDateTime dateTime = LocalDateTime.now();
        
        System.out.println("Bugünün tarih ve saati : " + dateTime);
        
        dateTime = dateTime.plusDays(2).plusMinutes(30);
        
        System.out.println("Şimdiden 2 saat 30 dakika sonrası : " + dateTime);
    }
}
