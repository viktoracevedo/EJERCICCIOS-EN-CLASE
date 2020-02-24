package workclass;

/**
 * Billing
 */
public class Billing {
    private int precio;
    private int cantidad;
    public int computeBill(int precio){
        this.precio = (precio + (precio*8)/100);
        return this.precio;
    }
    public int computeBill(int precio, int cantidad){
        this.precio = precio;
        this.cantidad = cantidad;
        int total =(this.cantidad+this.precio) + (((this.cantidad+this.precio)*8)/100);
        return total; 
    }
    public int computeBill(int precio, int cantidad, int cupon){
        this.precio = precio;
        this.cantidad = cantidad;
        int total = ((this.cantidad+this.precio) + (((this.cantidad+this.precio)*8)/100)) - cupon;
        return total; 
    }
    
}