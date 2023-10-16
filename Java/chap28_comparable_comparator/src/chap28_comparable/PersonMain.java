package chap28_comparable;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
	private String name;
	private int age;
	
	
	public PersonMain(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(PersonMain otherPerson) {
		
		return this.age - otherPerson.age;
	}
	
	@Override
	public String toString() {
		return "PersonMain{name=" + name + ", age " + age;
	}

	public static void main(String[] args) {
		List<PersonMain> people = new ArrayList<>();
		people.add(new PersonMain("�л�1",78));
		people.add(new PersonMain("�л�2",60));
		
		//���̸� �������� ����
		//Collections.short(people);
		
		for(PersonMain person : people) {
			System.out.println(person);
		}
		
		
	}

}
