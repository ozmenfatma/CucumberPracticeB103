package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class DqaPage {
    public DqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[text()='Alerts']")
    public WebElement alert;
    @FindBy (xpath = "//*[@id='timerAlertButton']")
    public WebElement onButtonClick;

}
