package ejercicios;
/**
 * Year
 */
public class Year {

    protected int cantidadDias;
    public Year(){
        this.cantidadDias = 365;
    }
    public int getCantidadDias(){
        return this.cantidadDias;
    }
    public int daysElapeds(MesEnum mes, int dia){
        switch(mes.getNumeroEnum()){
            case 2:
            dia += 31;
            break;
            case 3:
            dia += 59;
            break;
            case 4:
            dia += 90;
            break;
            case 5:
            dia += 30;
            break;
            case 6:
            dia += 151;
            break;
            case 7:
            dia += 181;
            break;
            case 8:
            dia += 212;
            break;
            case 9:
            dia += 243;
            break;
            case 10:
            dia += 273;
            break;
            case 11:
            dia += 304;
            break;
            case 12:
            dia += 334;
            break;
        }
        return dia;
    }
}