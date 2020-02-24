package workclass;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * calendario
 */
public class NextMonth {
    private int num;
    private Calendar fecha = new GregorianCalendar();
    public int getDiaMes() {
        switch(fecha.get(Calendar.MONTH) ){
            case 0: case 2: case 4: case 6: case 7: case 9: case 11:
                num = 31;
                break;
            case 3: case 5: case 8: case 10:
                num = 30;
                break;
            case 1:
                if((fecha.get(Calendar.YEAR)%4)==0){
                    num = 29;
                }
                else{
                    num = 28;
                }
                break;
            default:
                break;
        }
        return  (num - fecha.get(Calendar.DAY_OF_MONTH));
    }

        
    
}