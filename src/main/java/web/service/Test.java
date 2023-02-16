package web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import web.model.User;

//public class Test {
//
//
//    public static void main(String[] args) {
//        User user = new User();
//        UserServiceImplTest impl = new UserServiceImplTest();
//
//        user.setId(1);
//        user.setFirstName("Abdullah");
//        user.setLastName("Tim");
//        user.setEmail("test@mail.com");
//
//        impl.save(user);
//
//        getUsername();
//
//    }
//    public static void getUsername() {
//    }
//}
//class UserServiceImplTest   {
//
//    @PersistenceContext
//    private EntityManager entityManager = ConfigConnection.getConnectionUrl();
//
//
//    public List<User> findAll() {
//        return entityManager.createQuery("SELECT u FROM User u", User.class)
//            .getResultList();
//    }
//
//    public User findById(Integer id) {
//        return entityManager.find(User.class, id);
//    }
//
//    public void save(User user) {
//        entityManager.persist(user);
//    }
//
//    public void update(User user) {
//        entityManager.merge(user);
//    }
//
//    public void delete(User user) {
//        entityManager.remove(user);
//    }
//}
//class ConfigConnection {
//    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
//    static String connectionUrl = "jdbc:mysql://localhost:3306/test";
//    static String userName = "root";
//    static String password = "3122546ti";
//
//
//    public static EntityManager getConnectionUrl() {
//        Map<String, Object> configOverrides = new HashMap<>();
//        configOverrides.put("hibernate.connection.driver_class", DRIVER);
//        configOverrides.put("hibernate.connection.url", connectionUrl);
//        configOverrides.put("hibernate.connection.username", userName);
//        configOverrides.put("hibernate.connection.password", password);
//         return Persistence.createEntityManagerFactory("test", configOverrides)
//             .createEntityManager();
//    }
//}
