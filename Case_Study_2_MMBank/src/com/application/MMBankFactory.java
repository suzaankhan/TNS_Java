package com.application;

import com.framework.BankFactory;
import com.framework.CurrentAcc;
import com.framework.SavingAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		SavingAcc savingacc = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return savingacc;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		CurrentAcc currentacc = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return currentacc;
	}

}
