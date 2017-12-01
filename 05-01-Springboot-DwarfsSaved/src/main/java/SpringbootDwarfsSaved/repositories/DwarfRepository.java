package SpringbootDwarfsSaved.repositories;

import org.springframework.data.repository.CrudRepository;

import SpringbootDwarfsSaved.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {

	Iterable<Dwarf> findByAuthor(String string);

	Dwarf findByName(String string);

	Iterable<Dwarf> findFirst3ByAuthor(String string);

	Dwarf findByDwarfId(int i);

	Iterable<Dwarf> findByAuthorOrName(String string, String string2);

	Iterable<Dwarf> findByOrderByNameAsc();

}
