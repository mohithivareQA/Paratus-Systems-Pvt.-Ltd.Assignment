package steps;

import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ComposePage;
import pages.LoginPage;

public class ComposeStepDefination {
	
	
	private final WebDriver driver = new ChromeDriver();
    private final LoginPage loginPage = new LoginPage(driver);
    private final ComposePage composePage = new ComposePage(driver);

    @Given("I am logged in to Gmail")
    public void i_am_logged_in_to_Gmail() {
        driver.get("https://mail.google.com");
        loginPage.enterEmail("xyz@gmail.com");
        loginPage.clickNext();
        // Wait for the password input field to be visible
        loginPage.enterPassword("Paratus@2024");
        loginPage.clickPasswordNext();
    }

    @When("I compose a new email with subject {string} and body {string}")
    public void i_compose_a_new_email_with_subject_and_body(String subject, String body) {
        composePage.clickComposeButton();
        composePage.enterRecipient("recipient@example.com");
        composePage.enterSubject(subject);
        composePage.enterBody(body);
    }

    @When("I add recipient {string}")
    public void i_add_recipient(String recipient) {
        composePage.enterRecipient(recipient);
    }

    @When("I click on the send button")
    public void i_click_on_the_send_button() {
        composePage.clickSendButton();
    }

    @Then("the email should be sent successfully")
    public void the_email_should_be_sent_successfully() {
        // Assuming the confirmation message is displayed on the next page
        assert composePage.isConfirmationMessageDisplayed();
        
        driver.quit();
    }
}


