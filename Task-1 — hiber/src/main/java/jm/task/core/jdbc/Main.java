package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Создание таблицы
        userService.createUsersTable();

////        // Добавление пользователей
        userService.saveUser("John", "Doe", (byte) 30);
        userService.saveUser("Jane", "Doe", (byte) 25);
        userService.saveUser("Alice", "Smith", (byte) 22);
        userService.saveUser("Bob", "Johnson", (byte) 28);

//        // Получение всех пользователей
        List<User> users = userService.getAllUsers();
        System.out.println("Все пользователи: ");
        for (User user : users) {
            System.out.println(user);
        }
//        // Очистка таблицы
        userService.cleanUsersTable();
        System.out.println("Таблица пользователей очищена.");
        // Удаление таблицы
        userService.dropUsersTable();
        System.out.println("Таблица пользователей удалена.");

        // реализуйте алгоритм здесь
    }
}
