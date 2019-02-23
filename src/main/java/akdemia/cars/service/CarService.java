package akdemia.cars.service;


import akdemia.cars.mappers.CarMapper;
import akdemia.cars.model.Car;
import akdemia.cars.model.dtos.CarDTO;
import akdemia.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

   private CarRepository carRepository;
   private CarMapper carMapper;

    public CarService(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }


   public List<Car> getCars(){
       return carRepository.findAll();
   }
   public Car getCarByPlate(String plate){
       return carRepository.findCarByPlate(plate).get();
   }

   //--------------DTO----------------------
   public  List<CarDTO> getCarsDto(){
       List<CarDTO> carDTOS = new ArrayList<>();

       for(Car car: carRepository.findAll()){
          carDTOS.add(carMapper.map(car));
       }


       return carDTOS;
   }

}
