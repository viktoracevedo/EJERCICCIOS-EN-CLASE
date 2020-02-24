package ejercicios;

/**
 * ElegirEnum
 */
public enum ElegirEnum {
    C(0),F(1),S(2),Q(3);
    private int number;
    private ElegirEnum(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }


    
}