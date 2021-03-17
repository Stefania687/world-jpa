package it.objectmethod.world.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.world.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

	@Query(value = "SELECT DISTINCT continent FROM Country")
	public List<String> findDistinctContinent();

	@Query(value = "SELECT c FROM Country c WHERE continent = ?1")
	public List<Country> findCountryNameAndPopulationByContinent(String continent);

	@Query(value = "SELECT c FROM Country c WHERE ('' = ?1 OR countryName = ?1) AND ('' = ?2 OR continent = ?2)")
	public List<Country> findCountryByNameAndContinent(String countryName, String continent);
}
