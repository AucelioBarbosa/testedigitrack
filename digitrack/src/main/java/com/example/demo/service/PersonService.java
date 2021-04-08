package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService{
	
	
	@Autowired
	PersonRepository personRepository;

	public List<Person> listPerson() {
		return personRepository.findAll();
	}

	public Person savePerson(Person person) {
		return personRepository.save(person);
	}

	public void excludePerson(Long id) {
		personRepository.deleteById(id);
	}

	public Person updatePerson(Person person) {
		return personRepository.save(person);
	}
	
	public Optional<Person> onerPerson(Long id) {
		return personRepository.findById(id);
	}
	
}
