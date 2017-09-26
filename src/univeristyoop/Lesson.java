package univeristyoop;

import java.util.Objects;

public class Lesson {

    String code;
    String name;
    int credit;
    private int note;
    private Teacher teacher;

    public Lesson() {
    }
    
    

    public Lesson(String code, String name, int credit, int note) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.note = note;
       
    }
    public Lesson(String code, String name, int credit, Teacher teacher) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.note = note;
       this.teacher=teacher;
    }
    public Lesson(String code,String name,int credit){
        this.code=code;
        this.name=name;
        this.credit=credit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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
        final Lesson other = (Lesson) obj;
        if (this.credit != other.credit) {
            return false;
        }
        if (this.note != other.note) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.teacher, other.teacher)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lesson{" + "code=" + code + ", name=" + name + ", credit=" + credit + ", note=" + note + ", teacher=" + teacher + '}';
    }
    
    

   
    


  
    
    
}
