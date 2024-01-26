package ca.sheridancollege.farijosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.farijosh.beans.Account;

public interface AccountRepository extends JpaRepository<Account, Long >{

}
