package uk.ac.belfastmet.rhi.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.rhi.domain.Rhi;

public interface RhiRepository extends CrudRepository<Rhi, Integer> {

	Iterable<Rhi> findByCapacity(Integer capacity);

	Iterable<Rhi> findByNameContaining(String searchString);

}
