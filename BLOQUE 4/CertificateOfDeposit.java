package workclass;

/* import java.util.Calendar;
import java.util.GregorianCalendar; */

/**
 * CertificateOfDeposit
 */
public class CertificateOfDeposit {

    private int numCertificado;
    private String apellido;
    private int saldo;
    private String fechaEmision;
    private String fechaVencido;
    public CertificateOfDeposit(int numCertificado, String apellido, int saldo, int dia, int mes, int anio ){
        this.numCertificado = numCertificado;
        this.apellido = apellido;
        this.saldo =  saldo;
        this.fechaEmision = dia + "/" + mes + "/" + anio;
        this.fechaVencido = dia + "/" + mes + "/" + (anio + 1);
    }
    public void setNumCertificado(int numCertificado){
        this.numCertificado = numCertificado;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setSaldo(int saldo){
        this.saldo =  saldo;
    }
    public void setFechaEmision(int dia, int mes, int anio){
        this.fechaEmision = dia + "/" + mes + "/" + anio;
    }
    public int getNumCertificado(){
        return this.numCertificado;
    }
    public String getApellido(){
        return  this.apellido;
    }
    public int getSaldo(){
        return this.saldo;
    }
    public String getFechaEmision(){
        return this.fechaEmision;
    }
    public String getFechaVencido(){
        return this.fechaVencido;
    }

}