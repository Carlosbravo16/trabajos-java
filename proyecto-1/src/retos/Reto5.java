import java.util.Scanner;

import javax.xml.transform.Source;
public class Reto5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String nombre, apellido, nombrecmpleto;

        System.out.println("digitesu nombre");
        nombre=leer.next();

        System.out.println("digite su apellido");
        apellido=leer.next();

        int length=nombre.length();
        System.out.println("la longitud de su nombre es " +length);
        System.out.println(nombre.toUpperCase());
        System.out.println(apellido.toLowerCase());

        nombrecmpleto=nombre + apellido;
        System.out.println("nombrecompleto");

        String subnombre = nombre.substring(0,2);
        System.out.println(subnombre);
        System.out.println(subnombre+apellido);

    }
    
}
