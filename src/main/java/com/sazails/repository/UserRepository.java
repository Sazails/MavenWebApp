package com.sazails.repository;

import com.sazails.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository {
    UserData findByUsername(String username);
}
