package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import test.tmp.AssertEqualsTest;

import java.util.concurrent.TimeUnit;

public class RegistrationSteps {

    WebDriver driver;


    @Given("^I navigate to propertyrete web site$")
    public void iNavigateToPropertyreteWebSite() {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.propertyrete.com");
    }

    @When("^I click on the register button$")
    public void iClickOnTheRegisterButton()
    {
        driver.findElement(By.cssSelector(".bg-white-90")).click();
    }

    @And("^I enter first name$")
    public void iEnterFirstName()
    {
        driver.findElement(By.id("first_name")).sendKeys("muyiwa");
    }

    @And("^I enter last name$")
    public void iEnterLastName()
    {
        driver.findElement(By.id("last_name")).sendKeys("Babatunde");
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress()
    {
        driver.findElement(By.id("email")).sendKeys("olumuyee1@gmail.com");
    }

    @And("^I enter mobile number$")
    public void iEnterMobileNumber()
    {
        //Select dropdown = new Select(driver.findElement(By.id("country")));
        //        //dropdown.selectByVisibleText("United Kingdom");
        //        //driver.findElement(By.id("dropdown1")).click();
        //       // Select dropdown = new Select(driver.findElement(By.Id("selection")));
        //        //dropdown.selectByVisibleText("United Kingdom");
        driver.findElement(By.className("selected-flag")).click();
        driver.findElement(By.id("iti-item-gb")).click();
        driver.findElement(By.id("mobile")).sendKeys("07473373303");

    }

    @And("^I enter my password$")
    public void iEnterMyPassword()
    {
        driver.findElement(By.id("password")).sendKeys("master2000");
    }

    @And("^I confirm my password$")
    public void iConfirmMyPassword()
    {
        driver.findElement(By.id("confirm_password")).sendKeys("master2000");
    }

    @And("^I click on create account$")
    public void iClickOnCreateAccount()
    {
        driver.findElement(By.id("btn_register")).click();

    }

    @Then("^am registered$")
    public void amRegistered()
    {
        //Assert.assertEquals(driver.findElement(By.cssSelector("")));
    }

    @And("^I leave the first name blank$")
    public void iLeaveTheFirstNameBlank()
    {
        driver.findElement(By.id("first_name")).sendKeys("");
    }

    @And("^I leave the last name blank$")
    public void iLeaveTheLastNameBlank()
    {
        driver.findElement(By.id("last_name")).sendKeys("");
    }

    @And("^I enter email address\"([^\"]*)\"$")
    public void iEnterEmailAddress(String arg0) throws Throwable
    {
        driver.findElement(By.id("email")).sendKeys("olumuyee@gmail.com");
    }

    @And("^I enter mobile number\"([^\"]*)\"$")
    public void iEnterMobileNumber(String arg0) throws Throwable
    {
        driver.findElement(By.className("selected-flag")).click();
        driver.findElement(By.id("iti-item-gb")).click();
        driver.findElement(By.id("mobile")).sendKeys("07473373303");
    }

    @And("^I enter my password\"([^\"]*)\"$")
    public void iEnterMyPassword(String arg0) throws Throwable
    {
        driver.findElement(By.id("password")).sendKeys("master2000");
    }

    @And("^I confirm my password\"([^\"]*)\"$")
    public void iConfirmMyPassword(String arg0) throws Throwable
    {
        driver.findElement(By.id("confirm_password")).sendKeys("master4000");
    }

    @Then("^am not registered$")
    public void amNotRegistered()
    {
        //Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"dng_msg\"]/p")).getText(),"The Captcha field is required.");
        String actualUrl = ("https://www.propertyrete.com/account/authentication?ref=2");
       String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("^an error message is displayed$")
    public void anErrorMessageIsDisplayed()
    {

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"dng_msg\"]/p")).getText(),"The Captcha field is required.");


}
}

