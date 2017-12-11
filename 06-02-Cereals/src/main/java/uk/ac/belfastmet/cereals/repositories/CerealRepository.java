package uk.ac.belfastmet.cereals.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.cereals.domain.Cereal;

public interface CerealRepository extends CrudRepository<Cereal, Integer> {

}
