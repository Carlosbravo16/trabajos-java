package retos;
import java.util.Scanner;


public class Reto5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String nombre, apellido;

        System.out.println("digite su nombre");
        nombre=leer.next();

        System.out.println("digite su apellido");
        apellido=leer.next();

        int length=nombre.length();
        System.out.println("la longitud de su nombre es " +length);
        System.out.println(nombre.toUpperCase());
        System.out.println(apellido.toLowerCase());

       

        String subnombre = nombre.substring(0,2);
        System.out.println(subnombre);
        System.out.println(subnombre+apellido);
        leer.close();

    }
    
}
