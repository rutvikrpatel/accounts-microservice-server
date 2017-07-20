package com.rutvikpatel.ms.accounts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * @author RutvikPatel
 *
 */
@Repository
public class StubAccountRepository implements AccountRepository {
	
	private Map<String, Account> accountsByNumber = new HashMap<String, Account>();
	
	public StubAccountRepository() {
		Account account = new Account(1l, "Rutvik" , "3");
		accountsByNumber.put("3", account);
		account = new Account(2l, "Maulik" , "2");
		accountsByNumber.put("2", account);
		account = new Account(3l, "Krupal" , "1");
		accountsByNumber.put("1", account);
		Logger.getLogger(StubAccountRepository.class).info("Created StubAccountRepository");
	}
	
	public List<Account> getAllAccounts() {
		return new ArrayList<Account>(accountsByNumber.values());
	}

	public Account getAccount(String number) {
		return accountsByNumber.get(number);
	}

}
