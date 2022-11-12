import java.util.Scanner;
public class Solorsano {
    public static void main(String[] args) {
        
        String[][] nombre=new String[3][2];
        nombre[0][1]="sebastian";
        nombre[1][0]="sandra";
        nombre[2][1]="susana";
        
        String animal[]=new String[3];
        Scanner leer=new Scanner(System.in);
        
        System.out.println("el animal es serpiente");
        animal[3]=leer.next();


        int op=1;
        switch(op){
            case 1:{
                System.out.println("el color es sandia");
            }
            default:{
                System.out.println("el color es sapote");
                break;
            }
        }
        int sapote=5;
        sapote=sapote*sapote;

    }
        
    
}
