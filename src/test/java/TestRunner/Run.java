package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\aravi\\Hotel",glue = {"StepDefination","Hooks"},dryRun = false,
stepNotifications=true,plugin= {"html:target\\Report\\Hotel.html","json:target\\Report\\hotel.json"},tags = "@TC-05")

public class Run {

}
