package abcode.carrevamp.services;


import abcode.carrevamp.entity.CarEntity;
import abcode.carrevamp.entity.CarImage;
import abcode.carrevamp.wrappers.CarImageWrapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarService {

    CarEntity addCar(CarEntity param);

    List<CarEntity> getallCar();

    CarEntity getCarById(int id);

    CarEntity updateCar(CarEntity param);

    void deleteCar(int id);

    CarImage upload(CarImageWrapper carImageWrapper);
}
