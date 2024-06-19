package com.formationkilo.test;

import java.util.List;

import com.formationkilo.model.BankAccount;
import com.formationkilo.repository.AccountRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		
		//BankAccount bankAccount=BankAccount.builder()	
				/*.accountId(1L)
				.currency("EUR")
				.status(AccountStatus.CREATED)
				.type(AccountType.SAVING_ACCOUNT)
				.balance(70000)
				//.solde(70000)
				.build();*/
		//BankAccount bankAccount=Director.accountBuilder()
		/*BankAccount bankAccount=BankDirector.accountBuilder()
				.accountId(1L)
				.currency("EUR")
				.status(AccountStatus.CREATED)
				.type(AccountType.SAVING_ACCOUNT)
				.balance(70000)
				.build();	
		System.out.println(bankAccount.toString());*/
		
		//After populating data:
		AccountRepositoryImpl accountRepository= new AccountRepositoryImpl();
		accountRepository.populateData();
		List<BankAccount>bankAccounts=accountRepository.findAll();
		bankAccounts.forEach(System.out::println);
		
		

	}

}
