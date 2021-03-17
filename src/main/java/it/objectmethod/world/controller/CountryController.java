package it.objectmethod.world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.world.entity.Country;
import it.objectmethod.world.repository.CountryRepository;

@RestController
@RequestMapping("/api/country")
public class CountryController {

	@Autowired
	private CountryRepository countryRepo;

	@GetMapping("/find-continent")
	public List<String> findContinentFromCountry() {
		List<String> continent = countryRepo.findDistinctContinent();
		return continent;
	}

	@GetMapping("/find-country-name")
	public List<Country> findCountryName(@RequestParam("continent") String continent) {
		List<Country> countryName = countryRepo.findCountryNameAndPopulationByContinent(continent);
		return countryName;
	}

	@GetMapping("/find-country")
	public List<Country> findCountry(@RequestParam("countryName") String countryName,
			@RequestParam("continent") String continent) {
		List<Country> countries = countryRepo.findCountryByNameAndContinent(countryName, continent);
		return countries;
	}

}
