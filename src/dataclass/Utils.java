package dataclass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static String formatoDataBr(final LocalDate data) {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data);
    }

}
