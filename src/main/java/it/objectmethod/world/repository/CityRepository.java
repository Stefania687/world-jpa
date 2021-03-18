package it.objectmethod.world.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.world.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

	public City findByName(String name);

	public List<City> findByCountryCode(String countryCode);

}
