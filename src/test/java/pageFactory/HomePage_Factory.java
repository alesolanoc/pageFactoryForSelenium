package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Factory {
    @FindBy(id="jumbo")
    WebElement greetings;
    WebDriver driver;
    public HomePage_Factory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void checkgreetingsIsDisplayed(){
        greetings.isDisplayed();
    }
}
