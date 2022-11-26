package Salud;
import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in);
        int documento, edad;
        String tipoDoc, nombre, apellido, sexo, resultado;
        Double peso, estatura;
        Double pesoActual;

        /*public void pedirDatos() {
            

            System.out.println("Digite su tipo de documento CC, TI, PP");
            tipoDoc = leer.nextLine();

            System.out.println("Digite su numero de documento");
            documento = leer.nextInt();


            System.out.println("Digite su edad");
            leer.nextLine();
            edad = leer.nextInt();

            System.out.println("Digite su nombre y apellido");
            //leer.nextLine();
            nombre = leer.next();
            leer.nextLine();
            apellido = leer.nextLine();

            System.out.println("Digite su sexo: M o F");
            //leer.nextLine();
            sexo = leer.nextLine();

            System.out.println("Digite peso");
            //leer.nextLine();
            peso = leer.nextDouble();

            System.out.println("Digite estatura");
            leer.nextLine();
            estatura = leer.nextDouble();

        } */
        
        public void mostrarPersona() {

            System.out.println("La persona " + nombre + " " + apellido + " con tipo de documento" + tipoDoc
                    + " numero: " + documento + " de genero " + sexo + " tiene un peso de: " + peso + " Kg, Mide "
                    + estatura + " Mts y tiene " + edad + " Años");
        }

        
        /*public void calcularImc() {

            pesoActual = peso /(Math.pow(estatura, 2));

            if (pesoActual < 20) {
                System.out.println("El peso esta por debajo de lo ideal");
            } else if (pesoActual>=20 || pesoActual <=25) {
                System.out.println("El peso es ideal");

            } else  {
                System.out.println("Tiene sobrepeso");
            }
        }*/
        public String calcularImc() {

            pesoActual = peso /(Math.pow(estatura, 2));

            System.out.println(pesoActual);

            if (pesoActual < 20) {
                resultado="pesobajo";
            } 
            else if (pesoActual ==20 || pesoActual <=25) {
                resultado="pesoideal";
              
            } 
            else  {
                resultado="sobrepeso";
            }
            return resultado;
        }
        
        public void mayorEdad() {
            if (edad >= 18) {
                System.out.println(nombre + " Es mayor de edad");
            } else
                System.out.println(nombre + " Es menor de edad");

        }
}
    
        
    
    

