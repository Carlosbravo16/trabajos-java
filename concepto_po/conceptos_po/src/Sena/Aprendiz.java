package Sena;

import java.util.Scanner;

public class Aprendiz {
    public  String id;
    public String nombre="carlos";
    public int direccion;
    public int ficha;
    public String materia;

    

/*
 * definir un nombre por defecto
crear metodo que:
    -muestre el nombre actual
    -solicite y actualize el nuevo nombre 
    -muestre el valor modificado
 */
public void cambiarnombreAprendiz(){
    Scanner leer=new Scanner(System.in);
   
    System.out.println("su nombre Actual esta registrado en"+nombre);

    System.out.println("ingrese el nuevo nombre");
    nombre=leer.nextLine();

    System.out.println("el nuevo nombre es "+nombre);

}
}
