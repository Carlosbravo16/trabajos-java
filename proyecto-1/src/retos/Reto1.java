package retos;
import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        Scanner conversion=new Scanner(System.in);
        double gradosf,formula;
        System.out.print("Ingrese los grados °F ");
        gradosf=conversion.nextDouble();
        formula=(gradosf-32)/1.8;
        System.out.println("Los grados centigrados que debe poner en el horno son "+formula);
        conversion.close();
    }
}