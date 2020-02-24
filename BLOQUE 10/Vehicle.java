package ejercicios;

/**
 * Vehicle
 */
public class Vehicle {

    private int cantidadRuedas;
    private int millasPorGalon;
    public Vehicle(int cantidadRuedas, int millasPorGalon){
        this.cantidadRuedas = cantidadRuedas;
        this.millasPorGalon = millasPorGalon;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "cantidad de ruedas: " + this.cantidadRuedas + " Millas por galon: " + this.millasPorGalon;
    }
}