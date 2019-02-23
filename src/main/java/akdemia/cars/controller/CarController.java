package akdemia.cars.controller;

import akdemia.cars.model.Car;
import akdemia.cars.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CarController {

    public CarController(CarService carService) {
        this.carService = carService;
    }

    private CarService carService;

   // @RequestMapping(value = "/cars", method = RequestMethod.GET)

    @GetMapping("/cars")
    public List<Car>getCars(){
        return carService.getCars();
    }

}
