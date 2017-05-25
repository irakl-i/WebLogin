package model;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private List<Account> accounts;

	public Manager() {
		this.accounts = new ArrayList<>();

		// Test cases:
		accounts.add(new Account("Patrick", "1234"));
		accounts.add(new Account("Molly", "FloPup"));
	}

	public boolean accountExists(Account account) {
		return accounts.contains(account);
	}

	public boolean usernameExists(Account account) {
		for (Account a : accounts) {
			if (a.getUsername().equals(account.getUsername())) return true;
		}
		return false;
	}

	public boolean matchesPassword(Account account, String password) {
		return account.getPassword().equals(password);
	}

	public void createAccount(String username, String password) {
		accounts.add(new Account(username, password));
	}

	@Override
	public String toString() {
		return "Manager{" +
				"accounts=" + accounts +
				'}';
	}
}
