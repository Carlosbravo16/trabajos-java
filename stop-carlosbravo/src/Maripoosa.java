import java.util.Scanner;

public class Maripoosa {
    public static void main(String[] args) {
        String apellido="martinez";
        String color="morado"; 
    String[][] nombre=new String[2][3];
    nombre[1][1]="maria";

    Scanner leer=new Scanner(System.in);
    apellido=leer.nextLine();

    for(int i=0; i<3;i++){
        System.out.println("manzana");


    }
    if(color !="blanco"){
    System.out.println("si el color es  "+color );
    }
    leer.close();
}
    
}
