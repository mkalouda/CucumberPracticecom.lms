package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
    @FindBy(id = "user_email")
    public WebElement username;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(xpath = "//button[contains(@class,'login')]")
    public WebElement loginInBtn;

    @FindBy(xpath = "//a[@class='logo']/img")
    public WebElement logo;

    @FindBy(className = "description")
    public WebElement loginText;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
}
