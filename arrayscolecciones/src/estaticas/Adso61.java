package estaticas;

import java.util.Scanner;

public class Adso61 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String[][] adso61= {{"carlosbravo"," neiderdulcey","yurany","alex","wilsonosma"},{"gabriel","juan susa","diana","michel","cristianduque"},{"camilo","robert","jhonatan","luis",""},{"victor","michael","lorena","jerome",""}};
        for (int f=0;f<4;f++){
            
            for(int c=0;c<5;c++){
                
                System.out.println("ingrese el valor de la posicion "+f+" "+c);
                adso61[f][c]=leer.next();
            }
            System.out.println("");
        }
        for (int f=0;f<4;f++){
            
            for(int c=0;c<5;c++){
                
                System.out.print(adso61[f][c]+"\t");
            }
            System.out.println("");
        }
        
    }
    
}
