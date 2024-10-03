package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;

//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        UserService userService = new UserServiceImpl(userDao);
        userService.createUsersTable();

        // Добавление пользователей
        userService.saveUser(new User("John", "Doe", (byte) 30));
        userService.saveUser(new User("Jane", "Doe", (byte) 25));
        userService.saveUser(new User("Alice", "Smith", (byte) 22));
        userService.saveUser(new User("Bob", "Johnson", (byte) 28));

        // Получение всех пользователей
        System.out.println("Все пользователи в базе данных:");
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }
        // Очистка таблицы
        userService.cleanUsersTable();
        System.out.println("Таблица пользователей очищена.");
        // Удаление таблицы
        userService.dropUsersTable();
        System.out.println("Таблица пользователей удалена.");

        // реализуйте алгоритм здесь
    }
}
