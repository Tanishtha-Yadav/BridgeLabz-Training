import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone
{
    public static void main(String[] args)
    {
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current Time in GMT: " + gmtTime.toLocalTime());
        System.out.println("Current Time in IST: " + istTime.toLocalTime());
        System.out.println("Current Time in PST: " + pstTime.toLocalTime());
    }
}
