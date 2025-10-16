/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
public class Main {
  public static void main(String[] args) {
        System.out.println("=== Creando un HondaCivic ===\n"); 
      
        HondaCivic miCivic = new HondaCivic();
        miCivic.setAño(2024);
        miCivic.setCosto(25000.00);
        miCivic.Setcolor("Negro");
        
        System.out.println("\n=== Probando métodos ===\n");
        miCivic.mostrarInformacion();
        
        System.out.println();
        miCivic.encender();
        
        System.out.println();
        miCivic.acelerar(50);
        miCivic.frenar();
    }
}
    

