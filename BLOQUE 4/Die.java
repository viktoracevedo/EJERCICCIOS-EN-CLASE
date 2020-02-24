package workclass;

/**
 * nose
 */
public class Die {

     public static int getValorDado(){
         int valor;
         do {
             valor= ((int) (Math.random() * 100)%(6 + 1)); 
         } while (valor==0);
        return valor;
    }
    public static String getGanador(Fivedie compute, Fivedie me){
        String mensaje = "error";
        int v[] = compute.lanzarCincoDados();
        int b[] = me.lanzarCincoDados();
        int aux = 0;
        for (int i = 5; i >= 0 && aux == 0; i--) {
            for (int j = 5; j >= 0 && aux == 0; j--) {
                if((i == j) && (v[i] > b[j])){
                    mensaje = "Computadora gano";
                    aux = 1;
                }
                if((i == j) && (v[i] < b[j])){
                    mensaje = "TU ganste";
                    aux = 1;
                }    
            }
        }
        return mensaje;
            
        
    }
}