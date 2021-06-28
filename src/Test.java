import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {

    public static void main(String args[]){

//        String s = "Wed Jun 16 2021 17:21:45 GMT+0530 (India Standard Time)";
////        s = s.replaceAll("\\(.+?\\)", "").replace("GMT", "").trim();
////
////        OffsetDateTime offsetDateTime = OffsetDateTime.parse(s, DateTimeFormatter.ofPattern("EEE MMM dd yyyy HH:mm:ss Z"));
////
////        ZoneOffset offset = offsetDateTime.getOffset();
////        System.out.println(offsetDateTime.getOffset());
////
////        LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
////        System.out.println(offsetDateTime.toLocalDateTime());
////
////        int totalSeconds = offset.getTotalSeconds();
////        System.out.println(offset.getTotalSeconds());

        BigDecimal d = new BigDecimal(Float.parseFloat("12"));
        BigDecimal d2 = new BigDecimal(7.0);

        System.out.println(d.divide(d2, 2, RoundingMode.HALF_UP).setScale(3, RoundingMode.HALF_UP));
    }
}
