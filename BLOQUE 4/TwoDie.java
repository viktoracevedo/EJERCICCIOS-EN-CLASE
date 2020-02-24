package workclass;

/**
 * TwoDie
 */
public class TwoDie {
    private int dado1;
    private int dado2;
    private String ganador;
    public TwoDie(){
        this.dado1 = Die.getValorDado();
        this.dado2 = Die.getValorDado();

    }
    public int getDado1(){
        return this.dado1;
    }
    public int getDado2(){
        return this.dado2;
    }
    public String getGanador(){
        if(dado1 > dado2){
            ganador = "EL DADO 1 GANO";
        }
        else{
            ganador = "el dado 2 gano";
        }
        return ganador;
    }
}