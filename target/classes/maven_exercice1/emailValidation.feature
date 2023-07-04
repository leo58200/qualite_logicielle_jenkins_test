Feature: Validation d'une adresse e-mail
    En tant qu'utilisateur
    Je veux pouvoir valider une adresse e-mail
    Afin de m'assurer de sa validit�

    Scenario: Adresse e-mail valide
        Given Je saisis l'adresse e-mail "test@example.com"
        When Je v�rifie la validit� de l'adresse e-mail
        Then L'adresse e-mail doit �tre consid�r�e comme valide

    Scenario: Adresse e-mail invalide
        Given Je saisis l'adresse e-mail "invalid_email"
        When Je v�rifie la validit� de l'adresse e-mail
        Then L'adresse e-mail doit �tre consid�r�e comme invalide