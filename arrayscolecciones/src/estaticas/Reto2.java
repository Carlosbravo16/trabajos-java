package estaticas;
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int competidores,nombre,tiempo;
        System.out.println(" especificarcuantos competidores participaran");
        competidores=leer.nextInt();
        String competencia[]=new String[competidores];
        double[] tiempos=new double[tiempos];
        System.out.println("el numero de competidores es "+competidores );
        for (int p=0;p<competencia.length;p++){
            System.out.println("ingrese el nombre del competidor"+p);
            competencia[p]=leer.next();
            System.out.println("ingrese el nombre del competidor "+p);
            competencia[p]=leer.next();
        }
        leer.close();

    }
    
}