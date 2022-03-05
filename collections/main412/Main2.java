package main412;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.println("Программа \"Учет сотрудников - 0.0.1\" запущена.");
        while (true) {
            System.out.println("Введите информацию о сотруднике"+
                    "\n(фамилия, имя, возраст, пол, образование, должность, отдел) или \"выход\"");
            try {
                String input = scanner.nextLine();
                if (input.equals("выход")) {
                    printList(employees);
                    break;
                }
                employees.add(getEmployee(input));
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException exception ) {
                System.out.println("Произошла ошибка. Повторите снова.");
            }
        }
        while (true) {
            System.out.println("Есть ли необходимость заменить какого-либо сотрудника?"+
                    "\n да/нет");
            String input = scanner.nextLine();
            if (input.equals("нет")){
                System.out.println("Завершение программы.");
                break;
            } else if (input.equals("да")) {
                while (true) {
                    try {
                        System.out.println("Введите номер сотрудника или \"выход\"");
                        input = scanner.nextLine();
                        if (input.equals("выход")) {
                            printList(employees);
                            break;
                        }
                        int index = Integer.parseInt(input);
                        System.out.println("Введите информацию о сотруднике"+
                            "\n(фамилия, имя, возраст, пол, образование, должность, отдел):");
                        input = scanner.nextLine();
                        employees.set(index-1, getEmployee(input));
                    } catch (ArrayIndexOutOfBoundsException exception ) {
                        System.out.println("Произошла ошибка. Повторите снова.");
                    } catch (NumberFormatException exception) {
                        System.out.println("Введите целое число.");
                    } catch (IndexOutOfBoundsException exception) {
                        System.out.println("Введен неверный номер сотрудника.");
                    }
                }
                break;
            } else {
                System.out.println("Ошибка. Введите \"да/нет\"");
            }
        }
        System.out.println("До свидания.");
    }

    private static Employee getEmployee(String input) {
        String[] parts = input.split(" ");
        String surname = parts[0];
        String name = parts[1];
        int age = Integer.parseInt(parts[2]);
        String sex = parts[3];
        String education = parts[4];
        String post = parts[5];
        String department = parts[6];
        return new Employee(surname, name, age, sex, education, post, department);
    }

    public static void printList(ArrayList<Employee> employees) {
        System.out.println("Список сотрудников.");
        System.out.printf("%s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "[№]","Фамилия","Имя","Возраст","Пол","Образ-ие","Должность","Отдел");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println("[" + (i+1) + "] " + employee);
        }
    }
}
