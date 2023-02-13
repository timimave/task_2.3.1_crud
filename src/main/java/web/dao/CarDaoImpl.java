package web.dao;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

@Component
@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = Arrays.asList(
        new Car("Toyota", "Camry", 2018),
        new Car("Honda", "Civic", 2017),
        new Car("Tesla", "Model S", 2020),
        new Car("Ford", "Mustang", 2019),
        new Car("Chevrolet", "Camaro", 2016)
    );

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
