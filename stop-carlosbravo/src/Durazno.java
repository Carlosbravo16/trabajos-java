import java.util.Scanner;
public class Durazno {
    public static void main(String[] args) {
        String nombre="daniel";
        String apellido="duarte";

        Scanner leer=new Scanner(System.in);
        apellido=leer.nextLine();

        String[] animal=new String[5];
        animal[3]="delfin";
        int op=1;
        switch(op){
            case 1:{
                System.out.println("el color es dorado");
            }
            default:{
                System.out.println("el color es diamante");
                break;
            }
        }
        leer.close();
    }
    
}
