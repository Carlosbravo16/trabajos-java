package Repaso;

import java.util.Scanner;

public class Pruebaf { 
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese 1 para calcular el area del cuadrado \n ingrese 2 para calcular el area del triangulo \n ingrese 3 para calcular el area del rectangulo \n ingrese 4 para calcular el area del radio " );
        int seleccion=leer.nextInt();

        switch (seleccion){
            case 1:
            Cuadrado c1=new Cuadrado();
        //poner el valor del lado
            System.out.println("ingrese el valor del lado del cuadrado ");
            float l=leer.nextFloat();
            c1.setLado(12);
            c1.calcularArea();
                break;
        
        //poner el valor
            case 2:
            Triangulo c2=new Triangulo();
            System.out.println("ingrese el valor de la base del triangulo");
            float t=leer.nextFloat();
            c2.setBase(18);
            System.out.println("ingrese el valor de la altura del triangulo");
            float h=leer.nextFloat();
            c2.setAltura(16);
            c2.calcularArea();
                break;

        //poner el valor 
            case 3:
            Rectangulo c3=new Rectangulo();
            System.out.println("ingrese el valor de la base  del rectangulo");
            float R=leer.nextFloat();
            c3.setBase(25);
            System.out.println("ingrese el valor de la altura  del rectangulo");
            float r=leer.nextFloat();
            c3.setAltura(13);
            c3.calcularArea();
                break;

        //poner el valor
            case 4:
            Circulo c4=new Circulo();
            System.out.println("ingrese el valor del radio del circulo  ");
            float c=leer.nextFloat();
            c4.setRadio(4);
            c4.calcularArea();
                break;
            default:
                break;
        }
        leer.close();
    }  
}
