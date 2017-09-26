
package univeristyoop;
import java.util.*;

public class Teacher extends Person {

    private int salary;
    private String degree;
     
    public Teacher( String name,String surname) {
        super(name,surname);
   
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    
    @Override
    public String toString() {
        return super.toString();
    }
   
    
    
    
    
}
