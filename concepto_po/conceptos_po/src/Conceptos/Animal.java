package Conceptos;
public class Animal {
    //atributos
    public String nombre;
    public int edad;
    //Metodos

    //metodos si valor de retorno
    public void registraranimal(){
        System.out.println("este es el metodo registrar animal()");
    }
    //metodo sin valor de retorno con parametros 
    public void cambiarnombre(String newname){
        nombre=newname;
        System.out.println("el nuevo nombre es"+nombre);
    }
    //metodo con valor de retorno con parametros
    public int calcularedad(int anionacimiento){
        edad=2022-anionacimiento;
        return edad;

    }
}

    
