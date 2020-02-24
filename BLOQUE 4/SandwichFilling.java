package workclass;

/**
 * SandwichFilling
 */
public class SandwichFilling {

    private String tipoRelleno;
    private int caloriaRelleno;
    public SandwichFilling(String tipoRelleno, int caloriaRelleno){
        this.tipoRelleno = tipoRelleno;
        this.caloriaRelleno = caloriaRelleno;
    }
    public String getTipoRelleno(){
        return this.tipoRelleno;
    }
    public int getCaloriaRelleno(){
        return this.caloriaRelleno;
    }
}