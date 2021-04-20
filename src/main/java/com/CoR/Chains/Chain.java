package com.CoR.Chains;

import com.CoR.Authentication;

public interface Chain {
    void setNextChain(Chain nextChain);
    void authenticate(Authentication auth);
}
