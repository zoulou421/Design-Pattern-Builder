package com.formationkilo.model;

import com.formationkilo.model.BankAccount.AccountBuilder;

public class Director {
	public static AccountBuilder accountBuilder() {
		return new AccountBuilder();
	}
}
