package ejercicios;

/**
 * Student
 */
public class Student extends Person{
    private String estudio;
    private int promedio;
    public void setEstudiante(String estudio, int promedio){
        this.estudio = estudio;
        this.promedio = promedio;
    }
    @Override
    public String toString() {
        return "estudiante";
    }
    
}