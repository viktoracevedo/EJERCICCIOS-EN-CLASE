package workclass;

/**
 * Fivedie
 */
public class Fivedie {
    private int[] contador;
    private int[] b;
    public Fivedie(){
        int[] inicio= {0, 0, 0, 0, 0, 0};
        this.contador = inicio;
        this.b = inicio;
    }
    public int[] lanzarCincoDados(){
        for (int i = 0; i < 5; i++) { 
            switch (Die.getValorDado()) {
                case 1:
                    b[0]++;
                    break;
                case 2:
                    b[1]++;
                    break;
                case 3:
                    b[2]++;
                    break;
                case 4:
                    b[3]++;
                    break;
                case 5:
                    b[4]++;
                    break;
                case 6:
                    b[5]++;
                    break;
                default:
                    break;
            }    
        }
        for (int i = 0; i < 6; i++) {
            this.contador[i] = b[i];
        }
        return this.contador;
    }
    public String getDados(){
        return "Las veces que cayeron en el..\n numero 6: " + this.contador[5] + "\n numero 5: " + this.contador[4] + "\n numero 4: " + this.contador[3] + "\n numero 3: " + this.contador[2] + "\n numero 2: " + this.contador[1] + "\n numero 1: " + this.contador[0];
    }
}