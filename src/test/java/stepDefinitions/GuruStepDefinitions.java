package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage = new GuruPage();

    @Then("cookies sorulursa kabul et")
    public void cookiesSorulursaKabulEt() {
        // sorulmadi devam et
    }

    @And("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenSutun) {

        List<WebElement> tabloBaslikListesi = guruPage.baslikListesi;
        // listemiz web elementlerden olusuyor
        // dolayisiyla bu webelementlerden hnagisi
        // istenen sutun basligini iceriyor bilemeyiz

        int istenenbaslikIndexi = -1;

        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)) {
                istenenbaslikIndexi = i + 1;
                break;
            }
        }

        // for loop ile tüm sutun basliklarini bana verilen istenenSutun degeri ile karsilastiridm
        // loop bittiginde basligin bulunup bulunmadıgını kontrol etmek ve
        // bulundu ise yoluma devam etmek istiyorum

        if (istenenbaslikIndexi != -1) { // baslik bulundu

            List<WebElement> istenenSutundakiElementler =
                    Driver
                            .getDriver()
                            .findElements(By.xpath("//tbody//tr//td["+ istenenbaslikIndexi+"]"));

            istenenSutundakiElementler
                    .stream()
                    .map(WebElement::getText)
                    .forEach(System.out::println );


        } else { // baslik bulunmadi
            System.out.println("istenen baslik bulunmadi");
        }

    }
}
