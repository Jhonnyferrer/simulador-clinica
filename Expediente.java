package simuladorclinica;
import java.time.LocalDate;

public class Expediente {
    
    // Campo estático para autoasignar IDs únicos
    private static int contador = 1;

    // Atributos del expediente
    public final int id;           // ID único autoasignado
    public String nombre;
    public String sexo;
    public LocalDate fechaNacimiento;
    public String diagnostico;
        
    
    // Constructor principal
    public Expediente(String nombre, String sexo, LocalDate fechaNacimiento, String diagnostico) {
        this.id = contador++;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.diagnostico = diagnostico;
    }

    // Método para mostrar la información del expediente
    @Override
    public String toString() {
        return "Expediente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", diagnostico='" + diagnostico + '\'' +
                '}';
    }
}
