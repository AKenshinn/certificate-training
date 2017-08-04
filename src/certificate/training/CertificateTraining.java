package certificate.training;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Calendar.DATE;
import java.util.Collections;
import java.util.List;

public class CertificateTraining {

    public static void main(String[] args) {

        List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
        //listVal.stream().filter(x -> x.length() > 3).count();
        //listVal.stream().map(x -> x.length() > 3).count();
        //listVal.stream().peek(x -> x.length() > 3).count().get();
        //listVal.stream().filter(x -> x.length() > 3).mapToInt(x -> x).count();
        String s = "tt";
        
        System.out.println(listVal.stream().peek(e -> {}).filter(x -> x.length() > 3).count());
    }

}
