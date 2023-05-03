package com.example.demojwtoauth;

import com.example.demojwtoauth.repository.RoleRepository;
import com.example.demojwtoauth.repository.UserRepository;
import com.example.demojwtoauth.services.AddRoleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJwtOauthApplication implements CommandLineRunner {

    public static void main(String[] args) {



        SpringApplication.run(DemoJwtOauthApplication.class, args);
    }

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddRoleUser addRoleUser;

    @Override
    public void run(String... args) throws Exception {

        if (roleRepository.findAll().size()==0){
            roleRepository.creationRole();
        }
        if(userRepository.findAll().size()==0){
            userRepository.creationUsers();

        }
        if(userRepository.Verifier() == null){
            userRepository.AddRoleUser();
        }

    }



}
