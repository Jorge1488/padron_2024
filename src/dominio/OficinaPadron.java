package dominio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class OficinaPadron implements Serializable {
    private ArrayList<Habitante> habitantesPadron = new ArrayList<>();

    public OficinaPadron() {
        cargarHabitantes();
    }

    // Método para cargar habitantes desde el archivo padron.csv
    private void cargarHabitantes() {
        try {
            File fichero = new File("padron.csv");
            fichero.createNewFile();
            Scanner sc = new Scanner(fichero);
            sc.useDelimiter(",|\n");
            while (sc.hasNext()) {
                Habitante habitante = new Habitante(sc.next(), sc.next(), sc.next());
                habitantesPadron.add(habitante);
            }
            sc.close();
        } catch (IOException ex) {
            System.out.println("No hay habitantes inscritos");
        }
    }

    

    // Método para añadir un habitante y volcar el nuevo padrón en el fichero CSV
    public void annadir(Habitante habitante) {
        habitantesPadron.add(habitante);  // Añadir el nuevo habitante a la lista
         // Volcar los datos al archivo CSV
    }

    public ArrayList<Habitante> getHabitantesPadron() {
        return habitantesPadron;
    }

    public int calcularNumeroHabitantes() {
        return habitantesPadron.size();
    }

    public String toString(){
        String cad = "";
        for (Habitante h : habitantesPadron);
            cad+=h+"\n";
        cad +="Total de habitantes: "+calcularNumeroHabitantes()+"\n";
        return cad; 
    }
}


