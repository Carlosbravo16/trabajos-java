package ejercicios;
import java.util.*;
public class Calculadora {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);

        int op,num1,num2,total=0;

        System.out.println("Menu opciones \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División \n 5. Potenciación \n 6. Radicación \n Ingrese el numero de las opciones que desea realizar ");

        op=leer.nextInt();

        System.out.println("Ingrese el número 1");
        num1=leer.nextInt();

        System.out.println("Ingrese el número 2");
        num2=leer.nextInt();

        switch(op){
            case 1:
                total=num1+num2;
                System.out.println("El total de la suma entre "+num1+" y "+num2+" es igual a "+total);
            break;
            case 2:
                total=num1-num2;
                System.out.println("El total de la resta entre "+num1+" y "+num2+" es igual a "+total);
            break;
            case 3:
                total=num1*num2;
                System.out.println("El total de la multiplicación entre "+num1+" y "+num2+" es igual a "+total);
            break;
            case 4:
                total=num1/num2;
                System.out.println("El total de la división entre "+num1+" y "+num2+" es igual a "+total);
            break;
            case 5:
                Double n1=(double) num1;
                Double n2=(double) num2;
                Double elevado=Math.pow(n1, n2);
                System.out.println("El total de la potenciación entre "+num1+" y "+num2+" es igual a "+elevado);
            break;
            case 6:
                Double raiz=Math.sqrt(num1);
                Double raiz2=Math.sqrt(num2);
                System.out.println("La raiz cuadrada de "+num1+" es "+raiz+" \n La raiz cuadrada de "+num2+" es "+raiz2);
            break;
            default:
                System.out.println("La opcción seleccionada no es valida");
            break;
        }


        leer.close();
    }
}
    

    

