/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author pc
 */
public class AutoMovil {

    //Atributos
    
   private String color;
   private String marca;
   private int año;
   private double costo;
   
// Constructor
   public AutoMovil(){
       System.out.println("Constructor de Auto movil");
       this.costo = 0;
    }
   
   // setters y getters
   
    public String getColor() {
      return color;
    }
    public void Setcolor(String color ){
       this.color = color;
    }
    
   public String getMarca(){
       return marca;
   }
   
   public void setMarca(String marca){
       this.marca= marca;
      
   }
   
   public int getAño() {
      return año;
    }
   
   public void setAño(int año) {
    this.año = año;
   }
    public double getCosto() {
        return costo;
    }
    
    public void setCosto(double costo) {
        this.costo = costo;
    }
   
   // Metodos
    
    public void acelerar (double incremento){
        System.out.println("Acelerando el auto..");
    }
    
    public void frenar (){
        System.out.println("Frenando el auto..");
     }
     
    //Metodos
    
    public void mostrarInformacion (){
        System.out.println("==Mostrando informacion==");
        System.out.println("El año del auto es : " + this.año);
        System.out.println("La marca del auto es : " + this.marca);
        System.out.println("El color del auto es : " + this.color);
        System.out.println("El costo del auto es : $" + this.costo);
    }
    
    public void encender(){
        System.out.println("El auto " + this.marca + "  de " + this.color + " esta encendido.");
    }
    
     public static void main(String[] args) {
        // Solo creamos un objeto para ejecutar el constructor
        AutoMovil miAuto = new AutoMovil();
    }
}

   
 
    