public class Paciente implements Comparable<Paciente>{
    private String nombre;
    private String sintoma;
    private String prioridad;

    Paciente(String name, String sintom, String priority){
        this.nombre = name;
        this.sintoma = sintom;
        this.prioridad = priority;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public int compareTo(Paciente o) {
        return prioridad.compareTo(o.getPrioridad());
    }

    public String toString(){
        return nombre+","+sintoma+","+prioridad;
    }
}
