package main432;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        while (true) {
            System.out.println("                Введите информацию о студенте:"+
                    "\n(ФИО, номер группы, номер студенческого билета или \"нет\")");
            String line = scanner.nextLine();
            if (line.equals("нет")) break;
            String [] splitLine = line.split(", ");
            if (students.contains(new Student(splitLine[0], splitLine[1], splitLine[2]))) {
                System.out.println("Данный студент уже существует.");
                continue;
            }
            students.add(new Student(splitLine[0], splitLine[1], splitLine[2]));
        }
        System.out.println("Список студентов:");
        printStudents(students);
    }

    public static void printStudents (Set<Student> students) {
        List<Student> listStudent = new ArrayList<>(students);
        listStudent.sort(Student::compareTo);
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }
}
