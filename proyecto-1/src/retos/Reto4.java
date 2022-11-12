package retos;

import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in); 
        int eleccion,maquina;
        System.out.println("digite 1 para escoger piedra, 2 para escoger papel y 3 para escoger tijera ");
        eleccion=leer.nextInt();
        maquina=(int)(Math.random()*3)+1;
        if (eleccion==1 && maquina==2){
        System.out.println("escogi piedra, la maquina papel, pierdo!...");}
        else if(eleccion==1 && maquina==3){
        System.out.println("ecogi piedra, la maquina tijera, gano!...");}
        else if (eleccion==2 && maquina==3){
        System.out.println("escogi papel, la maquina tijera, pierdo!...");}
        else if (eleccion==2 && maquina==1){
        System.out.println("escogi papel, la maquina piedra, gano!...");}
        else if (eleccion==3 && maquina==1){
        System.out.println("escogi tijera, la maquina piedra, pierdo!...");}
        else if (eleccion==3 && maquina==2){
        System.out.println("escogi tijera, la maquina papel, gano!... ");}
        else if (eleccion==1 && maquina==1   || eleccion==2 && maquina==2  || eleccion==3 && maquina==3){
        System.out.println("ambos saca lo mismo hay un empate");}
        else if (eleccion>3){
            System.out.println("hay un error de ejecucion");}
        else{
            System.out.println("hay un error");}

        leer.close();
    }
    
    
}
