package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/addweb/IdeaProjects/TT-Clockin/src/test/java/Feature",
        glue = "steps",
        plugin = {"pretty"}
)

public class TestRunner {
}
