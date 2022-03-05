package main421;

import java.util.*;

public class Main {
    public static final int size = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double timeCounter = 0;
        Queue<Integer> floors = new LinkedList<>();
        //начинать движение лифта с 0 нельзя. из-за счетчика времени движения лифта
        int count = 0;
        while (true) {
            System.out.println("Введите номер этажа от 0 до " + size + " (для завершения введите 0)");
            try {
                int floor = scanner.nextInt();
                if (floor < 0 | floor > size) {
                    System.out.println("Такого этажа в доме нет.");
                    continue;
                }
                floors.offer(floor);
                timeCounter += Math.abs(count - floor) * 2.5 + 10;
                count = floor;
                if (floor == 0) {
                    while (true) {
                        if (!floors.isEmpty()) {
                            System.out.print("этаж " + floors.poll() + "\n");
                            break;
                        }
                        System.out.print("этаж " + floors.poll() + " => ");
                    }
                    System.out.println(timeCounter + " секунд ушло на весь путь.");
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Введите число.");
                scanner.nextLine(); //TODO Вопросец.
            }
        }
    }
}
