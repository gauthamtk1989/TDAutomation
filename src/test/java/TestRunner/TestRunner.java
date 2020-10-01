package TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:\\Users\\91900\\Desktop\\CucumberWorkspace\\TethDesi\\src\\test\\java\\features",
	glue="StepDefinition")


public class TestRunner {

}
