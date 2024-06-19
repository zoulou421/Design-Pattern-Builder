package com.formationkilo.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.formationkilo.model.BankAccount;

public interface IAccountRepository {
	BankAccount save(BankAccount bankAccount);
	List<BankAccount>findAll();
	//BankAccount findById(Long id);
	Optional<BankAccount>findById(Long id);
	List<BankAccount>searchAccounts(Predicate<BankAccount>predicate);
	BankAccount update(BankAccount account);
	void deleteId(Long id);
	
}
