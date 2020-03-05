package modifiedHW2;

import example.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebFormPage extends PageObject {

    @FindBy(id = "first-name")
    private WebElement firstNameEntryField;

    @FindBy(id = "last-name")
    private WebElement lastNameEntryField;

    @FindBy(id = "job-title")
    private WebElement jobEntryField;

    public WebFormPage(WebDriver driver) {
        super(driver);
    }
}
