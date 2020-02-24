package workclass;

/**
 * Operacion
 */
public class MathTest {
    public double getRaiz(){
        return Math.sqrt(37);
    }
    public double getSeno(){
        return  Math.sin(300);
    }
    public double getCoseno(){
        return Math.cos(300);
    }
    public String getAllOperaciones(){
        return "piso: " + Math.floor(22.8) + " techo: " + Math.ceil(22.8) + " ronda: " + Math.round(22.8) + " minimo:" + Math.min('D', 71) + " maximo: " + Math.max('D', 71) + " numero ramdom: " + (int)(Math.random()*100)%(20+0);
    }
}