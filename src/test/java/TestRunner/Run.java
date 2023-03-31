package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\aravi\\Hotel",glue ="StepDefination",dryRun = false,
stepNotifications=true,plugin="html:target\\Report\\Hotel.html",tags = "@TC-05")

public class Run {

}
