package Ex1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmailValidationSteps {

    private String email;
    private EmailValidator emailValidator;
    private boolean isEmailValid;

    @Given("Je saisis l'adresse e-mail {string}")
    public void i_enter_the_email_address(String email) {
        this.email = email;
        this.emailValidator = new EmailValidator();
    }

    @When("Je vérifie la validité de l'adresse e-mail")
    public void i_check_the_validity_of_the_email_address() {
        this.isEmailValid = this.emailValidator.validate(this.email);
    }

    @Then("L'adresse e-mail doit être considérée comme valide")
    public void the_email_address_should_be_considered_valid() {
        assertTrue(this.isEmailValid);
    }

    @Then("L'adresse e-mail doit être considérée comme invalide")
    public void the_email_address_should_be_considered_invalid() {
        assertFalse(this.isEmailValid);
    }
}
