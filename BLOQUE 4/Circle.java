package workclass;

/**
 * Circle
 */
public class Circle {

    private int radio;
    private int diametro;
    private int area;
    public Circle(){
        this.radio = 1;
        this.diametro = 2*radio;
        this.area = (int)Math.PI*(radio*radio);
    }
    public void setRadio(int radio){
        this.radio = radio;
        this.diametro = 2*radio;
        this.area = (int)Math.PI*(radio*radio);
    }
    public String getRadio(){
        return "su radio es:" + this.radio + " su diametro es: " + this.diametro + " su AREA: " + this.area; 
    }
}