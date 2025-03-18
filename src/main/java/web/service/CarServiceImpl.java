package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> writeCars(Integer count) {
        List<Car> carsRoster;
        carsRoster = new ArrayList<>();
        carsRoster.add(new Car("Mercedes", "Benz", 528));
        carsRoster.add(new Car("Hyundai", "Creta", 150));
        carsRoster.add(new Car("Nissan", "Almera", 110));
        carsRoster.add(new Car("Toyota", "Rav4", 206));
        carsRoster.add(new Car("Mitsubishi", "Outlander", 184));
        return carsRoster.stream().limit(count).collect(Collectors.toList());

    }
}
