package com.example.demojwtoauth.repository;

import com.example.demojwtoauth.models.ERole;
import com.example.demojwtoauth.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
    // Role findByName(String name);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO ROLES (name) VALUES (\"ROLE_ADMIN\");",nativeQuery = true)
    void creationRole();

}
