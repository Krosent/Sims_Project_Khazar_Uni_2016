package univeristyoop;

import java.util.Objects;
import java.util.ArrayList;

public class Student extends Person {

    String id;
    ArrayList<Lesson> arrListLessons = null;
    ArrayList<Lesson> arrListOldLessons = null;
    
    public Student() {

    }

    public Student(String id, String name, String surname) {
        super(name, surname);
        this.id = id;
        arrListLessons = new ArrayList<>();
        arrListOldLessons = new ArrayList<>();
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

  

    @Override
    public String toString() {
        String res = "Student{" + super.toString() + "id=" + id + +'}';
        for (Lesson L : arrListLessons) {
            res += "/" + L.toString();
        }
        return res;
    }


    public int getTotalCredit() {
        int totalCredit = 0;
        for (int a = 0; a < arrListOldLessons.size(); a++) {
            totalCredit += arrListOldLessons.get(a).getCredit();

        }
        return totalCredit;
    }

    

    public double getGPA() {
        double GPA = 0;
        int num = 0;
        int denum = 0;
        for (Lesson L : arrListOldLessons) {
            if (L.getNote() > 59) {
                num += L.getCredit() * L.getNote();
                denum += L.getCredit();
                GPA = num / denum;
            } else if (L.getCredit() == 0) {
                GPA = 0;
            }
        }
        return GPA;
    }
    
    
        public boolean isExist(Lesson LAS)
    {
        for(Lesson L : arrListLessons){
            if(L.code.equals(LAS.code) && L.name.equals(LAS.name) && L.credit == LAS.credit){
                return true;
            }
        }
        return false;
    }

    public void addLessonForStd(Lesson LFS) {
    if(!this.isExist(LFS)){
            arrListLessons.add(LFS);
    }
       
    }

    public void addOldLessonForStd(Lesson LFS) {
        if (!arrListOldLessons.contains(LFS)) {
            arrListOldLessons.add(LFS);
        } else {
            System.out.println("This Lesson already exist");
        }
    }

}
