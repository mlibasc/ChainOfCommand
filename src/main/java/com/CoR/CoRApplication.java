package com.CoR;

import com.CoR.Chains.Chain;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoRApplication {

	public static void main(String[] args) {

		//SpringApplication.run(CoRApplication.class, args);
		GCAuthentication authGC = new GCAuthentication();
		Chain c1;
		authGC.c1.authenticate(new Authentication(true));

		BonusAuthentication authBonus = new BonusAuthentication();
		Chain c2;
		authBonus.c1.authenticate(new Authentication(true));

		VoucherAuthentication authVoucher = new VoucherAuthentication();
		Chain c3;
		authVoucher.c1.authenticate(new Authentication(true));

	}

}
