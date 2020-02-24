package workclass;

/**
 * ejercicio1
 */
public class FormLetterWriter {
    private String lastName;
    private String firstName;
    public void displaySaturation(String lastName){
        this.lastName = lastName;
        System.out.println("Querido SR." + this.lastName);

    }
    public void displaySaturation(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Dear " + this.firstName + " " + this.lastName);
        System.out.println("gracias por tu reciente orden");
    }
}