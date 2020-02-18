package com.sazails.repository;

import com.sazails.model.UserData;

public interface UserService {
    public void save(UserData user);
    public UserData findByUsername(String username);
}
