import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pageObjects.AbstractDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
tags={"@Egor"})
public abstract class RunnerTest extends AbstractDriver {

}