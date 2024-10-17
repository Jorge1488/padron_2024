package dominio;

import java.io.Serializable;

public class Habitante implements Serializable{
 // Estos son los atributos de las clases.
 private String nombre; // El private nos permite que otras clases no puedan acceder directamente a estos elementos
 private String apellido1; 
 private String apellido2;
 
 // "Setters" para los nombres 
 public Habitante (String nombre, String apellido1, String apellido2){
    this.nombre = nombre; 
    this.apellido1 = apellido1;
    this.apellido2 = apellido2; 
    
    }
 public void setNombre (String nombre){
 this.nombre = nombre; //Utilizamos los this, para diferenciar el parámetro del método. 
 }
 
 public void setApellido1 (String apellido1){
     this.apellido1 = apellido1; // this, para diferenciar el parámetro del método, y así con todos los this. 
 }
 
 public void setApellido2 (String apellido2){
     this.apellido2 = apellido2;
 }
 
 public static void main(String[] args){
     Habitante h = new Habitante();
     
     h.setNombre("Jorge"); // el set, se refiere a los métodos setters, su usa para asignar valor a los atributos. 
     h.setApellido1("Cerro");
     h.setApellido2("Sanz");
     
     System.out.println("Nombre: " + h.nombre);
     System.out.println("Apellido 1: " + h.apellido1);
     System.out.println("Apellido 2: " + h.apellido2);
     
 }
 public String getNombre(){
 return nombre;
 }
 public String getApellido1(){
 return apellido1;
 }
 public String getApellido2(){
 return apellido2;
 }
public Habitante (){
} // Esto es para compilar el new Habitante(), para que no de error. 
public class Comprobacion{
    public static void realizarCompr (){
        Habitante habitante1= new Habitante("Jorge", "Cerro", "Sanz");
        
        
        System.out.println(habitante1.getNombre() + "" + habitante1.getApellido1() + "" + habitante1.getApellido2());
        
    }
     /*
Cuando defines un constructor que recibe parámetros, 
el constructor por defecto desaparece automáticamente. 
Si quieres seguir creando objetos sin pasarle valores a través de `new Habitante()`, 
es necesario agregar un constructor vacío de manera explícita. 
Esto te permite tener la opción de crear objetos tanto con parámetros como sin ellos.
*/
 }
public static void add(Habitante habitante) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
}
}
