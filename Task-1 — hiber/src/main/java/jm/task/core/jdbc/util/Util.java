package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123456";
    public static final String DRIVER = "org.postgresql.Driver";

    public static SessionFactory buildSessionFactory() {
        try {
            Configuration config = new Configuration(); // настраиваем подключение к бд
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
            config.setProperty("hibernate.connection.driver_class", DRIVER);
            config.setProperty("hibernate.connection.url", URL);
            config.setProperty("hibernate.connection.username", USER);
            config.setProperty("hibernate.connection.password", PASSWORD);
            config.setProperty("hibernate.show_sql", "true");
            config.setProperty("hibernate.hbm2ddl.auto", "update");
            config.addAnnotatedClass(User.class);
            return config.buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}