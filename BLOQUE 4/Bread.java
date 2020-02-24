package workclass;

/**
 * Bread
 */
public class Bread {

    private String tipoPan;
    private int caloria;
    public static final String MOTTO = "El personal de la vida";
    public Bread(String tipoPan, int caloria){
        this.tipoPan = tipoPan;
        this.caloria = caloria;
    }
    public String getTipoPan(){
        return this.tipoPan;
    }
    public int getCaloria(){
        return this.caloria;
    }
}