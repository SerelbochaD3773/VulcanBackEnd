package student.useCases;

import java.util.ArrayList;
import java.util.List;

import student.models.Student;

// Contenedor de metodos y atributos
public class StudentUseCase {

    // Propiedad
    private final List<Student> students; // Definicion Lista en memoria
    

    // Constructor
    public StudentUseCase() {
        this.students = new ArrayList<>(); // Inicializacion - Preparar el uso de la lista.
    }

    // CREATE
    public String create(String idUser, String name, String career, String phone, String email, String password) {
        try {
            Student student = new Student(name, idUser, career, phone, email, password);
            this.students.add(student); // Uso de la lista
            return "Estudiante Creado:" + student.getName() + " Iduser:" + student.getIdUser() + " Carrera:" + student.getCareer() + " Telefono:" + student.getPhone() + " Email:" + student.getEmail();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }


}
