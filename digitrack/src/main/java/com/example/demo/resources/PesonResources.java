package com.example.demo.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1")
public class PesonResources {

	@Autowired
	PersonService personService;

	@GetMapping("/person")
	public List<Person> allListPerson() {
		return personService.listPerson();
	}

	@PostMapping("/person")
	public Person insertPerson(@RequestBody Person person) {
		return personService.savetPerson(person);
	}

	@DeleteMapping("/person/{id}")
	public void delitePerson(@PathVariable(value = "id" )Long id) {
		personService.excludePerson(id);
	}

	@PutMapping("/person")
	public Person modifyPerson(@RequestBody Person person) {
		return personService.updatePerson(person);
	}
	
	@GetMapping("/person/{id}")
	public Optional<Person> findById(@PathVariable(value = "id") Long id) {
		return personService.onerPerson(id);
	}

}
