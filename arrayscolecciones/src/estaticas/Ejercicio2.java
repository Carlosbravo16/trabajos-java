package estaticas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        //1 declarar matriz
        int [][] matriz1=new int[3][3];
        
        //2 rellenar los datos manualmente por posicion
        matriz1[0][0]=30;
        matriz1[1][0]=85;
        matriz1[2][0]=32;
        
        //3 imprimir una posicion de la matriz
        System.out.println(matriz1[2][0]);
        
        //5 rellenar matriz con datos ingresados por el usuario
        for (int f=0;f<3;f++){
            //entre a las filas
            for(int c=0;c<3;c++){
                //entre a las columnas
                System.out.println("ingrese el valor de la posicion "+f+" "+c);
                matriz1[f][c]=leer.nextInt();
            }
            
        }
        //4recoger matriz
        for (int f=0;f<3;f++){
            //entre a las filas
            for(int c=0;c<3;c++){
                //entre a las columnas
                System.out.println(matriz1[f][c]+"\t");
            }
            System.out.println("");
        }

    }
    
}
