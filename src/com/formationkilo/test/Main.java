package com.formationkilo.test;

import com.formationkilo.model.AccountStatus;
import com.formationkilo.model.AccountType;
import com.formationkilo.model.BankAccount;

public class Main {

	public static void main(String[] args) {
		BankAccount bankAccount=BankAccount.builder()
				
				.accountId(1L)
				.currency("EUR")
				.status(AccountStatus.CREATED)
				.type(AccountType.SAVING_ACCOUNT)
				.balance(70000)
				//.solde(70000)
				.build();
		System.out.println(bankAccount.toString());

	}

}
