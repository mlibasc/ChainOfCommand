package com.CoR;

import com.CoR.Chains.Chain;
import com.CoR.Processes.CheckVoucher;
import com.CoR.Processes.ProcessCredit;

public class VoucherAuthentication {
    Chain c1;

    public VoucherAuthentication(){
        this.c1 = new CheckVoucher();
        Chain c2 = new ProcessCredit();
        c1.setNextChain(c2);
    }
}
