package ejercicios;

/**
 * CollegeEmployee
 */
public class CollegeEmployee extends Person{
    private int numeroSeguroSocial;
    private int salarioAnual;
    private int nombreDepartamento;
    public void setUniversidad(int numeroSeguroSocial, int salarioAnual, int nombreDepartamento){
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.salarioAnual = salarioAnual;
        this.nombreDepartamento = nombreDepartamento;

    }
    @Override
    public String toString() {
        return "nose";
    }

    
}
/*
ElegirEnum elegir = ElegirEnum.S;
        do{
            Person[] list = new Person[14];
                for (int i = 0; i < list.length; i++) {
                    if(i <= 4){
                        list[i] = (Person)new CollegeEmployee();
                    }
                    else if(i > 4 && i <= 7 ){
                        list[i] = (Person)new Faculty();
                    }
                    else{
                        list[i] = (Person)new Student();
                    }
                }
            Scanner entrada = new Scanner(System.in);
            System.out.println("ingresa: C F S Q");
            String entradaDatos = entrada.next().toUpperCase();
            elegir = Enum.valueOf(ElegirEnum.class, entradaDatos);
            switch(elegir.getNumber()){
                case 0:
                list[0].setAll("viktor", "acevedo", "allende", 69800, 9312343);
                break;
                case 1:
                list[5].setAll("pepe", "jose", "juarez", 45655, 95321123);
                break;
                case 2:
                list[10].
                break;
                case 3:
                System.out.println("ADIOS..");
                break;
                default:
                System.out.println("error");
                break;
            }
        }while(elegir.getNumber() != 3); */