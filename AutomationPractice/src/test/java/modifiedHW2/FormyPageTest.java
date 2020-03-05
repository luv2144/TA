package modifiedHW2;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class FormyPageTest extends FunctionalTest {

    @Test
    public void testCheckboxPage() {
        driver.get("https://formy-project.herokuapp.com/checkbox");

        CheckboxPage checkboxPage = new CheckboxPage(driver);
        checkboxPage.selectCheckboxItem(checkboxPage.getCheckbox1());
        checkboxPage.selectCheckboxItem(checkboxPage.getCheckbox2());
        checkboxPage.selectCheckboxItem(checkboxPage.getCheckbox3());
        assertTrue(checkboxPage.isSelected(checkboxPage.getCheckbox1()));
        assertTrue(checkboxPage.isSelected(checkboxPage.getCheckbox2()));
        assertTrue(checkboxPage.isSelected(checkboxPage.getCheckbox3()));
    }

    @Test
    public void testButtonsPage() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.getPrimaryButton().click();
        buttonsPage.getSuccessButton().click();
        buttonsPage.getInfoButton().click();
        buttonsPage.getWarningButton().click();
        buttonsPage.getDangerButton().click();
        buttonsPage.getLinkButton().click();
        buttonsPage.getLeftButton().click();
        buttonsPage.getMiddleButton().click();
        buttonsPage.getRightButton().click();
        buttonsPage.getButton1().click();
        buttonsPage.getButton2().click();
        buttonsPage.getDropdownGroupButton().click();
        buttonsPage.getDropdownLink1().click();
        buttonsPage.getDropdownGroupButton().click();
        buttonsPage.getDropdownLink2().click();
    }

    @Test(dataProvider = "expectedLinks", dataProviderClass = StaticProvider.class)
    public void testDropdownPage(int index, String expectedLink) {
        driver.get("https://formy-project.herokuapp.com/dropdown");
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getDropdownMenuButton().click();
        WebElement currentWebElement = dropdownPage.findElement(index);
        currentWebElement.click();
        String actualResult = dropdownPage.getCurrentUrl();
        String expectedResult = expectedLink;
        Assert.assertEquals(actualResult, expectedResult);
        dropdownPage.get("https://formy-project.herokuapp.com/dropdown");
    }

    @Test
    public void testWebFormPage() {
        driver.get("https://formy-project.herokuapp.com/form");
        WebFormPage webFormPage = new WebFormPage(driver);

    }

}
