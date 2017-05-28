package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager {
	private List<Account> accounts;

	public Manager() {
		this.accounts = Collections.synchronizedList(new ArrayList<Account>());

		// Test cases:
		accounts.add(new Account("Patrick", "1234"));
		accounts.add(new Account("Molly", "FloPup"));
	}

	/**
	 * Checks if the given account exists.
	 * @param account
	 * @return boolean exists
	 */
	public boolean accountExists(Account account) {
		return accounts.contains(account);
	}

	/**
	 * Checks if the given account's username exists.
	 * @param account
	 * @return boolean exists.
	 */
	public boolean usernameExists(Account account) {
		for (Account a : accounts) {
			if (a.getUsername().equals(account.getUsername())) return true;
		}
		return false;
	}

	/**
	 * Checks if password matches the account.
	 * @param account
	 * @param password
	 * @return boolean matches.
	 */
	public boolean matchesPassword(Account account, String password) {
		return account.getPassword().equals(password);
	}

	/**
	 * Creates a new account.
	 * @param username
	 * @param password
	 */
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
