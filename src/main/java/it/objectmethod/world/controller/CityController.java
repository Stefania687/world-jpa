package it.objectmethod.world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.world.entity.City;
import it.objectmethod.world.repository.CityRepository;

@RestController
@RequestMapping("/api/city")
public class CityController {

	@Autowired
	private CityRepository cityRepo;

	@GetMapping("/{name}/find-city")
	public City findCityByName(@PathVariable("name") String name) {
		City city = cityRepo.findByName(name);
		return city;
	}

	@GetMapping("/{countryCode}/cities")
	public List<City> findCity(@PathVariable("countryCode") String countryCode) {
		List<City> cities = cityRepo.findIdAndPopulationByCountryCode(countryCode);
		return cities;
	}

}
