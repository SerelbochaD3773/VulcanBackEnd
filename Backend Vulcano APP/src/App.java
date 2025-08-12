
import tasks.models.Task;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Task task = new Task("Encender", "Encender el TV", false);
        System.out.println("Tarea Pendiente:" + 
        task.getName() + 
        "Descripcion:" + 
        task.getDescription() + 
        task.getSatus() );

        task.setStatus(true);
        
        System.out.println("Tarea Finalizada:" + task.getName() + "Descripcion:" + task.getDescription()+ task.getSatus() );
    }
}