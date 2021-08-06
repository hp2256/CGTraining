package com.hp.springmvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hp.springmvc.exceptions.LowBalanceException;

@Service
public class BankService {

	List<Integer> accNos = Arrays.asList(1234, 1235, 1236);

	public String lowBal(double pa) throws LowBalanceException {
		if (pa < 5000) {
			throw new LowBalanceException("Low Balance.");
		} else
			return "valid balance";
	}

	public String findAcc(int acc) throws com.hp.springmvc.exceptions.AccountNotFoundException {
		if (!accNos.contains(acc)) {
			throw new com.hp.springmvc.exceptions.AccountNotFoundException("Account not found");
		} else
			return "valid account";
	}
}
