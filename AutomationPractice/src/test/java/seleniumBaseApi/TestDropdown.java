package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class TestDropdown {
    protected WebDriver chromeDriver;
    protected Wait<WebDriver> wait;

    @DataProvider(name = "expectedLinks")
    public static Object[][] verifyLinks() {
        return new Object[][]{{1, "https://formy-project.herokuapp.com/autocomplete"},
                {2, "https://formy-project.herokuapp.com/buttons"},
                {3, "https://formy-project.herokuapp.com/checkbox"},
                {4, "https://formy-project.herokuapp.com/datepicker"},
                {5, "https://formy-project.herokuapp.com/dragdrop"},
                {6, "https://formy-project.herokuapp.com/dropdown"},
                {7, "https://formy-project.herokuapp.com/enabled"},
                {8, "https://formy-project.herokuapp.com/fileupload"},
                {9, "https://formy-project.herokuapp.com/filedownload"},
                {10, "https://formy-project.herokuapp.com/keypress"},
                {11, "https://formy-project.herokuapp.com/modal"},
                {12, "https://formy-project.herokuapp.com/scroll"},
                {13, "https://formy-project.herokuapp.com/radiobutton"},
                {14, "https://formy-project.herokuapp.com/switch-window"},
                {15, "https://formy-project.herokuapp.com/form"}
        };
    }

    @BeforeClass
    public void navigateToDropdownPage() {
        chromeDriver = new ChromeDriver();
        wait = new FluentWait<WebDriver>(chromeDriver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        chromeDriver.get("https://formy-project.herokuapp.com/dropdown");
        chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void closeBrowser() {
        chromeDriver.quit();
    }

    @Test(dataProvider = "expectedLinks")
    public void selectDropdownLinks1(int index, String expectedLink) {
        WebElement clickDropdownButton = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver chromeDriver) {
                return chromeDriver.findElement(By.id("dropdownMenuButton"));
            }
        });
        clickDropdownButton.click();
        WebElement clickDropdownLink = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver chromeDriver) {
                return chromeDriver.findElement(By.xpath("//button[@id=\"dropdownMenuButton\"]/following-sibling::div/a[" + index + "]"));
            }
        });
        clickDropdownLink.click();
        String actualResult = chromeDriver.getCurrentUrl();
        String expectedResult = expectedLink;
        Assert.assertEquals(actualResult, expectedResult);
        chromeDriver.get("https://formy-project.herokuapp.com/dropdown");
    }
}
