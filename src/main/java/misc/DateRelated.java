package misc;

import java.time.Instant;

public class DateRelated {
    public static void main(String[] args) {
        System.out.println("Time now: "+ Instant.ofEpochMilli(1703248045000L).toString());


        String dateString = "2023-12-22T00:00:00Z";
        Instant instant = Instant.parse(dateString);
        long epochSeconds = instant.getEpochSecond();

        // Convert epoch seconds to milliseconds (multiply by 1000)
        long epochMillis = epochSeconds * 1000;

        System.out.println("Long value for " + dateString + ": " + epochMillis);

    }
}
