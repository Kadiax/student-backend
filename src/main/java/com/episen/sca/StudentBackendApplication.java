package com.episen.sca;

import com.episen.sca.model.Student;
import com.episen.sca.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentBackendApplication implements CommandLineRunner {
	private StudentRepository studentRepository;

	public StudentBackendApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(StudentBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student tom = new Student("Anderson","Tom", "m","25","tom@gmail.com", false, "Ing3" );
		Student jerry = new Student("Dupont","Jerry", "m","24","jerry@gmail.com", true, "Ing2" );
		Student lisa = new Student("Black","Lisa", "f","23","lisa@gmail.com", false, "Ing1" );

		studentRepository.save(tom);
		studentRepository.save(jerry);
		studentRepository.save(lisa);
	}
}
