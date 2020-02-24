package workclass;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * YearEnd
 */
public class YearEnd {
    private Calendar fecha = new GregorianCalendar();
    public int getDiaAnio() {
        return  (365 - fecha.get(Calendar.DAY_OF_YEAR));
    }
}