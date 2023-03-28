package StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import aravi.Base_Class;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends Base_Class{
	@After
	private void afterHooks(Scenario scenario) {
	TakesScreenshot	ts = (TakesScreenshot)driver;
	byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshotAs, "image/png", "");

	}

}
