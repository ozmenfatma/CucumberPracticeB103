package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage;
    @Given("amazon sayfasina gidilir")
    public void amazonSayfasinaGidilir() {
        Driver.getDriver().get("https://amazon.com");
    }

    @Then("amazon sayfasinda selenium aratilir")
    public void amazonSayfasindaSeleniumAratilir() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Selenium", Keys.ENTER);

    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }
}
