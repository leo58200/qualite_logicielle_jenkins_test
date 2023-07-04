Feature: Validation d'une adresse e-mail
    En tant qu'utilisateur
    Je veux pouvoir valider une adresse e-mail
    Afin de m'assurer de sa validité

    Scenario: Adresse e-mail valide
        Given Je saisis l'adresse e-mail "test@example.com"
        When Je vérifie la validité de l'adresse e-mail
        Then L'adresse e-mail doit être considérée comme valide

    Scenario: Adresse e-mail invalide
        Given Je saisis l'adresse e-mail "invalid_email"
        When Je vérifie la validité de l'adresse e-mail
        Then L'adresse e-mail doit être considérée comme invalide