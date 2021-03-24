package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	public List<Person> listPerson() {
		return personRepository.findAll();
	}

	public Person savetPerson(Person person) {
		return personRepository.save(person);
	}

	public void excludePerson(Person person) {
		personRepository.delete(person);
	}

	public Person updatePerson(Person person) {
		return personRepository.save(person);
	}
}
