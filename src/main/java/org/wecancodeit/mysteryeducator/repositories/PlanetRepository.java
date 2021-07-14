package org.wecancodeit.mysteryeducator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.mysteryeducator.models.Planet;

public interface PlanetRepository extends CrudRepository<Planet, Long> {
}