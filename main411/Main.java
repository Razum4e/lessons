package main411;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws NumberFormatException{
        ArrayList<String> notes = new ArrayList<>();
        boolean bool = true;
        System.out.println("Открылось приложение \"Заметки\"");
        while (bool) {
            printNotesMenu();
            String count = scanner.nextLine();
            try {
                int countParse = Integer.parseInt(count);
                bool = chooseAction(countParse, notes);
            } catch (NumberFormatException exception) {
                System.out.println("Введите целое число.");
            }
        }
    }
    public static void printNotes (ArrayList<String> notes) {
        for (int i = 0; i < notes.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + notes.get(i));
        }
    }
    public static void printNotesMenu () {
        System.out.println("\nВыберите действие: " +
                "\n1. Добавить заметку" +
                "\n2. Вывести список заметок" +
                "\n3. Удалить заметку" +
                "\n4. Изменить заметку" +
                "\n0. Выход");
    }
    public static boolean chooseAction(int count, ArrayList<String> notes) {
        switch (count) {
            case 1:
                System.out.print("Запишите заметку: ");
                String note = scanner.nextLine();
                notes.add(note);
                System.out.println("Заметка добавлена.");
                return true;
            case 2:
                System.out.println("Список заметок: ");
                if (notes.size() == 0) {
                    System.out.println("Список заметок пуст.");
                } else {
                    printNotes(notes);
                }
                return true;
            case 3:
                if (notes.size() == 0) {
                    System.out.println("Список заметок пуст.");
                    return true;
                }
                System.out.println("Выберите номер заметки, который необходимо удалить:");
                printNotes(notes);
                try {
                    String index = scanner.nextLine();
                    int indexParse = Integer.parseInt(index);
                    indexParse--;
                    if (indexParse >= 0 & indexParse < notes.size()) {
                        //как узнать об успехе, он же умеет возвращать boolean
                        //ранее я писал:
                        //(строка 61) Integer indexParse = Integer...
                        //(строка 63) if(notes.remove(indexParse) {
                        notes.remove(indexParse);
                        System.out.println("Заметка успешно удалена.");
                    } else {
                        System.out.println("Неправильный номер заметки.");
                    }
                } catch (NumberFormatException exception) {
                    System.out.println("Введите целое число.");
                }
                return true;
            case 4:
                if (notes.size() == 0) {
                    System.out.println("Список заметок пуст.");
                    return true;
                }
                System.out.println("Выберите номер заметки, который необходимо изменить:");
                printNotes(notes);
                try {
                    String index = scanner.nextLine();
                    int indexParse = Integer.parseInt(index);
                    indexParse--;
                    if (indexParse >= 0 & indexParse < notes.size()) {
                        System.out.println("Запишите заметку: ");
                        String noteNew = scanner.nextLine();
                        notes.set(indexParse, noteNew);
                        System.out.println("Заметка успешно изменена.");
                    } else {
                        System.out.println("Неправильный номер заметки.");
                        return true;
                    }

                } catch (NumberFormatException exception) {
                    System.out.println("Введите целое число.");
                }
                return true;
            case 0:
                System.out.println("До свидания!");
                return false;
            default:
                System.out.println("Введите число представленное в меню заметок.");
                return true;
        }
    }
}
