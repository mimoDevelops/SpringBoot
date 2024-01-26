package ca.sheridancollege.farijosh.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.farijosh.beans.Student;
import ca.sheridancollege.farijosh.repository.StudentRepository;

@Component 
public class BootstrapData implements CommandLineRunner{

	@Autowired
	private StudentRepository studentRepository;	
	
	@Override
	public void run (String...args) throws Exception {
		
		Student jaspreet = new Student("Jaspreet", LocalDate.parse("1995-10-01"));
		Student sally = new Student("Sally", LocalDate.parse("2001-01-15"));
		Student xiao = new Student("Xiao", LocalDate.parse("1992-05-19"));
		Student tim = new Student("Tim", LocalDate.parse("1998-11-30"));

		studentRepository.save(jaspreet);
		studentRepository.save(sally);
		studentRepository.save(xiao);
		studentRepository.save(tim);
	}
	
}
