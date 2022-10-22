import java.util.*;


public class CajaRegistradora {
    public static void main(String[] args) {
        int op, precio,cantidad, referencias=0,subtotal,total=0, pagar,cambio;
        Scanner valor=new Scanner(System.in);
    for(int i=1;i<=5;i++){

        System.out.println("digite el precio del producto");

        precio=valor.nextInt();

        System.out.println("digite la cantidad de los productos");

        cantidad=valor.nextInt();
        subtotal=precio*cantidad;

        System.out.println(cantidad+"del producto de precio es "+subtotal);

        //iniciar el contador de minutos de la compra
        referencias=referencias+1;
        //iniciamos acumulador para el total de la compra 
        total=total+subtotal;

    }
    System.out.println("el total de la compra es"+total);

    System.out.println("la cantidad de minutos de la compra es "+referencias);
    Scanner leer=new Scanner(System.in);
    System.out.println("ingrese el valor con el que desea cancelar");
    pagar=leer.nextInt();
    cambio=pagar-total;
    System.out.println("su cambio es "+cambio);
    System.out.println("digite 1 si cuenta con telefonia movil exito, de lo contrario digite 2");
    op=leer.nextInt();
    switch(op){
        case 1:
    System.out.println("los minutos que obtubo por su compra son"+referencias);
            break;
        case 2:
            System.out.println("no pierdad mas minutos, adquiere ya tu telefonia movil exito"); 
            break;
        default:
            System.out.println("opcion no valida"); 
            break;
        }


    valor.close();
    }
    
}
