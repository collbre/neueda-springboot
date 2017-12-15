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
	public Passenger update(Integer passengerId, Passenger update) {
		Passenger passenger = this.passengerRepository.findOne(passengerId);
		passenger.setSurvived(update.getSurvived());
		passenger.setpClass(update.getpClass());
		passenger.setName(update.getName());
		passenger.setSex(update.getSex());
		passenger.setAge(update.getAge());
		passenger.setSibSp(update.getSibSp());
		passenger.setParch(update.getParch());
		passenger.setTicket(update.getTicket());
		passenger.setFare(update.getFare());
		passenger.setCabin(update.getCabin());
		passenger.setEmbarked(update.getEmbarked());
		return passengerRepository.save(passenger);
	}

	@Override
	public void delete(Integer passengerId) {
		this.passengerRepository.delete(passengerId);
	}

}
