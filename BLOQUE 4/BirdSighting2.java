package workclass;

/**
 * BirdSighting
 */
public class BirdSighting2 {
    private String especie;
    private int vistazo;
    private int dia;
    private String dato;
    private BirdSighting2(String especie, int vistazo, int dia){
        this.especie = especie;
        this.vistazo = vistazo;
        this.dia = dia;
    }
    public BirdSighting2(){
        this("piolin", 10, 234);
    }
    public String getEspecie() {
        return this.especie;
    }
    public int getVistazo() {
        return this.vistazo;
    }
    public String getDia() {
        if(this.dia >= 1 && this.dia<= 31 ){
            dato = "Enero";
            this.dia = this.dia - 0;
        }
        else if(this.dia >= 32 && this.dia<= 59 ){
            dato = "Febrero";
            this.dia = this.dia - 31;
        }
        else if(this.dia >= 60 && this.dia<= 90 ){
            dato = "Marzo";
            this.dia = this.dia - 59;
        }
        else if(this.dia >= 91 && this.dia<= 120 ){
            dato = "Abril";
            this.dia = this.dia - 90;
        }
        else if(this.dia >= 121 && this.dia<= 151 ){
            dato = "Mayo";
            this.dia = this.dia - 120;
        }
        else if(this.dia >= 152 && this.dia<= 181 ){
            dato = "Junio";
            this.dia = this.dia - 151;
        }
        else if(this.dia >= 182 && this.dia<= 212 ){
            dato = "Julio";
            this.dia = this.dia - 181;
        }
        else if(this.dia >= 213 && this.dia<= 243  ){
            dato = "Agosto";
            this.dia = this.dia - 212;
        }
        else if(this.dia >= 243 && this.dia<= 273  ){
            dato = "septiembre";
            this.dia = this.dia - 243;
        }
        else if(this.dia >= 274 && this.dia<= 304  ){
            dato = "Octubre";
            this.dia = this.dia - 273;
        }
        else if(this.dia >= 305 && this.dia<= 334  ){
            dato = "Noviembre";
            this.dia = this.dia - 304;
        }
        else if(this.dia >= 335 && this.dia<= 365  ){
            dato = "Diembre";
            this.dia = this.dia - 334;
        }
        return dato +" " + this.dia;
    }
}