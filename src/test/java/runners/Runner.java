package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //test çalıştırıcı notasyonu
@CucumberOptions(  // Seneryoların nerede ve nasıl çalışacağı,hangi raporu kullanılmasıyla alakalı seçenekleri ayarlar
        plugin = {"html:src/test/resources/reports/gp2.html"},
        features = "./src/test/resources/features", // features'ın yolunu belirmemiz gerekir
        glue = "stepdefinitions",// Kodlarımızı yazdığımız yeri belirtiriz
        tags = "@gp2", //Çalıştırmak istediğimiz seneryoya verdiğimiz tag'i belirtiriz
        dryRun =false // Seneryonun adımlarını kontrol eder ve çalıştığını görürüz
)



public class Runner {
}
