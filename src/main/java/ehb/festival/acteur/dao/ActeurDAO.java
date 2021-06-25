package ehb.festival.acteur.dao;

import ehb.festival.acteur.entities.Acteur;
import org.springframework.data.repository.CrudRepository;

public interface ActeurDAO extends CrudRepository<Acteur, Integer> {
}
