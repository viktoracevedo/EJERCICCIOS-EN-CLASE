package ejercicios;

/**
 * ScentedCandle
 */
public class ScentedCandle extends Candle {
    public static final int aux = 3;
    private String aroma;

    public String getAroma() {
        return this.aroma;
    }
    public void setAroma(String aroma) {
        this.aroma = aroma;
    }
    
    public void setAltura(double altura){
        super.setAltura(altura);
        setPrecio(altura* ScentedCandle.aux);
    }
}