import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Pattern;

public class Test {

    public static void main(String args[]){

//        BigDecimal d = new BigDecimal(Float.parseFloat("12"));
//        BigDecimal d2 = new BigDecimal(7.0);
//
//        System.out.println(d.divide(d2, 2, RoundingMode.HALF_UP).setScale(3, RoundingMode.HALF_UP));

        boolean check = Pattern.matches("^(loancharacterization-).*$", "loancharacterization-");
        System.out.println(check);
    }
}
