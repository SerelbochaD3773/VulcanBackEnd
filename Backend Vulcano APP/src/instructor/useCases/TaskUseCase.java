package instructor.useCases;

import java.util.ArrayList;
import java.util.List;

import tasks.models.Task;

// Contenedor de metodos y atributos
public class TaskUseCase {

    // Propiedad
    private final List<Student> tasks; // Definicion Lista en memoria

    // Constructor
    public TaskUseCase() {
        this.tasks = new ArrayList<>(); // Inicializacion - Preparar el uso de la lista.
    }

    // CREATE
    public String create(String name, String description) {
        try {
            Student task = new Student(name, description, false);
            this.tasks.add(task); // Uso de la lista
            return "Tarea Creada:" + task.getName() + " Descripcion:" + task.getDescription();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }
}
