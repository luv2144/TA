package modifiedHW2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends PageObject {

    @FindBy(xpath = "//button[contains(text(), \"Primary\")]")
    private WebElement primaryButton;

    @FindBy(className = "btn-success")
    private WebElement successButton;

    @FindBy(className = "btn-info")
    private WebElement infoButton;

    @FindBy(className = "btn-warning")
    private WebElement warningButton;

    @FindBy(className = "btn-danger")
    private WebElement dangerButton;

    @FindBy(className = "btn-link")
    private WebElement linkButton;

    @FindBy(xpath = "//button[contains(text(), \"Left\")]")
    private WebElement leftButton;

    @FindBy(xpath = "//button[contains(text(), \"Middle\")]")
    private WebElement middleButton;

    @FindBy(xpath = "//button[contains(text(), \"Right\")]")
    private WebElement rightButton;

    @FindBy(xpath = "//button[contains(text(), \"1\")]")
    private WebElement button1;

    @FindBy(xpath = "//button[contains(text(), \"2\")]")
    private WebElement button2;

    @FindBy(id = "btnGroupDrop1")
    private WebElement dropdownGroupButton;

    @FindBy(xpath = "//a[contains(text(), \"Dropdown link 1\")]")
    private WebElement dropdownLink1;

    @FindBy(xpath = "//a[contains(text(), \"Dropdown link 2\")]")
    private WebElement dropdownLink2;

    public WebElement getPrimaryButton() {
        return primaryButton;
    }

    public WebElement getSuccessButton() {
        return successButton;
    }

    public WebElement getInfoButton() {
        return infoButton;
    }

    public WebElement getWarningButton() {
        return warningButton;
    }

    public WebElement getDangerButton() {
        return dangerButton;
    }

    public WebElement getLinkButton() {
        return linkButton;
    }

    public WebElement getLeftButton() {
        return leftButton;
    }

    public WebElement getMiddleButton() {
        return middleButton;
    }

    public WebElement getRightButton() {
        return rightButton;
    }

    public WebElement getButton1() {
        return button1;
    }

    public WebElement getButton2() {
        return button2;
    }

    public WebElement getDropdownGroupButton() {
        return dropdownGroupButton;
    }

    public WebElement getDropdownLink1() {
        return dropdownLink1;
    }

    public WebElement getDropdownLink2() {
        return dropdownLink2;
    }

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

}
