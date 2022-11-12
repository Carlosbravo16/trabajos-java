package retos;
import java.util.Scanner;
public class Reto3_7 {
    public static void main(String[] args) {
        Scanner eleccion=new Scanner(System.in);
       
        int aleatorio=0, respuesta, apuesta, acumulador=0, contador=0;
        char co=1;
        System.out.println("Ingrese el valor que desesa recargar");
        acumulador=eleccion.nextInt();
            do{
                System.out.println("Ingrese el valor que desea apostar");
                apuesta=eleccion.nextInt();
                System.out.println("Seleccione 1 para elegir car o 2 para elegir sello");
                respuesta=eleccion.nextInt();
                System.out.println("La moneda se esta lanzando");
                aleatorio=(int)(Math.random()*2)+1;
                if(aleatorio==1 && respuesta==1){
                    System.out.println("Salio cara, usted escogio cara, ¡¡Ganaste!!...");
                    acumulador=acumulador+apuesta;
                    contador=contador+1;
                }
                else if(aleatorio==1 && respuesta==2){
                    System.out.println("Salio cara, usted escogio sello, ¡¡Perdiste!!...");
                    acumulador=acumulador-apuesta;
                    contador=contador+1;
                    if(acumulador<=0){
                        System.out.println("Saldo es insuficiente.");
                        break;
                    }
                }
                else if(aleatorio==2 && respuesta==2){
                    System.out.println("Salio sello, usted escogio sello, ¡¡Ganaste!!...");
                    acumulador=acumulador+apuesta;
                    contador=contador+1;
                }
                else if(aleatorio==2 && respuesta==1){
                    System.out.println("Salio sello, usted escogio cara, ¡¡Perdiste!!...");
                    acumulador=acumulador-apuesta;
                    contador=contador+1;
                    if(acumulador<=0){
                        System.out.println("Saldo insuficiente.");
                        break;
                    }
                }
                eleccion.nextLine();
                System.out.println("Escriba si para volver a jugar o no para salir");
                co=eleccion.nextLine().charAt(0);
                System.out.println("El dinero que acumulo es "+acumulador);
            }
            while(co=='s' || co=='S');
            eleccion.close();
    }
}
