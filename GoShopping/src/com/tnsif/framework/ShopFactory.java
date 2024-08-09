package com.tnsif.framework;

public interface ShopFactory {
	public PrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean isPrime);
	public NormalAcc getNewNormalAccount(int accNo,String accNm,float charges,float deliverycharges);
}
