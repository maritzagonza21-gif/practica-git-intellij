import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea(new Tarea("Preparar examen", false));
        gestor.agregarTarea(new Tarea("Corregir prácticas", true));
        gestor.agregarTarea(new Tarea("Subir materiales al aula virtual", false));
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=== ORGANIZADOR PERSONAL DE TAREAS ===");
            System.out.println("1. Listar tareas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    gestor.listarTareas();
                    break;
                case 0:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }
}