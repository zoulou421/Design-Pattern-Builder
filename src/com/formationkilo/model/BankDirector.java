package com.formationkilo.model;

import com.formationkilo.model.BankAccount.AccountBuilder;

public class BankDirector {
	public static AccountBuilder accountBuilder() {
		return new AccountBuilder();
	}
}
