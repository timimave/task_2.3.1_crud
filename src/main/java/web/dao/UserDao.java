package web.dao;

import java.util.List;
import web.model.User;

public interface UserDao {
    List<User> findAll();

    User findById(Integer id);

    void save(User user);

    void update(User user);

    void delete(int id);

}
