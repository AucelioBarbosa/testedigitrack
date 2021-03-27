package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1")
public class PesonResources {

	@Autowired
	PersonService personService;

	@GetMapping("/persons")
	public List<Person> allListPerson() {
		return personService.listPerson();
	}

	@PostMapping("/person")
	public Person insertPerson(@RequestBody Person person) {
		return personService.savetPerson(person);
	}

	@DeleteMapping("/person")
	public void delitePerson(@RequestBody Person person) {
		personService.excludePerson(person);
	}

	@PutMapping("/person")
	public Person modifyPerson(@RequestBody Person person) {
		return personService.updatePerson(person);
	}

}
