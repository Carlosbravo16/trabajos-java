package aritmeticas;
import java.util.Scanner;

public class Calculadora {
    //Atributos
    int num1, suma, resta, nummayor, nummenor;
    int num2;
    double expontnum1, expontnum2;

    //Metodos
    public void suma(){
        suma=num1+num2;
        System.out.println("la suma de los numeros es "+suma);
    }
    public int resta(){
        resta=num1-num2;
        System.out.println("la resta es "+resta);
        return resta;
    }
    public int mayor(){
        if (num1>num2){
            System.out.println("el numero mayor es "+num1);
            nummayor=num1;
        }
        else if (num1<num2){
            System.out.println("el numero mayor es "+num2);
            nummayor=num2;
        }
        return nummayor;
    }
    public void menor(){
        if (num1>num2){
            System.out.println("el numero menor es "+num2);
        }
        else if (num1<num2){
            System.out.println("el numero menor es "+num1);
        }

    }
    public double exponente(){
        Scanner leer=new Scanner(System.in);
        System.out.println("digite a que numero quiere elevar el numero "+num1);
        expontnum1=leer.nextDouble();
        expontnum1=(Math.pow(num1, expontnum1));
        System.out.println("su resultado es "+expontnum1);
        return expontnum1;
    }
    public double exponente1(){
        Scanner leer=new Scanner(System.in);
        System.out.println("digite a que numero quiere elevar el numero "+num2);
        expontnum2=leer.nextDouble();
        expontnum2=(Math.pow(num2, expontnum1));
        System.out.println("su resultado es "+expontnum1);
        return expontnum2;
    }

    //1.Metodo sin valor de retorno que sume los dos numeros 

    //2.Metodo con valor de retorno que reste los dos numeros 

    //3.Metodo con valor de retorno que devuelva cual es el numero mayor

    //4.Metodo con valor de retorno que devuelva cual es el numero menor

    //5.Metodo con valor de retorno que eleve cada numero al exponente que sea indicado por el usuario
    
}
