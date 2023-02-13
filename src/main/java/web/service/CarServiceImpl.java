package web.service;


import java.util.List;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}


/* Слой Service (слой сервисов) является частью архитектуры приложения,
который используется для обработки бизнес-логики приложения.
 Он обеспечивает прослойку между слоем представления (например, контроллером)
  и слоем данных (например, репозиторием).

Цель слоя Service - изолировать логику бизнеса от остальных частей
приложения и улучшить тестируемость, сопровождаемость и устойчивость приложения.

Слой Service также может использоваться для управления транзакциями,
 валидацией данных и другой важной логикой приложения.*/