package ejercicios;

/**
 * TennGame
 */
public class TennisGame {

    private String jugador1;
    private String jugador2;
    private int puntaje1;
    private int puntaje2;
    private String CadenaPuntaje1;
    private String CadenaPuntaje2;
    public String getJugador1(){
        return this.jugador1;
    }
    public String getJugador2(){
        return this.jugador2;
    }
    public String getCadenaPuntaje1(){
        return this.CadenaPuntaje1;
    }
    public String getCadenaPuntaje2(){
        return this.CadenaPuntaje2;
    }
    public int getPuntaje1(){
        return this.puntaje1;
    }
    public int getPuntaje2(){
        return this.puntaje2;
    }

    public void setJugadores(String jugador1, String jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }
    
    public void setPuntajes(int puntaje1, int puntaje2){
        
        this.CadenaPuntaje1 = TennisGame.setCadena(puntaje1);
        this.CadenaPuntaje2 = TennisGame.setCadena(puntaje2);
        if(puntaje1 > 4 || puntaje2 > 4 || puntaje1 < 0 || puntaje2 < 0){
            puntaje1 = 0;
            puntaje2 = 0;
            this.CadenaPuntaje1 = "ERROR";
            this.CadenaPuntaje2 = "ERROR";
        }
        else if(puntaje1 == 4 && puntaje2 == 4){
            puntaje1 = 0;
            puntaje2 = 0;
            this.CadenaPuntaje1 = "ERROR";
            this.CadenaPuntaje2 = "ERROR";

        }
        this.puntaje1 = puntaje1;
        this.puntaje2 = puntaje2;
        this.CadenaPuntaje1 = TennisGame.setCadena(this.puntaje1);
        this.CadenaPuntaje2 = TennisGame.setCadena(this.puntaje2);
    }
    private static String setCadena(int puntaje){
        String cadena = "";
        if(puntaje == 0){
            cadena = "LOVE";
        }
        else if(puntaje == 1){
            cadena = "QUINCE";
        }
        else if(puntaje == 2){
            cadena = "TREINTA";
        }
        else if(puntaje == 3){
            cadena = "CUARENTA";
        }
        else if(puntaje == 4){
            cadena = "GAME";
        }
        return cadena;
    }
}