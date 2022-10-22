import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        Scanner vacuna=new Scanner(System.in);
        float meses,libras, dosis;
        System.out.println("Ingrese la edad en meses del bebé");
        meses=vacuna.nextFloat();
        meses=meses*10;
        System.out.println("Ingrese el peso del bebé en libras");
        libras=vacuna.nextFloat();
        libras=libras+10;
        dosis=libras/meses*8;
        System.out.println("La dosis a aplicar es "+dosis+" milimetros cubicos");
        vacuna.close();
    }
}
    

