package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BleuRentalPage;
import utilities.Driver;

public class BlueRentalStepDefinitions {

//    USER STORY : US167854_manager_login_test
//    NAME:kullanici tum manager login bilgileriyle giriş yapabilmeli
//    AC:
//    Given kullanici ana sayfada
//    When kullanici login sayfasina gider
//    And kullanıcı adini girer->>>>>parametre
//    And sifreyi girer->>>>>parametre
//    And login buttoning basar
//    Then login islemi gerçekleşir
//    ARTIFACT:
//    url : https://www.bluerentalcars.com/
//    Credentials:
//    {"sam.walker@bluerentalcars.com","c!fas_art"},
//    {"kate.brown@bluerentalcars.com","tad1$Fas"},
//    {"raj.khan@bluerentalcars.com","v7Hg_va^"},
//    {“pam.raymond@bluerentalcars.com”,"Nga^g6!"}
//    NOT: scenario outline kullanalim

BleuRentalPage bleuRentalPage=new BleuRentalPage();

    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici logingiris butonuna tiklar")
    public void kullanici_logingiris_butonuna_tiklar() {
     bleuRentalPage.loginGiris.click();

    }
    @When("kullanici first name {string} girer")
    public void kullanici_first_name_girer(String string) {
         bleuRentalPage.email.sendKeys(string);
    }
    @When("kullanici last name {string} girer")
    public void kullanici_last_name_girer(String string) {
        bleuRentalPage.password.sendKeys(string);

    }
    @When("kullanici login buttonuna basar")
    public void kullanici_login_buttonuna_basar() {

     bleuRentalPage.loginButton.click();
     Driver.wait(2);

    }

    @When("kullanici ekranda yazdigini dogrular")
    public void kullanici_ekranda_yazdigini_dogrular() {
       Assert.assertTrue(BleuRentalPage.dogrula.isDisplayed());
    }

    @When("kullanici hata mesaji aldigini dogrular")
    public void kullanici_hata_mesaji_aldigini_dogrular() {

           Assert.assertTrue(bleuRentalPage.hatamesaji.isDisplayed());
    }


    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();

    }




}
