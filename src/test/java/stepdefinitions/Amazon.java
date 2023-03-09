package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
public class Amazon {
    AmazonPage amazonPage;
    @Given("kullanici amazona gider")
    public void kullaniciAmazonaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("kullanici iphone için arama yapar")
    public void kullaniciIphoneIçinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }
    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
    @Then("sayfa basliginin iphone icerdigini test eder")
    public void sayfaBasligininIphoneIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
    }
    @When("kullanici selenium için arama yapar")
    public void kullaniciSeleniumIçinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("selenium", Keys.ENTER);
    }
    @Then("sayfa basliginin selenium icerdigini test eder")
    public void sayfaBasligininSeleniumIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));
    }
    @When("kullanici java için arama yapar")
    public void kullaniciJavaIçinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("java", Keys.ENTER);
    }
    @Then("sayfa basliginin java icerdigini test eder")
    public void sayfaBasligininJavaIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("java"));
    }
}
