package main341;

import java.util.Scanner;

class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        User user = getUserByLogin(login);
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        getUserByPassword(user, password);
        validateUser(user);
        System.out.println("Доступ предоставлен.");
    }

    public static User[] getUsers() {
        User[] users = {
                new User("jhon", "1234", "jhon@gmail.com", 24),
                new User("sandr", "12321", null, 17)
        };
        return users;
    }

    public static User getUserByLogin(String login) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.getLogin())) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден");
    }

    public static void getUserByPassword (User user, String password) throws UserNotFoundException {
        if (!password.equals(user.getPassword())){
            throw new UserNotFoundException("Пароль не верный.");
        }
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if(user.getAge() < 18) {
            throw new AccessDeniedException("Вам меньше 18.");
        }
    }
}


