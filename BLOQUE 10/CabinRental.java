package ejercicios;

/**
 * CabinRental
 */
public class CabinRental {

    private int numCabina;
    private double tarifa;
    public CabinRental(int numCabina){
        this.numCabina = numCabina;
        if(numCabina >= 1 && numCabina <= 3){
            this.tarifa = 950.00;
        }
        else{
            this.tarifa = 1100.00;
        }
    }
    public int getNumCabina(){
        return this.numCabina;
    }
    public double getTarifa(){
        return this.tarifa;
    }
    

}