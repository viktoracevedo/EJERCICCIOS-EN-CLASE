package workclass;

/**
 * BirdSighting
 */
public class BirdSighting {
    private String especie;
    private int vistazo;
    private int dia;
    private String fecha;
    public BirdSighting(){
        this.especie = "robin";
        this.vistazo = 1;
        this.dia = 1;
    }
    public BirdSighting(String especie, int vistazo, int dia){
        this.especie = especie;
        this.vistazo = vistazo;
        this.dia = dia;
    }
    public String getEspecie() {
        return this.especie;
    }
    public int getVistazo() {
        return this.vistazo;
    }
    public String getDia() {
        if(this.dia >= 1 && this.dia<= 31 ){
            fecha = "Enero";
            this.dia = this.dia - 0;
        }
        else if(this.dia >= 32 && this.dia<= 59 ){
            fecha = "Febrero";
            this.dia = this.dia - 31;
        }
        else if(this.dia >= 60 && this.dia<= 90 ){
            fecha = "Marzo";
            this.dia = this.dia - 59;
        }
        else if(this.dia >= 91 && this.dia<= 120 ){
            fecha = "Abril";
            this.dia = this.dia - 90;
        }
        else if(this.dia >= 121 && this.dia<= 151 ){
            fecha = "Mayo";
            this.dia = this.dia - 120;
        }
        else if(this.dia >= 152 && this.dia<= 181 ){
            fecha = "Junio";
            this.dia = this.dia - 151;
        }
        else if(this.dia >= 182 && this.dia<= 212 ){
            fecha = "Julio";
            this.dia = this.dia - 181;
        }
        else if(this.dia >= 213 && this.dia<= 243  ){
            fecha = "Agosto";
            this.dia = this.dia - 212;
        }
        else if(this.dia >= 243 && this.dia<= 273  ){
            fecha = "septiembre";
            this.dia = this.dia - 243;
        }
        else if(this.dia >= 274 && this.dia<= 304  ){
            fecha = "Octubre";
            this.dia = this.dia - 273;
        }
        else if(this.dia >= 305 && this.dia<= 334  ){
            fecha = "Noviembre";
            this.dia = this.dia - 304;
        }
        else if(this.dia >= 335 && this.dia<= 365  ){
            fecha = "Diembre";
            this.dia = this.dia - 334;
        }
        return fecha + " " + this.dia;
    }
}