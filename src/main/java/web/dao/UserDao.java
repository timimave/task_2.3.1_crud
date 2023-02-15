package web.dao;

import java.util.List;
import web.model.User;

public interface UserDao {
    public void addUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public List<User> getUsersList();
    public User getById(int id);

}
