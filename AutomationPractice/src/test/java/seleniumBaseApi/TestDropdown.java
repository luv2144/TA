package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestDropdown {
    WebDriver chromeDriver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(chromeDriver, 10);

    @DataProvider(name = "expectedLinks")
    public static Object[][] verifyLinks() {
        return new Object[][]{{1, "https://formy-project.herokuapp.com/autocomplete"},
                {2, "https://formy-project.herokuapp.com/buttons"},
                {3, "https://formy-project.herokuapp.com/checkbox"},
                {4, "https://formy-project.herokuapp.com/datepicker"},
                {5, "https://formy-project.herokuapp.com/dragdrop"},
                {6, "https://formy-project.herokuapp.com/dropdown"},
                {7, "https://formy-project.herokuapp.com/enabled"},
                {8, "https://formy-project.herokuapp.com/fileupload"}
        };
    }

    @BeforeClass
    public void navigateToDropdownPage() {
        chromeDriver.get("https://formy-project.herokuapp.com/dropdown");
        chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Test(dataProvider = "expectedLinks")
    public void selectDropdownLinks(int index, String expectedLink) {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("dropdownMenuButton")));
        chromeDriver.findElement(By.id("dropdownMenuButton")).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"dropdownMenuButton\"]/following-sibling::div/a[" + index + "]")));
        chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        chromeDriver.findElement(By.xpath("//button[@id=\"dropdownMenuButton\"]/following-sibling::div/a[" + index + "]")).click();
        String actualResult = chromeDriver.getCurrentUrl();
        String expectedResult = expectedLink;
        Assert.assertEquals(actualResult, expectedResult);
        chromeDriver.navigate().back();
    }
}
