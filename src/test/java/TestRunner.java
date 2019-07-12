import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // JUnit
@CucumberOptions(         // Cucumber-Junit
        features = "src\\test\\resource\\features",
        glue = {"steps"}
)
public class TestRunner {
}
