package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private static final List<Car> CARS = new ArrayList<>(Arrays.asList(
            new Car("model1", 1, "color1"),
            new Car("model2", 2, "color2"),
            new Car("model3", 3, "color3"),
            new Car("model4", 4, "color4"),
            new Car("model5", 5, "color5")));


    public static List<Car> getCars(int count) {
        return CARS.stream()
                .limit(count)
                .collect(Collectors.toList());
    }

    public static int getLENGTH() {
        return CARS.size();
    }

}
