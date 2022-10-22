
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        double nota=0.0, promedio=0.0, total=0.0;
        Scanner leer=new Scanner(System.in);
        for(int i=0;i<=3;i++){
            System.out.println("digite la nota obtenida");

            nota=leer.nextDouble();

            total=total+nota;

            promedio=total/4;
            
        }
        System.out.println("la nota definitava es "+promedio);

        if(promedio<=2.9){
            System.out.println("reprobaste la asignacion");
        }
        else if(promedio<=3.9){
            System.out.println("pasate raspando la asignacion");
        }
        else if(promedio<=4.0){
            System.out.println("aprobastecon buenos resultados");
        }
        else{

        }
        leer.close();
    }
    
}
