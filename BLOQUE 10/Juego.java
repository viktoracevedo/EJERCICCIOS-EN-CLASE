package ejercicios;
/**
 * Juego
 */
public class Juego {
    private int numeroRamdom;
    private int numeroDar;
    private int vidas;
    private int numeroEstatico;
    public Juego(){
        this.numeroRamdom = (int) (Math.random() * 100);
        this.numeroDar = (int) (Math.random() * 100);
        this.numeroEstatico = this.numeroDar;
        this.vidas = 7;
        System.out.println(this.numeroRamdom);
    }
    public int JugarNumero(int numeroIngresado){
        PalabaEnum valor = PalabaEnum.PERDISTEEEE;
        if(numeroIngresado == numeroRamdom){
            valor = PalabaEnum.GANASTE;
            
        }
        else if(numeroIngresado < numeroRamdom){
            valor = PalabaEnum.MAS_ARRIBA;
        }
        else if(numeroIngresado > numeroRamdom){
            valor = PalabaEnum.MAS_ABAJO;
        }
        this.vidas--;
        if(this.vidas == 0 && valor.darNumber() != 0){
            valor = PalabaEnum.PERDISTEEEE;
        }
        if(this.numeroEstatico == this.numeroDar){
            if(valor.darNumber() == 1){
                this.numeroEstatico = 101;
            }
            else if(valor.darNumber() == -1){
                this.numeroEstatico = -1;
    
            }
        }
        System.out.println(valor + " vidas: " + this.vidas);
        return valor.darNumber();
    }
    
    public int darNumeroRandom(int valor){
        int nuevoNumero = 0;
        if( valor == 1){
            if(this.numeroEstatico <= this.numeroDar){
                this.numeroEstatico = 101;
            }
            do {
                nuevoNumero = (int) (Math.random() * 100);
            } while (nuevoNumero <= this.numeroDar || nuevoNumero >= this.numeroEstatico );
            this.numeroEstatico = this.numeroDar;
            this.numeroDar = nuevoNumero;
        }
        else if(valor == -1){
            
            if(this.numeroEstatico >= this.numeroDar){
                this.numeroEstatico = -1;
            }
            do {
                nuevoNumero = (int) (Math.random() * 100);
            } while (nuevoNumero >= this.numeroDar || nuevoNumero <= this.numeroEstatico);
            this.numeroEstatico = this.numeroDar;
            this.numeroDar = nuevoNumero;
        }
        System.out.println(this.numeroDar);
        return this.numeroDar;
    }
}
enum PalabaEnum{
    GANASTE(0),
    PERDISTEEEE(10),
    MAS_ARRIBA(1),
    MAS_ABAJO(-1);
    private int number;
    private PalabaEnum(int number){
        this.number = number;
    }
    public int darNumber(){
        return this.number;
    }
}