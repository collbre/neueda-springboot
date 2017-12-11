package SpringbootTitanicSaved.repositories;

import org.springframework.data.repository.CrudRepository;

import SpringbootTitanicSaved.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

	Iterable<Passenger> findBySurvived(int i);

	Iterable<Passenger> findBypClass(int i);

	Iterable<Passenger> findByCabinIsNotNull();

	Iterable<Passenger> findByParchGreaterThan(int i);

	Iterable<Passenger> findBySibSpGreaterThan(int i);

	Iterable<Passenger> findBypClassAndSurvived(int i, int j);



}
