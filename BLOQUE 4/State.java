package workclass;

/**
 * State
 */
public class State {

    private String nameEstado1;
    private int poblacionEstado1;
    private String nameEstado2;
    private int poblacionEstado2;
    private City ciudad;
    public State(String nameEstado1, int poblacionEstado1, String nameEstado2, int poblacionEstado2, String nameCiudad, int poblacionCiudad){
        this.nameEstado1 = nameEstado1;
        this.poblacionEstado1 = poblacionEstado1;
        this.nameEstado2 = nameEstado2;
        this.poblacionEstado2 = poblacionEstado2;
        this.ciudad = new City(nameCiudad, poblacionCiudad);
    }
    private class City {
        private String nameCiudad;
        private int poblacionCiudad;
        private City(String nameCiudad, int poblacionCiudad){
            this.nameCiudad = nameCiudad;
            this.poblacionCiudad = poblacionCiudad;
        }
        @Override
        public String toString() {
            return this.nameCiudad + this.poblacionCiudad;
        }
        
    }
    public String getNameEstado1(){
        return this.nameEstado1;
    }
    public int getPoblacionEstado1(){
        return this.poblacionEstado1;
    }
    public String getNameEstado2(){
        return this.nameEstado2;
    }
    public int getPoblacionEstado2(){
        return this.poblacionEstado2;
    }
    public String getCiudad(){
        return this.ciudad + "";
    }
    
    
    
}