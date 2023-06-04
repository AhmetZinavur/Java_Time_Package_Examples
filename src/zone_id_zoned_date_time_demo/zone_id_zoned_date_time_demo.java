package zone_id_zoned_date_time_demo;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class zone_id_zoned_date_time_demo {
    
    public static void main(String[] args) {
        
        ZoneId timeZone = ZoneId.of("Asia/Hong_Kong");
        
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        
        System.out.println("Benim time zone m: " + zonedDateTime);
        
        zonedDateTime = ZonedDateTime.now(timeZone);
        
        System.out.println("Belirlediğim time zone : " + zonedDateTime);
        
//        System.out.println("Sistemin sağladığı time zone'lar : ");
//        for(String zone : ZoneId.getAvailableZoneIds()) {
//            System.out.println(zone);
//        }
        
        System.out.println("Zoned Date Time - Local Date Time : " + zonedDateTime.toLocalDateTime());
        
        Set<String> allTimeZoneId = ZoneId.getAvailableZoneIds();
        
        for (String zoneIds : allTimeZoneId) {
            System.out.println(zoneIds);
        }
    }
}
