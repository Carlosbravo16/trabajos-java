package Sena;

import java.util.Scanner;
import Sena.Aprendiz;

public class Ficha {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Aprendiz laura=new Aprendiz();
        //Asignar un valor al atributo
        laura.ficha=22;
        //System.out.println("la edad de esta muchachita es "+laura.edad);
        System.out.println("ingrese la edad");
        laura.ficha=leer.nextInt(); 

        //limpiar el bufer
        leer.nextLine();

        System.out.println("ingrese la sede de estudio");
        laura.materia=leer.nextLine();
        System.out.println("laura tiene "+laura.ficha+"años y estudia en la sede"+laura.materia);
        
    }
    
    
}
