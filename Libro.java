/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdobjetos;

/**
 *
 * @author 
 */

public class Libro {
    //Atributos
    private String Titulo;
    private String Autor2;
    private String Autor;
    private int NumEjemplares;
    private int NumEjemplaresP;
    
    //Constructores
    Libro (){
    }
    Libro (String Titulo, String Autor, int Ejemplares, int EjemplaresP){
        this.Titulo=Titulo;
        this.Autor=Autor;
        NumEjemplares=Ejemplares;
        NumEjemplaresP=EjemplaresP;
    }  
    //METODOS getter y setter
   public String getTitulo(){
       return Titulo;
   }
   public String getTAutor1 (){
       return Autor;
   }
   public int getEjemplares (){
       return NumEjemplares;
   }
   public int getEjemplaresP (){
       return NumEjemplaresP;
   }
   public void setTitulo (String Titulo){
       Titulo=Titulo;
   } 
   public void setAutor(String Autor1){
       Autor=Autor; 
   }
   public void setEjemplares (int Ejemplares){
       NumEjemplares=Ejemplares;
   } 
   public void setEjemplaresP (int EjemplaresP){
       NumEjemplaresP=EjemplaresP;
   }    
   //Otros metodos
   public boolean prestamo (){
       if (NumEjemplares>0){
           System.out.println ("Libro prestado");
           NumEjemplaresP++;
           return true;
       }else{
            System.out.println ("No quedan Ejemplares disponibles");
            return false;
       }
   }
 public boolean devolucion (){
       if (NumEjemplaresP<=0){
            System.out.println ("El libro no fue prestado anteriormente");
            return false;
    }else{ 
           System.out.println ("Devolucion realizada");
           NumEjemplares++;
           return true;
   }
}  
@Override
public String toString() {
return "Titulo del libro: " + Titulo + "\n" + "Autor: "+ Autor +  "\n" +
        "Ejemplares:" + NumEjemplares +  "\n" + "Ejemplares Prestados:" + NumEjemplaresP;
    }
}
* Agrego este comentario.*/
