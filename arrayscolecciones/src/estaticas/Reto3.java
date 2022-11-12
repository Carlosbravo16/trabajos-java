package estaticas;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int valor;
        String codigo;
        String[][] maquina={{" mani"," g festival"," g wafer"," g noel"," gol"},{"papas"," tostiarepas"," tosinetas"," cheesetris"," delitodo"},{"minichips","tostacos"," choclitos"," trosipollo","chocoso"},{"noel"," copelia","jetblanca"," jugohit"," burbuja"}};
        int[][] precio={{ 2000, 1300, 1000, 600, 1200},{ 1900, 1200, 1500, 1900, 2500},{ 1400, 1200, 1400, 1200, 1800},{ 400, 600, 2700, 1500, 700}};
        for (int f=0;f<4;f++){
            for(int c=0;c<5;c++){
                System.out.println(" "+f+c+" ");
                System.out.println(""+maquina[f][c]+""+precio[f][c]+"");
            }
            System.out.println("");
        }
        System.out.println("ingrese el valor con el que se desea cancelar ");
        valor =leer.nextInt();
        System.out.println("ingrese el codigo del producto");
        codigo=leer.next();
        


        leer.close();
    }
    
}