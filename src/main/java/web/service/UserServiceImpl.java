package web.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;
@Service
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
    public User findById(long id) {
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

    public void delete(long id) {
        UserDao.delete(id);
    }
}
