package SpringbootTitanicCrud.repositories;

import org.springframework.data.repository.CrudRepository;

import SpringbootTitanicCrud.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

	Iterable<Passenger> findBySurvived(int i);

	Iterable<Passenger> findBypClass(int i);

	Iterable<Passenger> findByCabinIsNotNull();

	Iterable<Passenger> findByParchGreaterThan(int i);

	Iterable<Passenger> findBySibSpGreaterThan(int i);

	Iterable<Passenger> findBypClassAndSurvived(int i, int j);

	Iterable<Passenger> findByEmbarked(String string);

	Iterable<Passenger> findByNameLike(String name);

	Iterable<Passenger> findByNameContaining(String string);

	Iterable<Passenger> findByName(String searchField);

}
