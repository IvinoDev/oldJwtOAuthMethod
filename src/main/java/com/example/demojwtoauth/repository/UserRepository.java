package com.example.demojwtoauth.repository;

import com.example.demojwtoauth.models.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface UserRepository {
    Optional<User> findByUsername(String username);

    //User findByUsername(String user);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);


    @Query(value = "SELECT * FROM `user_roles` WHERE user_roles.user_id = '1' and user_roles.role_id = '1';",nativeQuery = true)
    String Verifier();

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO USERS (email,password,username) VALUES ('adama@c.com',  'adama123', 'adama');",nativeQuery = true)
    void creationUsers();

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO user_roles (user_id, role_id) VALUES ('1', '1')",nativeQuery = true)
    void AddRoleUser();
}
