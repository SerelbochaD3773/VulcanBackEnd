
import student.models.Student;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        Student student = new Student("Encender", "Encender el TV", false);
        System.out.println("Tarea Pendiente:" + 
        task.getName() + 
        "Descripcion:" + 
        task.getDescription() + 
        task.getSatus() );

        task.setStatus(true);
        
        System.out.println("Tarea Finalizada:" + task.getName() + "Descripcion:" + task.getDescription()+ task.getSatus() );
    }
}