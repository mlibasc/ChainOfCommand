package com.CoR.Processes;

import com.CoR.Authentication;
import com.CoR.Chains.Chain;

public class ProcessCredit implements Chain {
    private Chain chain;

    @Override
    public void setNextChain(Chain nextChain){
        this.chain = nextChain;
    }

    @Override
    public void authenticate(Authentication auth){
        if(auth.getAuth() == true){
            System.out.println("Processing Credit Card...\n");
        }else if(auth.getAuth() == false){
            System.out.println("Processing failed...\n");
        }
    }
}
