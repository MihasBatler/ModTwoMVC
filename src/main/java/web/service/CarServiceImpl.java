package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> carList(Integer count) {
        List<Car> carsList;
        carsList = new ArrayList<>();
        carsList.add(new Car("Mercedes", "Benz", 528));
        carsList.add(new Car("Hyundai", "Creta", 150));
        carsList.add(new Car("Nissan", "Almera", 110));
        carsList.add(new Car("Toyota", "Rav4", 206));
        carsList.add(new Car("Mitsubishi", "Outlander", 184));
        return carsList.stream().limit(count).collect(Collectors.toList());

    }
}
