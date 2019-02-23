package akdemia.cars.service;


import akdemia.cars.model.Car;
import akdemia.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

   private CarRepository carRepository;

   //@Autowired
   public CarService(CarRepository carRepository){
       this.carRepository = carRepository;
   }
   public List<Car> getCars(){
       return carRepository.findAll();
   }

}
