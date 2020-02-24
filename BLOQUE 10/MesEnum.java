package ejercicios;

public enum MesEnum{
    ENERO(1),
    FEBRERO(2),
    MARZO(3),
    ABRIL(4),
    MAYO(5),
    JUNIO(6),
    JULIO(7),
    AGOSTO(8),
    SEPTIEMBRE(9),
    OCTUBRE(10),
    NOVIEMBRE(11),
    DICIEMBRE(12);
    private int numero;
    private MesEnum(int numero){
        this.numero = numero;
    }
    public int getNumeroEnum(){
        return this.numero;
    }
}