/**
 * @author Pablo Herrera & Jorge Andrino
 * @since 8/04/2022
 * @version 1
 *
 */
import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {
        UsersView view = new UsersView();
        PriorityQueue<Paciente> pq;
        while(true) {
            try {
                pq = Files.read(view.ObtenerRuta());
                break;
            }catch (Exception e){
                view.Mensaje("Error, intente de nuevo");
            }
        }
        while(!pq.isEmpty()){
            view.obtenerPaciente();
            view.Mensaje(pq.remove().toString());
        }
    }
}
