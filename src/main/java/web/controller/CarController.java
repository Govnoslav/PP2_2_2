package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.entity.Car;
import web.services.CarService;

import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getCar(Model model,
                         @RequestParam(value = "count", required = false, defaultValue = "5")int count) {
        List<Car> cars = count >= 5 ? carService.findAllCars() : carService.findExactlyNumberOfCars(count);

        model.addAttribute("cars",cars);

        return "cars";
    }
}
