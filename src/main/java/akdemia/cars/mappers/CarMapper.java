package akdemia.cars.mappers;

import akdemia.cars.commons.Mapper;
import akdemia.cars.model.Car;
import akdemia.cars.model.dtos.CarDTO;
import org.springframework.stereotype.Component;

@Component
public class CarMapper implements Mapper<Car, CarDTO> {

    @Override
    public CarDTO map(Car from) {
        return CarDTO.builder().brand(from.getBrand())
                .model(from.getModel())
                .power(from.getPower())
                .plate(from.getPlate())
                .build();

    }
}
