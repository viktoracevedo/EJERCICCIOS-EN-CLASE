package ejercicios;

/**
 * LabCourse
 */
public class LabCourse extends CollegeCourse{
    private boolean lab;
    public LabCourse(DepaEnum departamento, int numCurso, int creditos){
        super(departamento, numCurso, creditos);
        this.lab = departamento.isNumero();
        if(departamento.isNumero()){
            setTarifaCurso(50+120);
            
        }

    }
    public String display(){
        if(this.lab){
            return  "ES UN CURSO DE LABORATORIO " + super.display();

        }
        return super.display();
    }
        
    
}