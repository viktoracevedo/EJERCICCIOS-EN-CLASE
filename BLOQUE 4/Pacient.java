package workclass;

/**
 * Pacient
 */
public class Pacient {

    private int edad;
    private int id;
    private BloodData datoSangre;
    public Pacient(){
        this.edad = 0;
        this.id = 0;
        this.datoSangre = new BloodData();
    }
    public Pacient(int edad, int id, SangreEnum tipoSangre, char factorRh){
        this.edad = edad;
        this.id = id;
        datoSangre = new BloodData(tipoSangre, factorRh);
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTipoSangre(SangreEnum tiposangre) {
        this.datoSangre.setTiposangre(tiposangre);
    }
    public void setFactorRh(char factorRh) {
        this.datoSangre.setFactorRh(factorRh);
    }
    public int getEdad() {
        return this.edad;
    }
    public int getId() {
        return this.id;
    }
    public SangreEnum getTipoSangre() {
        return this.datoSangre.getTipoSangre();
    }
    public char getFactorRh() {
        return this.datoSangre.getFactorRh();
    }
}