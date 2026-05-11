import java.util.ArrayList;
import java.util.List;
public class GestorTareas {
    private List<Tarea> tareas = new ArrayList<>();
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }
    public void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas.");
        } else {
            for (Tarea tarea : tareas) {
                System.out.println(tarea);
            }
        }
    }
}
