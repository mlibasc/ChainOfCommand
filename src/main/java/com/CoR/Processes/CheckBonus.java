package com.CoR.Processes;

import com.CoR.Authentication;
import com.CoR.Chains.Chain;

public class CheckBonus implements Chain {
    private Chain chain;

    @Override
    public void setNextChain(Chain nextChain){
        this.chain = nextChain;
    }

    @Override
    public void authenticate(Authentication auth){
        if(auth.getAuth() == true){
            System.out.println("Bonus: Credit check is OK...");
            this.chain.authenticate(auth);
        }else if(auth.getAuth() == false){
            System.out.println("Bonus: Credit check is NOT OK...");
            this.chain.authenticate(auth);
        }
    }
}
