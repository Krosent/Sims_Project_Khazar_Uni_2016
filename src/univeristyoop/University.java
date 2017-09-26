package univeristyoop;
import java.util.ArrayList;

public class University {
    String name;
    public static ArrayList<Student> listStudent = null;

    public University(String name) {
        this.name = name;
            listStudent = new ArrayList<>();
    }

     
    public boolean isExistStd(Student S) {
        for (Student student : listStudent) {
            if (student.id.equals(S.id) && student.name.equals(S.name) && 
                    student.surname.equals(S.surname)) {
                return true;
            }
        }
        return false;
    }
        
        public void addStudent(Student S) {
        if (!this.isExistStd(S)) {
           University.listStudent.add(S);
        }
    }
   
    
   
  


}
