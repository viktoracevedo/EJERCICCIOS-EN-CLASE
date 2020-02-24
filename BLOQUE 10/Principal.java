package ejercicios;

import java.awt.Color;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * principal
 */
public class Principal {

    public static void main(String[] args) {
        Horse caballo1 = new Racehorse();
        caballo1.setColor(HorseColorEnum.AZABACHE);
        caballo1.setNombre("shuek");
        caballo1.setNacimiento(2020);
        ((Racehorse) caballo1).setNumcarrera(12);
        System.out.println("nombre: " + caballo1.getNombre() + " color: " + caballo1.getColor() + " nacimineto: " + caballo1.getNacimiento() + " numero de carreras: " + ((Racehorse) caballo1).getNumcarrera());
        System.out.println("\n");
        
        Candle vela1 = new Candle();
        vela1.setAltura(30.5);
        vela1.setColor(Color.GREEN);
        System.out.println("altura: " + vela1.getAltura() + " color: " + vela1.getColor() + " precio:$" + vela1.getPrecio());
        vela1 = new ScentedCandle();
        vela1.setAltura(30.5);
        vela1.setColor(Color.BLUE);
        System.out.println("altura: " + vela1.getAltura() + " color: " + vela1.getColor() + " precio:$" + vela1.getPrecio());
        System.out.println("\n");
        
        
        DoublesTennisGame game1 = new DoublesTennisGame();
        game1.setJugadores("batman", "robin");
        game1.setPuntajes(3, 4);
        System.out.println("nombre 1: " + game1.getJugador1() + " puntaje 1: " + game1.getPuntaje1() + " palabra 1: " + game1.getCadenaPuntaje1() + " socio 1: " + game1.getSocio1());
        System.out.println("nombre 2: " + game1.getJugador2() + " puntaje 2: " + game1.getPuntaje2() + " palabra 2: " + game1.getCadenaPuntaje2() + " socio 2: " + game1.getSocio2());
        System.out.println("\n");
        
        Year anio = new Year();
        System.out.println("dias del año: " + anio.getCantidadDias() + " cantidad de dias desde que empezo el año: " + anio.daysElapeds(MesEnum.MARZO, 31) + " dias");
        anio = new LeapYear();
        System.out.println("dias del año: " + anio.getCantidadDias() + " cantidad de dias desde que empezo el año: " + anio.daysElapeds(MesEnum.MARZO, 31) + " dias" );
        System.out.println("\n");
        
        CabinRental renta = new CabinRental(3);
        System.out.println("numero de habitacion: " + renta.getNumCabina() + " tarifa: " + renta.getTarifa());
        renta = new CabinRental(10);
        System.out.println("numero de habitacion: " + renta.getNumCabina() + " tarifa: " + renta.getTarifa());
        renta = new HolidayCabinRental(3);
        System.out.println("numero de habitacion: " + renta.getNumCabina() + " tarifa: " + (renta.getTarifa()+HolidayCabinRental.recargo));
        System.out.println("\n");
        
        Pack paquete = new Pack(13, 'A');
        System.out.println("todos sus campos: " + paquete.display());
        paquete = new InsuredPackage(15, 'T');
        System.out.print("todos sus campos: ");
        System.out.printf("%.39s",paquete.display());
        System.out.println("\n");
        
        CarRental car1 = new CarRental("pepe", 10, TamAutoEnum.COMPLETO, 2);
        System.out.println(car1.Display());
        car1 = new LuxuryCarRental(false,"juan", 11, TamAutoEnum.COMPLETO, 2);
        System.out.println(car1.Display());
        car1 = new LuxuryCarRental(true, "irvin", 12, TamAutoEnum.COMPLETO, 2);
        System.out.println(car1.Display());
        System.out.println("\n");
        
        CollegeCourse curso = new CollegeCourse(DepaEnum.ING, 101, 3);
        System.out.println(curso.display());
        curso = new LabCourse(DepaEnum.BIO, 102, 3);
        System.out.println(curso.display());
        System.out.println("\n");
        
        Vehicle troca = new Vehicle(5, 2000);
        System.out.println(troca.toString());
        troca = new Car(1000);
        System.out.println(troca.toString());
        troca = new MotorCycle(500);
        System.out.println(troca.toString());
        System.out.println("\n");

        
        Juego yo = new Juego();
        int cambio = 0;
        int num= 0;
        int valor= 0;
        do {
            //Scanner entrada = new Scanner(System.in);
            System.out.println(" dame un numero: ");
            num = yo.darNumeroRandom(valor);
            valor = yo.JugarNumero(num);
            if(valor == 0){
                cambio = 10;
            }
            cambio++;
        } while (cambio < 7);
        //String.format("%d", 13);

    }
    
    
}