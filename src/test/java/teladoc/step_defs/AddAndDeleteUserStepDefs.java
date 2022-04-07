package teladoc.step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.Select;
import teladoc.page.WebTablePage;
import teladoc.utils.ConfigurationReader;
import teladoc.utils.Driver;

public class AddAndDeleteUserStepDefs {

    Faker faker = new Faker();
    WebTablePage webTablePage = new WebTablePage();
    String expectedFirstName = faker.name().firstName();

    @Given("User is on the webTable page")
    public void user_is_on_the_web_table_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("teledoc_challenge_url"));
    }

    @When("User clicks on AddUser button")
    public void user_clicks_on_add_user_button() {
    webTablePage.addUserBtn.click();

    }

    @When("User fills out the information")
    public void user_fills_out_the_information() {
    webTablePage.firstNameField.sendKeys(expectedFirstName);
    webTablePage.lastNameField.sendKeys(faker.name().lastName());
    webTablePage.userNameField.sendKeys(faker.name().username());
    webTablePage.passwordField.sendKeys(faker.internet().password());
    webTablePage.companyAAA.click();
        Select select = new Select(webTablePage.roleOption);
        select.selectByVisibleText("Sales Team");
    webTablePage.emailField.sendKeys(faker.internet().emailAddress());
    webTablePage.mobilePhoneFiled.sendKeys(faker.phoneNumber().cellPhone());

    }

    @When("User clicks on Save button")
    public void user_clicks_on_save_button() {
    webTablePage.saveButton.click();

    }

    @Then("new user should be added")
    public void new_user_should_be_added() {

    String actualUserAdded = webTablePage.addedUserName.getText();
        System.out.println("actualUserAdded = " + actualUserAdded);
        System.out.println("expectedFirstName = " + expectedFirstName);
        Assertions.assertEquals(expectedFirstName, actualUserAdded, "Users don't match");

    }

    @Given("User clicks on delete Novak user button")
    public void user_clicks_on_delete_novak_user_button() {
    webTablePage.deleteNovak.click();
    }

    @Given("User clicks on OK button on Confirmation Dialog window")
    public void user_clicks_on_ok_button_on_confirmation_dialog_window() {
    webTablePage.confirmDeletion.click();
    }

    @Then("User Novak should be deleted")
    public void user_novak_should_be_deleted() {

    String tableContentAfterNovak = webTablePage.tableAfterNovakDeletion.getText();
        Assertions.assertFalse(tableContentAfterNovak.contains("Novak"));
    }

}
