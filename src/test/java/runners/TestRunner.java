package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@wip",
        dryRun = false
)
public class TestRunner {
    /*
    bir frameworkde bir tek Runner classi yeterli olabilir
    Runner classinda class bodysinde hicbir sey olmaz

    runner classimizi önemli yapan 2 notasyon vardir

    @RunWith(Cucumber.class) : notasyonu Runner classinda calisma ozalligi katar
    Bu notasyon oldugu icin Cucumber frameworkumuz için junit kullanmayi tercih ediyoruz

    features : Runner dosyasinin features dosyalarini nerden bulacagini tarif eder
    glue : stepDefinition dosyalarini nerede bulacagini gösterir
    tags : o an hangi tagi calistirmak istiyorsak onu belli eder

    dryRun : iki secenek var
        dryRun = true       dersek testimizi calistirmadan eksik adimlari bize verir
        dryRun = false      dersek

     */

}
