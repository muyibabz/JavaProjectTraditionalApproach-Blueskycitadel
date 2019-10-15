package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    @Given("^I navigate to propertyrete site$")
    public void iNavigateToPropertyreteSite()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.propertyrete.com");

    }

    @And("^I click on login link$")
    public void iClickOnLoginLink()
    {
        driver.findElement(By.cssSelector(".ml2")).click();
    }

    @And("^I enter username\"([^\"]*)\"$")
    public void iEnterUsername(String arg0) throws Throwable
    {
        driver.findElement(By.id("user_email")).sendKeys("olumuyee@gmail.com");
    }


    @And("^I enter password\"([^\"]*)\"$")
    public void iEnterPassword(String arg0) throws Throwable
    {
        driver.findElement(By.id("user_password")).sendKeys("master2000");
    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton()

    {
        driver.findElement(By.id("btn_signin")).click();
    }

    @Then("^I am logged in$")
    public void aiAmLoggedIn()
    {

        WebElement welcomeMessage = driver.findElement(By.xpath("//nav/div[1]/a[1]"));
        Assert.assertTrue(welcomeMessage.isDisplayed());
    }


    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnd(String arg0, String arg1) throws Throwable
    {
        driver.findElement(By.id("user_email")).sendKeys("olumuyee1@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("master4000");
    }


    @Then("^am not signed in$")
    public void amNotSignedIn()
    {
        Assert.assertTrue(driver.findElement(By.id("btn_signin")).isDisplayed());
    }



}