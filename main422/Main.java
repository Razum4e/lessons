package main422;

import java.util.*;

//руководствовался согласно источнику https://habr.com/ru/post/282379/
//в википедии небыло ничего полезного для составления алгоритма
public class Main {
    public static void main(String[] args) {
        String line = "7 - 2 * 3"; // вводим формулу здесь.
        //вводим выражение используя только числа и "+-/*"
        Deque<String> out = new LinkedList<>();
        Deque<String> stack = new LinkedList<>();
        String[] parts = line.split(" ");
        for (String part : parts) {
            try {
                int count = Integer.parseInt(part);
                out.offerLast(String.valueOf(count));
            } catch (NumberFormatException e) {
                if (part.equals("+") | part.equals("-")) {
                    if (!stack.isEmpty()) {
                        if (stack.peekLast().equals("+") |
                            stack.peekLast().equals("-") |
                            stack.peekLast().equals("*") |
                            stack.peekLast().equals("/")) {

                            out.offerLast(stack.pollLast());
                        }
                    }
                    stack.offerLast(part);
                } else if (part.equals("*") | part.equals("/")) {
                    if (!stack.isEmpty()) {
                        if (stack.peekLast().equals("*") |
                            stack.peekLast().equals("/")) {

                            out.offerLast(stack.pollLast());
                        }
                    }
                    stack.offerLast(part);
                } else {
                    throw new RuntimeException("Error 404.");
                }
            }
        }
        System.out.println("Out: " + out);
        System.out.println("Stack: " + stack);
        while (!out.isEmpty()) {
            System.out.print(out.pollFirst() + " ");
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pollLast() + " ");
        }
    }
}
