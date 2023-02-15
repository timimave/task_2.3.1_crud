package web.service;

import java.util.List;
import web.model.User;

public interface UserService {
    List<User> findAll();

    User findById(Integer id);

    void save(User user);

    void update(User user);

    void delete(User user);
}
