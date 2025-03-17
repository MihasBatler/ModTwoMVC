package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;


import java.util.List;


@Controller
public class CarsController {
    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(defaultValue = "5") Integer count, Model model) {
        List<Car> myCar = carService.carList(count);
        model.addAttribute("cars", myCar);
        return "cars";
    }
}
