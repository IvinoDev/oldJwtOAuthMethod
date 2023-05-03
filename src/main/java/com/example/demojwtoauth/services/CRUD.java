package com.example.demojwtoauth.services;

import com.example.demojwtoauth.models.User;
import com.example.demojwtoauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRUD implements UsersCrud {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository repositoryUsers;

    @Override
    public String Supprimer(Long id_users) {
        repositoryUsers.deleteById(id_users);
        return "Supprimer avec succes";
    }


    @Override
    public String Modifier(User users) {
        return repositoryUsers.findById(users.getId()).map(
                use ->{
                    use.setEmail(users.getEmail());
                    //use.setName(users.getName());
                    use.setUsername(users.getUsername());
                    use.setPassword(passwordEncoder.encode(users.getPassword()));

                    repositoryUsers.save(use);
                    return "Modification reussie avec succès";
                }
        ).orElseThrow(() -> new RuntimeException("Cet utilisateur n'existe pas"));

    }

    @Override
    public List<User> Afficher() {
        return repositoryUsers.findAll();
    }

    @Override
    public User Ajouter(User utilisateur) {
        return null;
    }
}
