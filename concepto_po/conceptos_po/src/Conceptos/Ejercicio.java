package Conceptos;
import java.util.Scanner;



import Sena.Aprendiz;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Aprendiz mipersona=new Aprendiz();

        System.out.println("ingrese el id");
        mipersona.id=leer.nextLine(); 

        System.out.println("ingrese su nombre completo ");
        mipersona.nombre=leer.nextLine();

        System.out.println("ingrese su direccion de vivinedo en donde reside");
        mipersona.direccion=leer.nextInt();

        System.out.println("ingrese el numer de ficha a la cual pertenece ");
        mipersona.ficha=leer.nextInt();

        //limpiar el bufer
        leer.nextInt();

        System.out.println("ingrese la materias la cuales ve x trimestre");
        mipersona.materia=leer.nextLine();

        System.out.println("carlos tiene una identificacin"+mipersona.id+"se encuentra en la ficha"+mipersona.ficha);

        leer.close();
        
    }
    
}
