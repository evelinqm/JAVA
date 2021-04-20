/*
 * Como en clase1 del packete1 tenemos el modificador de acceso por defecto 
podemos acceder al mimo desde cualquier otra clase del paquete.sin embrago,
desde cualquier otro paquete no es posible acceder a no ser que se cambie
el modificador del paquete a public y se importe el paquete y la clase.
Private:restinge el modificador para que solo pueda ser usado por métodos de la misma clase 1
.El encapsulamiento: es ocultar algún dato y que solo pueda ser accesible
a través de los métodos de la misma clase. 
Setters: Establece un valor para el atributo.Con el elemento setter puedo 
acceder a atributos encapsulados. 

Getter: Sirve para obtener o mostar
 */
package Packete1;

/**
 *
 * @author Usuario
 */
public class Clase1 {
   private int edad;

   //Estos son los métodos accesores: 
   
   //Get sirve para obtener el atributo
    public int getEdad() {
        return edad;
    }
    //Set sirve para rellenar el atributo
    public void setEdad(int edad) {
        this.edad = edad;
    }
   
}
