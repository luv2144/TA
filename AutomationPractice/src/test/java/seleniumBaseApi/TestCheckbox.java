package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCheckbox {

    private WebDriver chromeDriver = new ChromeDriver();

    @DataProvider(name = "byCSS")
    public static Object[][] argsCSS() {
        return new Object[][] {{"#checkbox-1"}, {"#checkbox-2"}, {"#checkbox-3"}};
    }

    @DataProvider(name = "byXPath")
    public static Object[][] argsXPath() {
        return new Object[][] {{"//input[@id=\"checkbox-1\"]"}, {"//input[@id=\"checkbox-2\"]"}, {"//input[@id=\"checkbox-3\"]"}};
    }

    @BeforeClass
    public void navigateToFormyProject() {
        chromeDriver.get("https://formy-project.herokuapp.com/checkbox");
        chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Test(dataProvider = "byXPath")
    public void selectCheckboxItemsByXPath(String path) {
        chromeDriver.findElement(By.xpath(path)).click();
    }

    @Test(dataProvider = "byCSS")
    public void selectCheckboxItemsByCSS(String path) {
        chromeDriver.findElement(By.cssSelector(path)).click();
    }

    @AfterClass
    public void afterClass() {
        chromeDriver.quit();
    }

}
