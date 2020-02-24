package ejercicios;
import java.awt.Color;
/**
 * Candle
 */
public class Candle {

    private Color color;
    private double altura;
    public static final int aux = 2;
    private int precio;
    public Color getColor() {
        return this.color;
    }
    public double getAltura() {
        return this.altura;
    }
    public int getPrecio() {
        return this.precio;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void setAltura(double altura){
        setPrecio(altura*aux);
        this.altura = altura;
    }
    protected void setPrecio(double precio){
        this.precio = (int)precio;
    }
    
}