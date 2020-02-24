package workclass;

/**
 * BloodData
 */
public class BloodData {

    private SangreEnum tipoSangre;
    private char factorRh;
    
    public BloodData(){
        this.tipoSangre = SangreEnum.O;
        this.factorRh = '+';

    }
    public BloodData(SangreEnum tipoSangre, char factorRh){
        this.tipoSangre = tipoSangre;
        this.factorRh = factorRh;
    }
    public void setTiposangre(SangreEnum tiposangre) {
        this.tipoSangre = tiposangre;
    }
    public void setFactorRh(char factorRh) {
        this.factorRh = factorRh;
    }
    public SangreEnum getTipoSangre() {
        return this.tipoSangre;
    }
    public char getFactorRh() {
        return this.factorRh;
    }
        
    
}