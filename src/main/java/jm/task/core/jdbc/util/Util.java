package jm.task.core.jdbc.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Util {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка подключения к базе данных", e);
        }
    }

//
//    private static EntityManagerFactory entityManagerFactory;
//
//    public static EntityManagerFactory getEntityManagerFactory() {
//        if (entityManagerFactory == null) {
////            Map<String, String> properties = new HashMap<>();
////            properties.put(Environment.DRIVER, "org.postgresql.Driver"); // Замените на ваш JDBC драйвер
////            properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres"); // Укажите URL вашей базы данных
////            properties.put(Environment.USER, "postgres"); // Укажите имя пользователя
////            properties.put(Environment.PASS, "123456"); // Укажите пароль
////            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect"); // Замените на соответствующий диалект
////            properties.put(Environment.HBM2DDL_AUTO, "update"); // Создание таблиц автоматически, можно использовать 'create-drop' для создания и удаления
////
////            entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit", properties);
////        }
////            return entityManagerFactory;
////        }
//            Configuration configuration = new Configuration();
//
//            // Настройка соединения с базой данных
//            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect"); // Поменяйте на соответствующий диалект
//            configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver"); // JDBC драйвер
//            configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres"); // URL вашей базы данных
//            configuration.setProperty("hibernate.connection.username", "postgres"); // Имя пользователя
//            configuration.setProperty("hibernate.connection.password", "123456"); // Пароль
//
//            configuration.setProperty("hibernate.hbm2ddl.auto", "update"); // Стратегия создания схемы
//
//            // Если у вас есть классы сущностей, добавьте их
//            // Пример: configuration.addAnnotatedClass(YourEntityClass.class);
//
//            // Создание SessionFactory
//            entityManagerFactory = configuration.buildSessionFactory();
//        }
//        return entityManagerFactory;

//    }
}

