package com.CoR;

public class Authentication {
    private boolean authen;

    public Authentication(boolean authen){
        this.authen = authen;
    }

    public boolean getAuth(){
        return this.authen;
    }
}