package modifiedHW2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends PageObject {
    @FindBy(id = "checkbox-1")
    private WebElement checkbox1;

    @FindBy(id = "checkbox-1")
    private WebElement checkbox2;

    @FindBy(id = "checkbox-1")
    private WebElement checkbox3;

    public WebElement getCheckbox1() {
        return checkbox1;
    }

    public WebElement getCheckbox2() {
        return checkbox2;
    }

    public WebElement getCheckbox3() {
        return checkbox3;
    }

    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSelected(WebElement checkbox) {
        return checkbox.isSelected();
    }

    public void selectCheckboxItem(WebElement checkbox) {
        checkbox.click();
    }

}
