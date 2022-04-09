/**
 * @author Pablo Herrera & Jorge Andrino
 * @since 8/04/2022
 * @version 1
 *
 * Class object Patient, it has a name, symptom and priority
 */
public class Paciente implements Comparable<Paciente>{
    private String nombre;
    private String sintoma;
    private String prioridad;

    Paciente(String name, String sintom, String priority){
        this.nombre = name;
        this.sintoma = sintom;
        this.prioridad = priority;
    }
    /**
     * changes names
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * gets the name
     * @return name
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * changes the symptom of the patient
     * @param sintoma
     */
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
    /**
     * gets the symptom
     * @return sintoma
     */
    public String getSintoma() {
        return sintoma;
    }
    /**
     * changes priority of patient
     * @param prioridad
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    /**
     * gets the priority of the patient
     * @return priority
     */
    public String getPrioridad() {
        return prioridad;
    }
    /**
     * Compares priority of the patien with the patient
     * @param o Patient
     * @return integer depending on the letters of priority and parameter Patient
     */
    public int compareTo(Paciente o) {
        return prioridad.compareTo(o.getPrioridad());
    }
    /**
     *
     * @return atributes of the patient
     */
    public String toString(){
        return nombre+","+sintoma+","+prioridad;
    }
}
