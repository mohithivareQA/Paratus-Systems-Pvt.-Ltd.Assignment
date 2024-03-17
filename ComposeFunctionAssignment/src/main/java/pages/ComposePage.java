package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposePage {
	
	private final WebDriver driver;

    @FindBy(xpath = "//*[@class='T-I T-I-KE L3']")
    private WebElement composeButton;

    @FindBy(name = "to")
    private WebElement toField;

    @FindBy(name = "subjectbox")
    private WebElement subjectField;

    @FindBy(xpath= "//*[@id=':ct']")
    private WebElement bodyField;

    @FindBy(xpath = "//*[@id=':b9']")
    private WebElement sendButton;

    @FindBy(xpath = "//span[contains(text(),'Your message has been sent.')]")
    private WebElement confirmationMessage;

    public ComposePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickComposeButton() {
        composeButton.click();
    }

    public void enterRecipient(String recipient) {
        toField.sendKeys(recipient);
    }

    public void enterSubject(String subject) {
        subjectField.sendKeys(subject);
    }

    public void enterBody(String body) {
        bodyField.sendKeys(body);
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public boolean isConfirmationMessageDisplayed() {
        return confirmationMessage.isDisplayed();
    }
}


