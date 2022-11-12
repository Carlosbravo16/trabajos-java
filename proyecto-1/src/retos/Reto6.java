package retos;
import java.util.Scanner;
import java.util.Random;
public class Reto6 {
    public static void main(String[] args) {
        int productos=0, precio=0, subtotal=0, compra=0, balota, descuento=0, pagar=0, montofinal=0;
        String respuesta="si";
        Scanner leer=new Scanner(System.in);
        do{
            System.out.println("ingrese la cantida de productos");
            productos=leer.nextInt();
            System.out.println("ingrese el precio de los productos");
            precio=leer.nextInt();
            subtotal=productos*precio;
            compra+=subtotal;
            leer.nextLine();
            if (subtotal>=0){
                System.out.println("desea ingresar otro gasto?");
                respuesta=leer.nextLine();
            }
        }while(respuesta.equals("si"));
            if (compra>50000){
                System.out.println("salio escogido para participar en nuestro sorteo de aniversario");
                System.out.println("1.balota roja\n 2.balota azul\n 3.balota amarilla\n 4.balota blanca");
                Random aleatorio=new Random();
                balota=(int)(aleatorio.nextDouble()*4);
                System.out.println("salio la balota " +balota);
                switch(balota){
                    case 1:
                    descuento= (int) (compra*0.10);
                    montofinal=compra-descuento;
                    System.out.println("salio balota roja, su descuento es del 10% en el valor de su factura, su total a pagar es" + montofinal);
                    System.out.println("ingrese el valor con lo que desea pagar ");
                    pagar=leer.nextInt();
                    pagar=pagar-descuento;
                    System.out.println("su cambio es de " +pagar);
                    break;

                    case 2:
                    descuento= (int) (compra*0.30);
                    montofinal=compra-descuento;
                    System.out.println("salio balota azul, su descuento es del 30% en el valor de su factura, su total a pagar es" + montofinal);
                    System.out.println("ingrese el valor con lo que desea pagar ");
                    pagar=leer.nextInt();
                    pagar=pagar-descuento;
                    System.out.println("su cambio es de " +pagar);
                    break;

                    case 3:
                    descuento= (int) (compra*0.50);
                    montofinal=compra-descuento;
                    System.out.println("salio balota amarilla, su descuento es del 50% en el valor de su factura, su total a pagar es" +montofinal);
                    System.out.println("ingrese el valor con lo que desea pagar ");
                    pagar=leer.nextInt();
                    pagar=pagar-descuento;
                    System.out.println("su cambio es de " +pagar);
                    break;

                    case 4:
                    System.out.println("salio balota blanca, te llevas totalmente gratis tu compra");
                    break;

                }
                } 
                    leer.close();
            }
    
}
