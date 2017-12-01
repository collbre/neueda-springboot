package SpringbootTitanicSaved.repositories;

import org.springframework.data.repository.CrudRepository;

import SpringbootTitanicSaved.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

	Iterable<Passenger> findBySurvived(int i);

	Iterable<Passenger> findBypClass(int i);

	Iterable<Passenger> findByCabinIsNotNull();



}
