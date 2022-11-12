package estaticas;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int evaluarn;
        double total=0.0,promedio=0.0;
        System.out.println("ingrese la cantida de notas que quiereque evaluemos ");
        evaluarn=leer.nextInt();
        double[]vector1=new double[evaluarn];
        for(int p=0;p<vector1.length;p++){
            System.out.println("ingrese el valor de la nota "+p);
            vector1[p]=leer.nextDouble();
            total=total+(vector1[p]);
            promedio=total/(vector1[p]);

        }
        if((promedio>3.0)||(promedio<=3.9)){
            System.out.println("usted aprobo la materia raspando");
        }
        else if(promedio>4.0){
            System.out.println("aprobaste la materia con buenos resultados ");
        }
        else{
            System.out.println("usted reprobo la materia ");
        }
        System.out.println("su nota final es "+promedio);
        leer.close();

    }
}