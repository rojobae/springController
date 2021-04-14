package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(name = "count", defaultValue = "5") int count) {
        List<Car> cars = count < 5 ? CarService.getCars(count) : CarService.getCars(CarService.getLENGTH());
        model.addAttribute("cars", cars);
        return "cars";
    }

}
