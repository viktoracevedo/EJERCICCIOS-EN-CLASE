package ejercicios;

/**
 * Hourse
 */
public class Horse {

    private String nombre;
    private HorseColorEnum color;
    private int nacimiento;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setColor(HorseColorEnum color){
        this.color = color;
    }
    public void setNacimiento(int nacimiento){
        this.nacimiento = nacimiento;
    }
    public String getNombre(){
        return this.nombre;
    }
    public HorseColorEnum getColor(){
        return this.color;
    }
    public int getNacimiento(){
        return this.nacimiento;
    }
}
