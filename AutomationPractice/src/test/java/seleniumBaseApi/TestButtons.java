package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestButtons {

    private WebDriver chromeDriver = new ChromeDriver();

    @BeforeClass
    public void navigateToFormyProject() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons#");
        chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void pressPrimaryButton() {
        chromeDriver.findElement(By.xpath("//button[contains(text(), \"Primary\")]")).click();
    }

    @Test(priority = 2)
    public void pressSuccessButton() {
        chromeDriver.findElement(By.className("btn-success")).click();
    }

    @Test(priority = 3)
    public void pressInfoButton() {
        chromeDriver.findElement(By.className("btn-info")).click();
    }

    @Test(priority = 4)
    public void pressWarningButton() {
        chromeDriver.findElement(By.className("btn-warning")).click();
    }

    @Test(priority = 5)
    public void pressDangerButton() {
        chromeDriver.findElement(By.className("btn-danger")).click();
    }

    @Test(priority = 6)
    public void pressLinkButton() {
        chromeDriver.findElement(By.className("btn-link")).click();
    }

    @Test(priority = 7)
    public void pressLeftButton() {
        chromeDriver.findElement(By.xpath("//button[contains(text(), \"Left\")]")).click();
    }

    @Test(priority = 8)
    public void pressMiddleButton() {
        chromeDriver.findElement(By.xpath("//button[contains(text(), \"Middle\")]")).click();
    }

    @Test(priority = 9)
    public void pressRightButton() {
        chromeDriver.findElement(By.xpath("//button[contains(text(), \"Right\")]")).click();
    }

    @Test(priority = 10)
    public void press1Button() {
        chromeDriver.findElement(By.xpath("//button[contains(text(), \"1\")]")).click();
    }

    @Test(priority = 11)
    public void press2Button() {
        chromeDriver.findElement(By.xpath("//button[contains(text(), \"2\")]")).click();
    }

    @Test(priority = 12)
    public void PressDropdownLink1() {
        chromeDriver.findElement(By.id("btnGroupDrop1")).click();
        chromeDriver.findElement(By.xpath("//a[contains(text(), \"Dropdown link 1\")]")).click();
    }

    @Test(priority = 13)
    public void PressDropdownLink2() {
        chromeDriver.findElement(By.id("btnGroupDrop1")).click();
        chromeDriver.findElement(By.xpath("//a[contains(text(), \"Dropdown link 2\")]")).click();
    }

    @AfterClass
    public void afterClass() {
        chromeDriver.quit();
    }
}
