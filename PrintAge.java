//Set of time functions.
import java.time.LocalDate;

public class PrintAge {
        //Get year when born.
        public static int getBirthYear(int age) {
            LocalDate now = LocalDate.now();
            int thisYear = now.getYear();
            return thisYear-age;
        }
}
