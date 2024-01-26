package ca.sheridancollege.farijosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.farijosh.beans.Student;

public interface StudentRepository extends JpaRepository<Student, Long >{

}
