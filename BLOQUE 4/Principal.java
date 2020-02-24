package workclass;


/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        //1
        FormLetterWriter persona1 = new FormLetterWriter();
        persona1.displaySaturation("Acevedo");
        persona1.displaySaturation("Viktor", "Acevedo");
        System.out.println("\n");
        //2
        Billing persona2 = new Billing();
        System.out.println("con impuesto de 8%: " + persona2.computeBill(1000));
        System.out.println("total que debe: " + persona2.computeBill(1000, 1000));
        System.out.println("total menos el cupon: " + persona2.computeBill(1000, 1000, 500)); 
        System.out.println("\n");
        //3
        BirdSighting bird = new BirdSighting( "tucan", 10, 256);
        System.out.println("especie: " + bird.getEspecie() + " numero vistos: " + bird.getVistazo() + " fecha: " + bird.getDia());
        bird = new BirdSighting();
        System.out.println("especie: " + bird.getEspecie() + " numero vistos: " + bird.getVistazo() + " fecha: " + bird.getDia());
        BirdSighting2 bird2 = new BirdSighting2();
        System.out.println("especie: " + bird2.getEspecie() + " numero vistos: " + bird2.getVistazo() + " fecha: " + bird2.getDia());
        System.out.println("\n");
        //4
        BloodData human1 = new BloodData();
        System.out.println("tipo de sangre: " + human1.getTipoSangre() + " y factor Rh: " + human1.getFactorRh());
        human1 = new BloodData(SangreEnum.AB, '-');
        System.out.println("tipo de sangre: " + human1.getTipoSangre() + " y factor Rh: " + human1.getFactorRh());
        Pacient paciente = new Pacient();
        System.out.println("edad: " + paciente.getEdad() + " ID:" + paciente.getId() + " tipo de sangre: " + paciente.getTipoSangre() + " y factor Rh: " + paciente.getFactorRh());
        System.out.println("\n");
        //5
        Bread pan1 = new Bread("lechuga", 10);
        System.out.println("tipo de pan: " + pan1.getTipoPan() + " calorias: " + pan1.getCaloria() + Bread.MOTTO);
        SandwichFilling contenido = new SandwichFilling("mostaza", 500);
        System.out.println("su contenido es: " + contenido.getTipoRelleno() + " y sus calorias son: " + contenido.getCaloriaRelleno());
        Sandwich combo = new Sandwich("integral", 50, "mermelada", 600);
        System.out.println("el sanwich es de: " + combo.getTipoSandwich() + "y un total de calorias: " + combo.getTotalcalorias());
        System.out.println("\n");
        //6
        Circle figura = new Circle();
        System.out.println(figura.getRadio());
        figura.setRadio(100);
        System.out.println(figura.getRadio());
        System.out.println("\n");
        //7
        MathTest numero = new MathTest();
        System.out.printf("raiz: %.4f seno: %.4f coseno: %.4f", numero.getRaiz(), numero.getSeno(), numero.getCoseno());
        System.out.println(numero.getAllOperaciones());
        System.out.println("\n");
        //8
        NextMonth myday = new NextMonth();
        System.out.println("para el siguiente mes quedan: " + myday.getDiaMes() + " dias restantes"); 
        System.out.println("\n");
        //9
        YearEnd myday2 = new YearEnd();
        System.out.println("para terminar el año quedan: " + myday2.getDiaAnio() + " dias restantes"); 
        System.out.println("\n");
        //10
        CertificateOfDeposit person1 = new CertificateOfDeposit(5, "Acevedo", 500, 12, 04, 2020);
        System.out.println("numero de certificado: " + person1.getNumCertificado() + " apellido: " + person1.getApellido() + " saldo: " + person1.getSaldo() + " fecha inico: " + person1.getFechaEmision() + " fecha vencido: " + person1.getFechaVencido());
        CertificateOfDeposit person2 = new CertificateOfDeposit(10, "perez", 1000, 15, 06, 2000);
        System.out.println("numero de certificado: " + person2.getNumCertificado() + " apellido: " + person2.getApellido() + " saldo: " + person2.getSaldo() + " fecha inico: " + person2.getFechaEmision() + " fecha vencido: " + person2.getFechaVencido());
        System.out.println("\n");
        //11
        State lugar1 = new State("Oaxaca", 10000, "Guerrero", 10000, "Tlaxiaco", 5000);
        System.out.println("nombre de estado1: " + lugar1.getNameEstado1() + " poblacion de estado1: " + lugar1.getPoblacionEstado1() + " nombre de estado 2:" + lugar1.getNameEstado2() + " poblacion de estado2: " + lugar1.getPoblacionEstado2() + " ciudad mas poblada y capital: " + lugar1.getCiudad() );
        State lugar2 = new State("Yucatan", 30000, "Veracruz", 30000, "Ciudad del carmen", 1200);
        System.out.println("nombre de estado1: " + lugar2.getNameEstado1() + " poblacion de estado1: " + lugar2.getPoblacionEstado1() + " nombre de estado 2:" + lugar2.getNameEstado2() + " poblacion de estado2: " + lugar2.getPoblacionEstado2() + " ciudad mas poblada y capital: " + lugar2.getCiudad() );
        System.out.println("\n");
        //JUEGO DEL DADO
        TwoDie dados = new TwoDie();
        System.out.println("el dado1 tuvo: " + dados.getDado1() + " el dado2 tuvo: " + dados.getDado2() + " Ganador: " + dados.getGanador());
        Fivedie computadora = new Fivedie();
        Fivedie usuario = new Fivedie();
        System.out.println(Die.getGanador(computadora, usuario));
        System.out.println("COMPUTADORA " + computadora.getDados());
        System.out.println("USTED " + usuario.getDados());
        
        

    }
}