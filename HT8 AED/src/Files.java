import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files {
    public static PriorityQueue<Paciente> read(String ruta) throws IOException {
        PriorityQueue<Paciente> pq = new VectorHeap<Paciente>();
        BufferedReader lector = new BufferedReader(new FileReader(ruta));
        String fila;
        while((fila = lector.readLine()) != null){
            String[] pacient_information = fila.split(",");
            pq.add(new Paciente(pacient_information[0],pacient_information[1],pacient_information[2]));
        }
        lector.close();
        return pq;
    }
}

