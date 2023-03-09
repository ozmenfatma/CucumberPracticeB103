package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BleuRentalPage {
    public BleuRentalPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement loginGiris;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public static WebElement dogrula;


    @FindBy(xpath = "//div[@role='alert']")
    public WebElement hatamesaji;

}



