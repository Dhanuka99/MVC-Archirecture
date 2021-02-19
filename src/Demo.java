import controller.StudentController;
import model.Student;
import view.StudentView;

public class Demo {
    public static void main(String[] args) {
        Student model  = retriveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Udara");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase()
    {
        Student student = new Student();
        student.setName("Dhanuka Lakshan");
        student.setRollNo("1021D32U");
        return student;
    }
}

