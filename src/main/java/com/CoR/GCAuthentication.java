package com.CoR;

import com.CoR.Chains.Chain;
import com.CoR.Processes.CheckGC;
import com.CoR.Processes.ProcessCredit;

public class GCAuthentication {

    Chain c1;

    public GCAuthentication(){
        this.c1 = new CheckGC();
        Chain c2 = new ProcessCredit();
        c1.setNextChain(c2);
    }
}