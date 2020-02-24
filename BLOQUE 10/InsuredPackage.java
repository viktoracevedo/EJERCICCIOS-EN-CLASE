package ejercicios;

/**
 * InsuredPackage
 */
public class InsuredPackage extends Pack{
    public InsuredPackage(int peso, char metodoEnvio){
        super(peso, metodoEnvio);
           setPesoEnvio(peso, metodoEnvio);
           this.CalculateCost(peso, metodoEnvio);
    }
    private void CalculateCost(int peso, char metodoEnvio){
        double costo = 0;
        if(getCostoEnvio() <= 1.00){
            costo = getCostoEnvio() + 1.00;
        }
        else if(getCostoEnvio() > 1.00 && getCostoEnvio() <= 3.00){
            costo = getCostoEnvio() + 3.95;
            
        }
        else{
            costo = getCostoEnvio() + 5.55;

        }
        setCostoEnvio(costo);
    }
}