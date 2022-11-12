package aritmeticas;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        Calculadora objetivo=new Calculadora();

        System.out.println("ingrese el primer numero ");
        objetivo.num1=leer.nextInt();
        
        System.out.println("ingrese el segundo numero ");
        objetivo.num2=leer.nextInt();

        objetivo.suma();
        objetivo.resta();
        objetivo.mayor();
        objetivo.menor();
        objetivo.exponente();
        objetivo.exponente1();
        
        leer.close();
    }
    
}
