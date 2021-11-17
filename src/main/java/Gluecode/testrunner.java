package Gluecode;


import PageFactory.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;



public class testrunner {
    public static WebDriver driver;
    Login lm;

    @Given("^user is on login page$")
    public void user_is_on_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\grid\\chromedriver.exe");
        driver = new ChromeDriver();
        lm = new Login(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://classic.freecrm.com/index.html");
    }



    @When("^user clicks on login page $")
    public void user_enters_username_and_password() {
        lm.clickonloginpage();




    }



    @Then("^login page is displayed$")
    public void login_page_is_displayed() {
        WebElement YourLogin = driver.findElement(By.xpath("/html/body/div[2]/div/div/form"));
        assertTrue(YourLogin.getText().contains("Enter your username or your email address:"));




    }




    @When("^user enter valid MohitSai20 $")
    public void user_enter_valid_email_or_valid_MohitSai20() {
        lm.enterusername("MohitSai20");




    }



    @Then("^click on submit login after entering valid details$")
    public void click_on_submit_login_after_entering_valid_details() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]")).click();
        WebElement get = driver.findElement(By.id("message"));
        assertTrue(get.getText().contains("Your login is successful."));
        driver.quit();
    }

    @Given("when user navigates to site")
    public void whenUserNavigatesToSite() {
    }

    @When("user logs in using Username as “MohitSai{int}” and Password “Mohith.freecrm@{int}”")
    public void userLogsInUsingUsernameAsMohitSaiAndPasswordMohithFreecrm(int arg0, int arg1) {
        
    }

    @Then("login should be successful")
    public void loginShouldBeSuccessful() {
    }
}

