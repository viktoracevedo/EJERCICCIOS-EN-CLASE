package ejercicios;

/**
 * Person
 */
public class Person {

    private String nombre;
    private String apellido;
    private String direccion;
    private int codigoPostal;
    private int numeroTelefono;
    public void setAll(String nombre, String apellido, String direccion, int codigoPostal, int numeroTelefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.numeroTelefono = numeroTelefono;
    }
    @Override
    public String toString() {
        return "";
    }
    
}