package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\harsh\\IdeaProjects\\CucumberBddFramework\\src\\test\\java\\Features\\Register.feature",
//        features = "C:\\Users\\harsh\\IdeaProjects\\CucumberBddFramework\\src\\test\\java\\Features\\Login.feature",
        //feature = ".", tags = {"@Login", "@Smoke"}, // and // Both
        //feature = ".", tags= {"@Login, @Regression"}, //Or
//        features = ".", tags = {"~@Login"},//Ignore tags
        glue = {"StepDefinition"},
        format = { "pretty", "html:htmlReport","json:json/cucumber.json","junit:junit/cucumber.xml"},//
        dryRun = false // to check mapping proper between feature file and step definition
        //monochrome = false, //display the output on proper manner or readable format of console output
        //strict = true // it will chcek if any step is not define in step definitions file
)

public class TestRunner {
}
