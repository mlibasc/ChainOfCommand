package com.CoR;

import com.CoR.Chains.Chain;
import com.CoR.Processes.CheckBonus;
import com.CoR.Processes.ProcessCredit;

public class BonusAuthentication {
    Chain c1;

    public BonusAuthentication(){
        this.c1 = new CheckBonus();
        Chain c2 = new ProcessCredit();
        c1.setNextChain(c2);
    }
}
