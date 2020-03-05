package modifiedHW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends PageObject {

    @FindBy(id = "dropdownMenuButton")
    private WebElement dropdownMenuButton;

    public WebElement getDropdownMenuButton() {
        return dropdownMenuButton;
    }

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public WebElement findElement(int index) {
        return super.driver.findElement(By.xpath("//button[@id=\"dropdownMenuButton\"]/following-sibling::div/a[" + index + "]"));
    }

    public String getCurrentUrl() {
        return super.driver.getCurrentUrl();
    }

    public void get(String link) {
        super.driver.get(link);
    }
}
