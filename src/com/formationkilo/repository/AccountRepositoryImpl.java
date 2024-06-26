package com.formationkilo.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.formationkilo.model.AccountStatus;
import com.formationkilo.model.AccountType;
import com.formationkilo.model.BankAccount;
import com.formationkilo.model.BankDirector;

public class AccountRepositoryImpl implements IAccountRepository{

	private Map<Long,BankAccount>bankAccountMap=new HashMap<>();
	private long accountsCount=0;
	@Override
	public BankAccount save(BankAccount bankAccount) {
		long accountId=++accountsCount;
		bankAccount.setAccountId(accountId);
		bankAccountMap.put(accountId, bankAccount);
		return bankAccount;
	}

	@Override
	public List<BankAccount> findAll() {
		return bankAccountMap.values().stream().toList();
	}

	@Override
	public Optional<BankAccount> findById(Long id) {
		BankAccount account=bankAccountMap.get(id);
		if(account==null) {
			return Optional.empty();
		}
		return Optional.of(account);
	}

	@Override
	public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {
		return bankAccountMap.values().stream().filter(predicate).collect(Collectors.toList());
	}

	@Override
	public BankAccount update(BankAccount account) {
        bankAccountMap.put(account.getAccountId(), account);
		return account;
	}

	@Override
	public void deleteId(Long id) {
		bankAccountMap.remove(id);
	}
	public void populateData() {
		for(int i=0;i<10;i++) {
		BankAccount	account =BankDirector.accountBuilder()
				.balance(10000+Math.random()*90000)
				.type(Math.random()>0.5?AccountType.SAVING_ACCOUNT:AccountType.CURRENT_ACCOUNT)
				.status(Math.random()>0.5? AccountStatus.CREATED:AccountStatus.ACTIVATED)
				.currency(Math.random()>0.5?"EUR":"USD")
				.build();
		  save(account);
		}
	}

}
