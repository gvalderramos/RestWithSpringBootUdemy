package br.com.erudio.converter.mocks;

import java.util.ArrayList;
import java.util.List;

import br.com.erudio.data.model.Person;
import br.com.erudio.data.vo.PersonVO;

public class MockPerson {
	
	public Person mockEntity() {
		return mockEntity(0);
	}
	
	private Person mockEntity(Integer number) {
		Person person = new Person();
		person.setAddress("Some Address test " + number);
		person.setFirstName("First name Test" + number);
		person.setGender(((number % 2)==0) ? "Male" : "Female");
		person.setLastName("Last name test " + number);
		person.setId(number.longValue());
		
		return person;
	}

	public PersonVO mockVO(Integer number) {
		PersonVO person = new PersonVO();
		person.setAddress("Some Address test " + number);
		person.setFirstName("First name Test" + number);
		person.setGender(((number % 2)==0) ? "Male" : "Female");
		person.setLastName("Last name test " + number);
		person.setId(number.longValue());
		
		return person;
	}
	
	private PersonVO mockVO(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> mockEntityList(){
		List<Person> people = new ArrayList<Person>();
		for (int i = 0; i < 14; i++) {
			people.add(mockEntity(i));
		}
		return people;
	}
	
	public List<PersonVO> mockVOList(){
		List<PersonVO> people = new ArrayList<PersonVO>();
		for (int i = 0; i < 14; i++) {
			people.add(mockVO(i));
		}
		return people;
	}
}
