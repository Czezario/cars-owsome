package akdemia.cars.repository;

import akdemia.cars.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //
public interface CarRepository extends JpaRepository<Car, Long> {


    //@Query(value = "select c from cars where c.brand") //JPQL
    @Query(value = "select * from car where plate=?1", nativeQuery = true) //sql
    Optional<Car> findCarByPlate(String plate);

}