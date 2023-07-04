Feature: Validation du formulaire d'inscription
    En tant qu'utilisateur
    Je veux pouvoir valider le formulaire d'inscription
    Afin de m'assurer que toutes les informations sont correctes

    Scenario: Formulaire d'inscription valide
        Given Je saisis le nom d'utilisateur "testUser", l'email "test@example.com", et le mot de passe "password123"
        When Je valide le formulaire d'inscription
        Then Le formulaire d'inscription doit être considéré comme valide

    Scenario: Formulaire d'inscription invalide
        Given Je saisis le nom d'utilisateur "", l'email "invalid_email", et le mot de passe "password123"
        When Je valide le formulaire d'inscription
        Then Le formulaire d'inscription doit être considéré comme invalide
