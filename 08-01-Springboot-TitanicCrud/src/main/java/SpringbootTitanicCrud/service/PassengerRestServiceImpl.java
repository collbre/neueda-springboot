package SpringbootTitanicCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringbootTitanicCrud.domain.Passenger;
import SpringbootTitanicCrud.repositories.PassengerRepository;

@Service
public class PassengerRestServiceImpl implements PassengerRestService {
	
	@Autowired
	private PassengerRepository passengerRepository;

	public PassengerRestServiceImpl(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@Override
	public Iterable<Passenger> list() {
		return this.passengerRepository.findAll();
	}

	@Override
	public Passenger create(Passenger passenger) {
		return this.passengerRepository.save(passenger);
	}

	@Override
	public Passenger read(Integer passengerId) {
		return this.passengerRepository.findOne(passengerId);
	}

	@Override
	public Passenger update(Integer passengerId, Passenger passenger) {
		Passenger passengerToUpdate = this.passengerRepository.findOne(passengerId);
		return passengerRepository.save(passengerToUpdate);
	}

	@Override
	public void delete(Integer passengerId) {
		this.passengerRepository.delete(passengerId);
	}

}
