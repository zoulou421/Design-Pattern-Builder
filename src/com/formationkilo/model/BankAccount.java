package com.formationkilo.model;

public class BankAccount {
 private Long accountId;
 private double balance;
 private double solde;
 private String currency;
 private AccountType type;
 private AccountStatus status;
public Long getAccountId() {
	return accountId;
}
public void setAccountId(Long accountId) {
	this.accountId = accountId;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
public AccountType getType() {
	return type;
}
public void setType(AccountType type) {
	this.type = type;
}
public AccountStatus getStatus() {
	return status;
}
public void setStatus(AccountStatus status) {
	this.status = status;
}

public BankAccount() {
}
public BankAccount(Long accountId, double balance, double solde, String currency, AccountType type,
		AccountStatus status) {
	this.accountId = accountId;
	this.balance = balance;
	this.solde = solde;
	this.currency = currency;
	this.type = type;
	this.status = status;
}
@Override
public String toString() {
	return "BankAccount [accountId=" + accountId + ", balance=" + balance + ", solde=" + solde + ", currency="
			+ currency + ", type=" + type + ", status=" + status + "]";
}

//Remove and relocate builder method into Director class/
//and renamed it accountBuilder
 public static class AccountBuilder{
	private BankAccount bankAccount=new BankAccount();
	
	public AccountBuilder accountId(Long id) {
		bankAccount.accountId=id;
		return this;
		
	}
	public AccountBuilder currency(String currency) {
		bankAccount.currency=currency;
		return this;
	}
	public AccountBuilder balance(double balance) {
		bankAccount.balance=balance;
		return this;
	}
	public AccountBuilder solde(double solde) {
		bankAccount.solde=solde;
		return this;
	}
	public AccountBuilder type(AccountType type) {
		bankAccount.type=type;
		return this;
	}
	public AccountBuilder status(AccountStatus status) {
		bankAccount.status=status;
		return this;
	}
	public BankAccount build() {
		return this.bankAccount;
	}
 }
 
 
 
}
