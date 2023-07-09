package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePage_Factory;
import pageFactory.loginPage_Factory;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    WebDriver driver = null;
    loginPage_Factory login;
    HomePage_Factory home;
    @Given("browser is open")
    public void browser_is_open(){
        System.out.println("holas");
        System.setProperty("webdriver.chrome.driver","C:/Users/aleja/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Given("user is in login page")
    public void user_is_in_login_page() {
        System.out.println("firstttt");
        driver.navigate().to("https://example.testproject.io/web/");
        // Write code here that turns the phrase above into concrete actions
        System.out.println("1");
    }
    @When("^user enters (.*) and (.*)$")
    public void user_enters_user1_and_pass1(String username, String password) throws InterruptedException {
 //       driver.findElement(By.id("name")).sendKeys(username);
 //       driver.findElement(By.id("password")).sendKeys(password);
        login = new loginPage_Factory(driver);
        login.enterUsername(username);
        login.enterPassword(password);
  //      Thread.sleep(2000);
        System.out.println("2");
    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        login.clickOnLogin();
        System.out.println("3");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        home = new HomePage_Factory(driver);
        home.checkgreetingsIsDisplayed();
        driver.close();
        driver.quit();

    }

}
