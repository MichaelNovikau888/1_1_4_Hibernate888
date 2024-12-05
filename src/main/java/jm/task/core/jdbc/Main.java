package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserServiceImpl userService=new UserServiceImpl();

        userService.createUsersTable();

        // Сохраняем пользователей
        userService.saveUser("John", "Doe", (byte) 30);
        userService.saveUser("Jane", "Smith", (byte) 25);
        userService.saveUser("Alice", "Johnson", (byte) 28);
        userService.saveUser("Bob", "Brown", (byte) 35);
        // Получаем всех пользователей и выводим их в консоль
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        // Очищаем таблицу пользователей
        userService.cleanUsersTable();

        // Удаляем таблицу пользователей
        userService.dropUsersTable();
    }
}
