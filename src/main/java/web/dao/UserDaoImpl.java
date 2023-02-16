package web.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
    public User findById(Integer id) {
        return entityManager.find(User.class, id);
    }
    @Override
    public void save(User user) {
        entityManager.persist(user);
    }
    @Override
    public void update(User user) {
        entityManager.merge(user);
    }
    @Override
    public void delete(int id) {
        entityManager.remove(findById(id));
    }
}



/*  "SELECT u FROM User u" - это часть запроса на языке JPQL (Java Persistence Query Language),
который используется для работы с объектами в базе данных с помощью JPA (Java Persistence API).

Этот запрос означает, что мы выбираем все записи из таблицы User и представляем
их в виде объектов класса User. "u" - это псевдоним для класса User, который
используется для ссылки на объекты класса User в запросе. Как правило, этот псевдоним
используется для получения доступа к полям объекта внутри запроса.

Этот метод выполняет запрос и возвращает результат в виде списка объектов класса User.
 Метод getResultList() вызывает выполнение запроса и возвращает список объектов User,
 представляющих записи в таблице User. Если таблица User пуста, метод вернет пустой список.*/