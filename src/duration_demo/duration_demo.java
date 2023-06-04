package duration_demo;

import java.time.Duration;
import java.time.LocalTime;

public class duration_demo {
    
    public static void main(String[] args) {
        
        LocalTime time = LocalTime.of(8, 15,0);
        
        LocalTime newTime = time.plus(Duration.ofMinutes(15));
        
        System.out.println("Yeni zaman : " + newTime);
        
        
        // eski ve yeni zaman arasındaki fark saniye cinsinde
        long difference = Duration.between(time, newTime).getSeconds();
        
        System.out.println("Fark " + difference + " saniye.");
    }
}
