package Ex2;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationFormSteps {

    private String username;
    private String email;
    private String password;
    private RegistrationFormValidator validator;
    private boolean isFormValid;

    @Given("Je saisis le nom d'utilisateur {string}, l'email {string}, et le mot de passe {string}")
    public void i_enter_the_username_email_and_password(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.validator = new RegistrationFormValidator();
    }

    @When("Je valide le formulaire d'inscription")
    public void i_validate_the_registration_form() {
        this.isFormValid = this.validator.validate(this.username, this.email, this.password);
    }

    @Then("Le formulaire d'inscription doit être considéré comme valide")
    public void the_registration_form_should_be_considered_valid() {
        assertTrue(this.isFormValid);
    }

    @Then("Le formulaire d'inscription doit être considéré comme invalide")
    public void the_registration_form_should_be_considered_invalid() {
        assertFalse(this.isFormValid);
    }
}
