package Principal;

import java.util.Scanner;

import Salud.Reto2;

public class Inicio {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        //instanciar y crear objeto
        Reto2 objeto =new Reto2();

        objeto.pedirDatos();
        objeto.mostrarPersona();
        String resultado=objeto.calcularImc();
        System.out.println(resultado);
        if (resultado.equals("pesobajo")){
            System.out.println("comenzar alimentarse adecuadamente");
        }
        else if(resultado.equals("pesoideal")){
            System.out.println("estas en tu punto de vida sigue asi ");
        }
        else if(resultado.equals("sobrepeso")){
            System.out.println("tienes que comezar hacer ejercicio y comer mucha verdura");

        }

        objeto.mayorEdad();
        leer.close();



    }
    
}
