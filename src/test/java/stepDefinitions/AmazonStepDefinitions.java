package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramakutusuElementi.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.aramaSonucuElementi.getText().contains("Nutella"));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramakutusuElementi.sendKeys("Java" + Keys.ENTER);

    }

    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.aramaSonucuElementi.getText().contains("Java"));

    }

    @And("kullanici iPhone icin arama yapar")
    public void kullaniciIPhoneIcinAramaYapar() {
        amazonPage.aramakutusuElementi.sendKeys("iPhone" + Keys.ENTER);

    }

    @Then("sonuclarin iPhone icerdigini test eder")
    public void sonuclarinIPhoneIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.aramaSonucuElementi.getText().contains("iPhone"));

    }

    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenKelime) {
        amazonPage.aramakutusuElementi.sendKeys(istenenKelime + Keys.ENTER);

    }

    @Given("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String istenenKelime) {
        Assert.assertTrue(amazonPage.aramaSonucuElementi.getText().contains(istenenKelime));

    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {

        try {
            Thread.sleep((long) istenenSaniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
