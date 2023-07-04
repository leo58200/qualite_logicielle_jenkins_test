package maven_exercice1;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmailValidationSteps {
    private String emailAddress;
    private boolean isValidEmail;

    @Given("Je saisis l'adresse e-mail {string}")
    public void jeSaisisAdresseEmail(String email) {
        emailAddress = email;
    }

    @When("Je vérifie la validité de l'adresse e-mail")
    public void jeVerifieValiditeEmail() {
        isValidEmail = EmailValidator.isValidEmail(emailAddress);
    }

    @Then("L'adresse e-mail doit être considérée comme valide")
    public void adresseEmailValide() {
        Assert.assertTrue(isValidEmail);
    }

    @Then("L'adresse e-mail doit être considérée comme invalide")
    public void adresseEmailInvalide() {
        Assert.assertFalse(isValidEmail);
    }
}