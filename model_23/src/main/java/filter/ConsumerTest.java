package filter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class ConsumerTest {
    public static void main(String[] args) throws ParseException {
//        Consumer1 consumer1 = new Consumer1();
//        consumer1.sum(x -> {
//            int a = x + 2;
//            System.out.println(a);// 12
//            System.out.println(a + "_");// 12_
//        });
        String queryTime = "20200823T160000Z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        Date date = simpleDateFormat.parse(queryTime);
        Instant instant = date.toInstant();

        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime1 = instant.atZone(zoneId).toLocalDateTime();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.getYear());
        int value = localDateTime.getDayOfWeek().getValue();
        int month = localDateTime.getDayOfMonth();
        LocalDateTime firstDayOfYear = localDateTime.with(TemporalAdjusters.firstDayOfYear()).withHour(0).withMinute(0).withSecond(0).withNano(0);
        LocalDateTime lastDayOfYear = localDateTime.with(TemporalAdjusters.lastDayOfYear()).withHour(23).withMinute(59).withSecond(59).withNano(999*1000000);
        LocalDateTime one = localDateTime.with(TemporalAdjusters.firstDayOfMonth()).withHour(0).withMinute(0).withSecond(0);
        LocalDateTime second = localDateTime.with(TemporalAdjusters.lastDayOfMonth()).withHour(23).withMinute(59).withSecond(59);
        LocalDateTime monday = localDateTime.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY)).plusDays(1).withHour(0).withMinute(0).withSecond(0);
        LocalDateTime sunday = localDateTime.with(TemporalAdjusters.next(DayOfWeek.MONDAY)).minusDays(1).withHour(23).withMinute(59).withSecond(59);
        System.out.println(value+"--本周一: " + monday);
        System.out.println(value+"--本周日: " + sunday);
        System.out.println(month);
        System.out.println("本月第一天："+one);
        System.out.println("本月最后一天"+second);
        System.out.println("本年第一天："+firstDayOfYear);
        System.out.println("本年最后一天："+lastDayOfYear);
    }
}
