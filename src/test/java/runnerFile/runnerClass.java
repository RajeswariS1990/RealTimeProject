package runnerFile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utilities.baseClass;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFolder/sample.feature", glue = {"stepDefenition","hooks"},
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)

public class runnerClass extends baseClass {

}
