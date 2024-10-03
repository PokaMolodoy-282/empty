package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoJDBCImpl();

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {

    }

    @Override
    public void createUsersTable() {
userDao.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
userDao.dropUsersTable();
    }

    @Override
    public void saveUser(User user) {
userDao.saveUser(user);
    }

    @Override
    public void removeUserById(long id) {
userDao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {

        return userDao.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
userDao.cleanUsersTable();
    }
}
