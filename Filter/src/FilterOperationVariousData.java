import java.util.ArrayList;
import java.util.List;

// Student class with fields id, name, and phoneNumber
class Student{
    int id;
    String name;
    int phoneNumber;
    // Constructor to initialize Student objects
    public Student(int id,String name, int phoneNumber){
        this.id=id;
        this.name= name;
        this.phoneNumber=phoneNumber;
    }
}
public class FilterOperationVariousData {
    public static void main(String[] args) {
        // Create a list to hold Student objects
        List <Student>studentList=new ArrayList<Student>();
        // Adding Student objects to the list
        studentList.add(new Student(001,"Amal",0112233445));
        studentList.add(new Student(002,"Kamal",0112233455));
        studentList.add(new Student(003,"Namal",0112233465));
        studentList.add(new Student(004,"Chamal",0112233475));
        studentList.add(new Student(005,"Rayan",011232334));
        studentList.add(new Student(006,"Kevin",0112433451));
        // Stream operations on the studentList
        studentList.stream()
                // Filter operation: Keep only students with id less than 004
                .filter(p -> p.id<004)
                // For each filtered student, print the name to the console
                .forEach(idList -> System.out.println(idList.name));
    }
}
