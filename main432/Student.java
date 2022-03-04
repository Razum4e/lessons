package main432;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private final String name;
    private final String numGroup;
    private final String numStudentId;

    public Student(String name, String numGroup, String numStudentId) {
        this.name = name;
        this.numGroup = numGroup;
        this.numStudentId = numStudentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(numStudentId, student.numStudentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numStudentId);
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return name + ", " + numGroup + ", " + numStudentId + ".";
    }
}
