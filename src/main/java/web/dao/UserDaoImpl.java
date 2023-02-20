package web.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private final EntityManager entityManager;
    @Autowired
    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<User> findAll() {
        return entityManager
            .createQuery("SELECT u FROM User u", User.class).getResultList();
    }
    @Override
    public User findById(long id) {
        return entityManager.find(User.class, id); // find
    }
    @Override
    @Transactional
    public void save(User user) {
        entityManager.persist(user); // persist
    }
    @Override
    @Transactional
    public void update(User user) {
        entityManager.merge(user); // merge
    }
    @Override
    @Transactional
    public void delete(long id) {
        entityManager.remove(findById(id)); // remove
    }
}



