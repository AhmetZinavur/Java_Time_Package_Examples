package local_time_demo;

import java.time.LocalTime;

public class local_time_demo {
    
    public static void main(String[] args) {
        
        LocalTime now = LocalTime.now();
        
        System.out.println("Şu andaki saat : " + now);
        
        LocalTime time = LocalTime.ofSecondOfDay(3000);
        
        System.out.println("3000. saniye : " + time);
        
        time = LocalTime.parse("20:10");
        
        System.out.println(time);
        
        
    }
}
