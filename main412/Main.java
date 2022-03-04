package main412;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws NumberFormatException,ArrayIndexOutOfBoundsException {
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.println("Программа \"Учет сотрудников - 0.0.1\" запущена."+
                "\nДля выхода из программы используйте \"выход\"");
        while (true) {
            if (printAddEmployee(employees)) break;
        }
        printList(employees);
        while (true) {
            if (printSetEmployee(employees)) break;
        }
        System.out.println("До свидания.");
    }

    public static boolean printAddEmployee (ArrayList<Employee> employees) {
        System.out.println("Введите информацию о сотруднике"+
                "\n(фамилия, имя, возраст, пол, образование, должность, отдел):");
        String input = scanner.nextLine();
        if (input.equals("выход")){
            return false;
        }
        employees.add(addEmployee(input));
        return true;
    }

    private static Employee addEmployee(String input) {
        try {
            String[] parts = input.split(" ");
            String surname = parts[0];
            String name = parts[1];
            int age = Integer.parseInt(parts[2]);
            String sex = parts[3];
            String education = parts[4];
            String post = parts[5];
            String department = parts[6];
            return new Employee(surname, name, age, sex, education, post, department);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException exception ) {
            System.out.println("Произошла ошибка. Повторите снова.");
        }
        return null;
    }

    private static boolean printSetEmployee(ArrayList<Employee> employees) {
        System.out.println("Есть ли необходимость заменить какого-либо сотрудника?"+
                "\n да/нет");
        String input = scanner.nextLine();
        if (input.equals("нет")){
            return false;
        } else if (input.equals("да")) {
            System.out.println("Введите номер сотрудника:");
            String index = scanner.nextLine();
            int indexParse = Integer.parseInt(index);
            System.out.println("Введите информацию о сотруднике"+
                    "\n(фамилия, имя, возраст, пол, образование, должность, отдел):");
            input = scanner.nextLine();
            setEmployee(employees, input, indexParse);
            return true;
        } else {
            System.out.println("да/нет");
            return true;
        }
    }

    private static void setEmployee(ArrayList<Employee> employees, String input, int index) {
        try {
            String[] parts = input.split(" ");
            String surname = parts[0];
            String name = parts[1];
            int age = Integer.parseInt(parts[2]);
            String sex = parts[3];
            String education = parts[4];
            String post = parts[5];
            String department = parts[6];
            Employee employee = new Employee(surname, name, age, sex, education, post, department);
            employees.set(index, employee);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException exception ) {
            System.out.println("Произошла ошибка. Повторите снова.");
        }
    }

    public static void printList(ArrayList<Employee> employees) {
        System.out.println("Список сотрудников.");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Фамилия","Имя","Возраст","Пол","Образ-ие","Должность","Отдел");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("[" + (i+1) + "]" + employees);
        }
    }
}
