package ejercicios;

public enum DepaEnum {
    BIO(true),
    CHM(true),
    CIS(true),
    PHY(true),
    ING(false),
    ENG(false),
    HIS(false),
    MAT(false);
    private boolean numero;
    private DepaEnum(boolean numero){
        this.numero = numero;
    }
    public boolean isNumero(){
        return this.numero;
    }
}
