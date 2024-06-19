package com.formationkilo.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.formationkilo.model.BankAccount;

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
			
		}
	}

}
