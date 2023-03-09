package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DqaPage;
import utilities.Driver;

import java.time.Duration;

public class DqaStepDefinition {
    DqaPage dqaPage = new DqaPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @Then("kullanici alerte tiklar")
    public void kullaniciAlerteTiklar() {

        dqaPage.alert.click();
    }
    @And("kullanici on button click alert will appear after bes seconds karsisindaki click me butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasar() {

        dqaPage.onButtonClick.click();
    }
    @And("kullanici alertin gorunur olmasini bekler")
    public void kullaniciAlertinGorunurOlmasiniBekler() {
        wait.until(ExpectedConditions.alertIsPresent());
    }
    @And("kullanici alert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void kullaniciAlertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEder() {
        String alertYazisi=Driver.getDriver().switchTo().alert().getText();
        String beklenenYazi="This alert appeared after 5 seconds";
        Assert.assertEquals(alertYazisi,beklenenYazi);
    }
    @And("kullanici ok diyerek alerti kapatir")
    public void kullaniciOkDiyerekAlertiKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @When("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSayi) throws InterruptedException {
        Thread.sleep(istenenSayi*1000);
    }



}
