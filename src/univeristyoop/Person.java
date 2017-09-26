
package univeristyoop;

public class Person {
    String name;
    String surname;
    
     public Person(){
       
    }
    public Person(String name){
        this.name=name;
    }
    public Person(String name, String surname){
        this.surname = surname;
        this.name = name;
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
        return name + ", " + surname;
    }
    
    

  
}
