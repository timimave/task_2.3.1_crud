package web.service;

import java.util.List;
import web.dao.UserDao;
import web.model.User;

public class UserServiceImpl implements UserService {
    private final UserDao UserDao;

    public UserServiceImpl(web.dao.UserDao userDao) {
        UserDao = userDao;
    }

    @Override
    public List<User> findAll() {
        return UserDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return UserDao.findById(id);
    }

    @Override
    public void save(User user) {
        UserDao.save(user);
    }

    @Override
    public void update(User user) {
        UserDao.update(user);
    }

    @Override
    public void delete(User user) {
        UserDao.delete(user);
    }
}
