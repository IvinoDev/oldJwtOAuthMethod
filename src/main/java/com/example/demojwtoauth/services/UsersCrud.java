package com.example.demojwtoauth.services;

public interface UsersCrud {
    String Supprimer(Long id_users);  // LA METHODE PERMETTANT DE SUPPRIMER UN COLLABORATEUR

    String Modifier(User users);   // LA METHODE PERMETTANT DE MODIFIER UN COLLABORATEUR

    List<User> Afficher();       // LA METHODE PERMETTANT D'AFFICHER UN COLLABORATEUR

    User Ajouter(User utilisateur); // LA METHODE PERMETTANT D'AJOUTER UN COLLABORATEUR
}
