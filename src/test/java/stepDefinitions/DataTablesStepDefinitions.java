package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;

public class DataTablesStepDefinitions {
    DataTablePage dataTablePage = new DataTablePage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablePage.newButonu.click();
    }

    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstname) {
        dataTablePage.firstNameKutusu.sendKeys(firstname);
    }

    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastname) {
        dataTablePage.lastNameKutusu.sendKeys(lastname);
    }

    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        dataTablePage.positionKutusu.sendKeys(position);
    }

    @Then("ofis bolumune {string} yazar")
    public void ofis_bolumune_yazar(String office) {
        dataTablePage.officeKutusu.sendKeys(office);
    }

    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
        dataTablePage.extentionKutusu.sendKeys(extension);
    }

    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
        dataTablePage.startDate.sendKeys(startDate);
    }

    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
        dataTablePage.salaryKutusu.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablePage.create.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String aranacakIsim) {
        dataTablePage.search.sendKeys(aranacakIsim);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String arananIsim) {
        Assert.assertTrue(dataTablePage.aramaSonucuIlkElement.getText().contains(arananIsim));
    }
}
