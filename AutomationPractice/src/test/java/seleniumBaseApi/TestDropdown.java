package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class TestDropdown {
    private WebDriver chromeDriver = new ChromeDriver();
    private WebDriverWait wait = new WebDriverWait(chromeDriver, 5);

    @BeforeClass
    public void navigateToDropdownPage() {
        chromeDriver.get("https://formy-project.herokuapp.com/dropdown");
        chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void selectDropdownLinks() {
        String[] expectedLinks = {"https://formy-project.herokuapp.com/autocomplete",
                "https://formy-project.herokuapp.com/buttons",
                "https://formy-project.herokuapp.com/checkbox",
                "https://formy-project.herokuapp.com/datepicker",
                "https://formy-project.herokuapp.com/dragdrop",
                "https://formy-project.herokuapp.com/dropdown",
                "https://formy-project.herokuapp.com/enabled",
                "https://formy-project.herokuapp.com/fileupload"
        };

//        for (int i = 0; i <= 7; i++) {
//            wait.until(ExpectedConditions.elementToBeClickable(By.id("dropdownMenuButton")));
            chromeDriver.findElement(By.id("dropdownMenuButton")).click();
//            chromeDriver.findElement(By.cssSelector("#dropdownMenuButton + div a:nth-child(" + (i+1) + ")"));
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"dropdownMenuButton\"]/following-sibling::div/a[" + (1) + "]")));
            chromeDriver.findElement(By.xpath("//button[@id=\"dropdownMenuButton\"]/following-sibling::div/a[" + (1) + "]")).click();
            String actualResult = chromeDriver.getCurrentUrl();
            String expectedResult = expectedLinks[0];
            Assert.assertEquals(actualResult, expectedResult);
            chromeDriver.navigate().back();
//        }

        chromeDriver.findElement(By.id("dropdownMenuButton")).click();
        chromeDriver.findElement(By.xpath("//button[@id=\"dropdownMenuButton\"]/following-sibling::div/a[" + (2) + "]")).click();
        String actualResult2 = chromeDriver.getCurrentUrl();
        String expectedResult2 = expectedLinks[1];
        Assert.assertEquals(actualResult2, expectedResult2);
        chromeDriver.navigate().back();

        chromeDriver.findElement(By.id("dropdownMenuButton")).click();
        chromeDriver.findElement(By.xpath("//button[@id=\"dropdownMenuButton\"]/following-sibling::div/a[" + (3) + "]")).click();
        String actualResult3 = chromeDriver.getCurrentUrl();
        String expectedResult3 = expectedLinks[2];
        Assert.assertEquals(actualResult3, expectedResult3);
        chromeDriver.navigate().back();
    }
}
