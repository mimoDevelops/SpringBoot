package ca.sheridancollege.farijosh.boostrap;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.farijosh.beans.Account;
import ca.sheridancollege.farijosh.beans.AccountStatus;
import ca.sheridancollege.farijosh.beans.Student;
import ca.sheridancollege.farijosh.repository.AccountRepository;
import ca.sheridancollege.farijosh.repository.StudentRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AccountRepository accountRepository;
    private final StudentRepository studentRepository;

    @Autowired
    public BootstrapData(AccountRepository accountRepository, StudentRepository studentRepository) {
        this.accountRepository = accountRepository;
        this.studentRepository = studentRepository;
    }
	@Override
	public void run(String... args) throws Exception{
		
		Student student = Student.builder()
				.name("Paul McCartney")
				.build();
		
				Account account = Account.builder()
				.accountNumber(Integer.valueOf(1111))
				.balance(new BigDecimal("1200000000.00"))
				.status(AccountStatus.APPROVED)
				.build();
	
				account = accountRepository.save(account);
				student.setAccount(account);
				student = studentRepository.save(student);

			
	}
	
	

	
}
