package Repaso;

public class Circulo extends Figura{
    private float radio;

    public Circulo(){

    }
    

    public Circulo(float radio) {
        this.radio = radio;
    }
    public float getRadio() {
        return radio;
    }


    public void setRadio(float radio) {
        this.radio = radio;
    }
    


    @Override
    public void calcularArea() {
        double area=Math.PI*Math.pow(radio, 2);
        System.out.println("el area del circulo es "+area);
      
        
    }


    
    
}
