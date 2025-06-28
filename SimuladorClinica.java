package simuladorclinica;
import javax.swing.JOptionPane;


public class SimuladorClinica {

   
    public static void main(String[] args) {
        
         int opcionPrincipal;
        
        do {
            // Menú principal
            opcionPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null,
                "--- MENU PRINCIPAL ---\n"
                + "1. Gestionar Registro Histórico de Expedientes\n"
                + "2. Gestionar Cola de Atención Activa\n"
                + "3. Salir del Sistema\n\n"
                + "Seleccione una opción"));
            
            switch (opcionPrincipal) {
                case 1:
                    gestionarExpedientes();
                    break;
                case 2:
                    gestionarColaAtencion();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
            }
        } while (opcionPrincipal != 3);
    }

    public static void gestionarExpedientes() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "--- GESTION DE EXPEDIENTES ---\n\n"
                + "1. Registrar nuevo expediente\n"
                + "2. Buscar registro por ID\n"
                + "3. Listar todos los registros\n"
                + "4. Volver al menu principal\n\n"
                + "Seleccione una opcion:"));

            switch (opcion) {
                case 1:
                    // Lógica para registrar expediente
                    break;
                case 2:
                    // Lógica para buscar expediente
                    break;
                case 3:
                    // Lógica para listar expedientes
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
            }
        } while (opcion != 4);
    }

    public static void gestionarColaAtencion() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "--- COLA DE ATENCIÓN ACTIVA ---\n\n"
                + "1. Registrar/Actualizar paciente\n"
                + "2. Buscar paciente por ID\n"
                + "3. Eliminar paciente de la cola\n"
                + "4. Volver al menu principal\n\n"
                + "Seleccione una opción:"));

            switch (opcion) {
                case 1:
                    // Lógica para registrar/actualizar paciente
                    break;
                case 2:
                    // Lógica para buscar paciente
                    break;
                case 3:
                    // Lógica para eliminar paciente
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
            }
        } while (opcion != 4);
    }
}
    

