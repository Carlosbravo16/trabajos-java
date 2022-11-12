package estaticas;
/**
 * Ejercicio1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //declarar array
        int[]vector1=new int[10];
        //lenar vector manualmente
        vector1[0]=30;
        vector1[1]=50;
        vector1[2]=25;
        vector1[3]=85;
        vector1[4]=12;
        vector1[5]=6;
        vector1[6]=32;
        vector1[7]=41;
        vector1[8]=23;
        vector1[9]=63;
        for (int p=0; p<10; p++){
            System.out.println(vector1[p]);
        }
        for(int dato:vector1){
            System.out.println(dato);
        }
    }
}