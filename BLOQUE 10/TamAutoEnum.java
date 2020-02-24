package ejercicios;

public enum TamAutoEnum{
    ECONOMICO(1),
    MEDIANO(2),
    COMPLETO(3);
    private int numero;
    
    private TamAutoEnum(int numero) {
        this.numero = numero;
    }
    public int getNum(){
        return this.numero;
    }
}