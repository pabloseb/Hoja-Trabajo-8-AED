/**
 * @author Pablo Herrera & Jorge Andrino
 * @since 8/04/2022
 * @version 1
 *
 */
import java.util.Scanner;
public class UsersView {
    Scanner scanner = new Scanner(System.in);
    UsersView(){}

    /**
     * return message written in parameter
     * @param mensaje message
     */
    public void Mensaje(String mensaje){
        System.out.println(mensaje);
    }

    /**
     * gets path of the file
     * @return path written
     */
    public String ObtenerRuta(){
        Mensaje("Ingrese la ruta del archivo");
        return scanner.nextLine();
    }
    /**
     * user press enter to get the next patient
     */
    public void obtenerPaciente(){
        Mensaje("Presione 'enter' para ver el sigueinte paciente");
        scanner.nextLine();
    }

}
