package cucumber.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage extends BasePage {
    public LoginPage(){
        this.driver = new FirefoxDriver();
        this.driver.get("https://the-internet.herokuapp.com/login");
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)).pageLoadTimeout(Duration.ofSeconds(10));
    }
    public void enterUsername(String id, String username){
        driver.findElement(By.id(id)).sendKeys(username.isEmpty() ? "" : username);
    }
    public void enterPassword(String id, String password){
        driver.findElement(By.id(id)).sendKeys(password.isEmpty() ? "" : password);
    }
    public void clickLogin(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void clickLogout(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public boolean verifyAlertMessage(String text){
       return driver.getPageSource().contains(text);
    } 
}
