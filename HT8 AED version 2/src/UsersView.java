import java.util.Scanner;

public class UsersView {
    Scanner scanner = new Scanner(System.in);
    UsersView(){}

    public void Mensaje(String mensaje){
        System.out.println(mensaje);
    }
    public String ObtenerRuta(){
        Mensaje("Ingrese la ruta del archivo");
        return scanner.nextLine();
    }
    public void obtenerPaciente(){
        Mensaje("Presione 'enter' para ver el sigueinte paciente");
        scanner.nextLine();
    }

}
