package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Cucumber'da step definitions packagei icerisinde
    @before @after gibi bir notasyon varsa
    extends Base dememize gerek kalmadan
    her scenario'dan once ve/veya sonra bu methodlar
    calisacaktır

    bu da bizim isteyecegimiz bir durum degildir

    cucumberda @before @after kullanma ihtiyacimiz olursa
    bunu step definitons package'i altında olusturacagimiz hook
    classina koyariz

    Biz her scenario'dan sonra test sonucunu kontrol edip failed olan
    scenario'lar için screenshoot olmasi amaciyla
    @After methodu kullanacağız

     */

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }
}
