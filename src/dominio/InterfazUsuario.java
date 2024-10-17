package dominio; 
import java.util.ArrayList;

public class InterfazUsuario {

    private OficinaPadron op; 
    // Método para ejecutar instrucciones
    public static void ejecutar(String[] instruccion) {
        OficinaPadron padron = new OficinaPadron();

        // Mostrar habitantes si la instrucción es "mostrar"
        if (instruccion[0].equalsIgnoreCase("mostrar") && instruccion.length == 1) {

        // Añadir un habitante si la instrucción es "añadir" y tiene los argumentos correctos
        } else if (instruccion[0].equalsIgnoreCase("añadir") && instruccion.length == 4) {
            padron.annadir(new Habitante(instruccion[1], instruccion[2], instruccion[3]));
            System.out.println("Habitante añadido correctamente");

        // Si la instrucción no es válida
        } else {
            System.out.println("Error en la instrucción");
        }
    }
    
}



