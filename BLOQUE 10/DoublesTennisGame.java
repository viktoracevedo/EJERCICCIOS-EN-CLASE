package ejercicios;

/**
 * DoublesTennisGame
 */
public class DoublesTennisGame extends TennisGame{

    private String socio1;
    private String socio2;
    public void setJugadores(String socio1, String socio2){
        super.setJugadores("pepe", "juan");
        this.socio1 = socio1;
        this.socio2 = socio2;
    }
    public String getSocio1() {
        return socio1; 
    }
    public String getSocio2() {
        return socio2;
    }
}