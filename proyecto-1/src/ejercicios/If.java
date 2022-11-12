package ejercicios;
import java.util.Scanner;
public class If {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int edad;

        System.out.println("Ingrese su edad");

        edad=leer.nextInt();

        //Lo que pasa si la condicion se cumple
        if(edad>=18){
            System.out.println("Bienvbenido, siga!!");
        }

        //Lo que pasa si la condicion no se cumple
        else{
            System.out.println("Para su casa a lavar los platos, procede a tirarle un chanclazo");
        }

        int num;

        System.out.println("Ingrese un número ");

        num=leer.nextInt();

        //En este caso si alguna se cumple
        if(num<0){
            System.out.println("El número es negativo");
        }
        else if(num==0){
            System.out.println("El número es neutro ");
        }
        else if(num>0){
            System.out.println("El número es positivo");
        }
        else{
            System.out.println("Dato incorrecto");
        }

        //En el caso donde se cumplan mas de 1 variable
        if(num<0){
            System.out.println("El número es negativo");
        }
        if(num==0){
            System.out.println("El número es neutro ");
        }
        if(num>0){
            System.out.println("El número es positivo");
        }
        else{
            System.out.println("Dato incorrecto");
        }

        leer.close();
    }
}
    

