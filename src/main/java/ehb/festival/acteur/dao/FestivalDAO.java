package ehb.festival.acteur.dao;

import ehb.festival.acteur.entities.Festival;
import org.springframework.data.repository.CrudRepository;

public interface FestivalDAO extends CrudRepository<Festival, Integer> {
}
