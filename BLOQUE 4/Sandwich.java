package workclass;

/**
 * Sandwich
 */
public class Sandwich {

    private Bread pan;
    private SandwichFilling relleno;
    public Sandwich(String tipoPan, int caloria, String tipoRelleno, int caloriaRelleno){
        pan = new Bread(tipoPan, caloria);
        relleno = new SandwichFilling(tipoRelleno, caloriaRelleno);
    }
    public int getTotalcalorias(){
        return (2*this.pan.getCaloria()) + this.relleno.getCaloriaRelleno();
    }
    public String getTipoSandwich(){
        return this.pan.getTipoPan() + " y " + this.relleno.getTipoRelleno();
    }
}