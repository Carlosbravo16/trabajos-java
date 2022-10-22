import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Con el print no se incorpora salto de linea
        System.out.print("Hello, World!");

        /*Con println si se incorpora salto de linea
        System.out.println("Hello, World 2!");*/

        //Definir un objeto
        Scanner leer=new Scanner(System.in);

        //Reciba el radio del circulo y calcule su area

        //Dato entrada
        final double PI=3.1416;
        double radio,area;

        System.out.println("Ingrese el radio del círculo");
        radio=leer.nextDouble();
    
        //Procesar la informacion
        area= PI*radio*radio;

        //Salida
        System.out.println("El area del circulo con radio "+radio+" es "+area);
        //Para cerrar el flujo de la entrada de datos
        leer.close();
    }
}
