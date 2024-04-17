package hashcode;

import java.util.Objects;

public class Student {
    public String name ;
    public int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return roll == student.roll && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll);
    }
}
