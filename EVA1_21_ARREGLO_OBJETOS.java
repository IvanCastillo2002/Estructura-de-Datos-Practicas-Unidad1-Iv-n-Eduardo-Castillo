/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_21_arreglo_objetos;

import java.util.Scanner;

/**
 *
 * @author ivned
 */
public class EVA1_21_ARREGLO_OBJETOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner (System.in);
      Persona[] aPersonas=new Persona[10];//ARREGLO TAMAÑO 10 QUE ALMACENTA OBJETOS DEL TIPO PERSONA
      //PARA USAR UN OBJETO DEBEMOS CREARLO
      //PARA CREAR UN OBJETO USAMOS NEW
      //SI NO LO CREO NO EXISTE
      for (int i = 0; i < aPersonas.length; i++) {
         aPersonas[i]=new Persona(); //CREO UN OBJETO DE TIPO PERSONA EN LA POSICION i
         System.out.println("Introduce un nombre: ");
         String nombre = input.nextLine();
         aPersonas[i].setNombre(nombre);
      }
      for (int i = 0; i < aPersonas.length; i++) {
         System.out.println("Nombre: " + aPersonas[i].getNombre());//CREO UN OBJETO DE TIPO PERSONA EN LA POSICION i
         
      }
      
   }
   
}
class Persona{
   private String nombre;

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   
}