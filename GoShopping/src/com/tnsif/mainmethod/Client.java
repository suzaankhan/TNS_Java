package com.tnsif.mainmethod;

import com.tnsif.application.GSNormal;
import com.tnsif.application.GSPrime;
import com.tnsif.application.GSShopFactory;

public class Client {
public static void main(String[] args) {
	GSShopFactory obj = new GSShopFactory();
	// prime account creation
	GSPrime gp = (GSPrime)obj.getNewPrimeAccount(12, "java", 500.6f, true);
	gp.bookproduct(gp.getCharges());
	
	// normal account creation
	GSNormal gn = (GSNormal)obj.getNewNormalAccount(13, "spring", 500.6f, 65.4f);
	gn.bookproduct(gn.getCharges());
}
}
