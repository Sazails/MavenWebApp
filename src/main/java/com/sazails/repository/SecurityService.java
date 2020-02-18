package com.sazails.repository;

public interface SecurityService {
    public String findLoggedInUsername();
    public void autoLogin(String username, String password);
}
