package main412;

public class Employee {
    private final String surname;
    private final String name;
    private final int age;
    private final String sex;
    private final String education;
    private final String post;
    private final String department;

    public Employee(String surname, String name, int age, String sex, String education, String post, String department) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.education = education;
        this.post = post;
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s",surname,name,age,sex,education,post,department);
    }
}
