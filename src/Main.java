public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        System.out.println("=== GESTOR DE TAREAS ===");
        gestor.agregarTarea(new Tarea("Preparar examen", false));
        gestor.agregarTarea(new Tarea("Corregir prácticas", true));
        gestor.agregarTarea(new Tarea("Subir materiales al aula virtual", false));
        gestor.listarTareas();
    }
}