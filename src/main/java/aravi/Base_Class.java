package aravi;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	
	
	public static void Browser_Launch(String browser) {
		try {
			if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Hotel\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
		} catch (Exception e) {
			System.out.println("Unabe to Launch the Browser"+e.getMessage());
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public static  void geturl(String url) {
		
try {
	driver.get(url);
} catch (Exception e) {
	System.out.println("unabe to load the url"+e.getMessage());
}
	}
	
	public static boolean elementIsDisplayed(WebElement element) {
		boolean display = false;
		try {
			display=element.isDisplayed();
		} catch (Exception e) {
		System.out.println("element not visible"+e.getMessage());
		}
		return display;

	}
	
	public static  boolean elementIsEnable(WebElement element) {
		boolean enable = false;
		try {
			enable=element.isEnabled();
		} catch (Exception e) {
			System.out.println("element not found"+e.getMessage());
		}
return enable;
	}
	
	public static void elementClear(WebElement element) {
		
try {
	element.clear();
} catch (Exception e) {
	System.out.println("element not found"+e.getMessage());
}
	}
	
	public static  void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("unable to click"+e.getMessage());
		}

	}
	
	public static  void elementSendKeys(WebElement element,String value) {
		try {
			
			if (elementIsDisplayed(element)&&elementIsEnable(element)) {
				element.clear();
				element.sendKeys(value);
			}
			
		} catch (Exception e) {
			System.out.println("unable to enter the value"+e.getMessage());
		}

	}
	public static  String getTitle() {
		String title = null;
		try {
			title=driver.getTitle();
		} catch (Exception e) {
			System.out.println("Title not found "+e.getMessage());
		}
		return title;
	}
	
	public static  String getText(WebElement element) {
		String text = null;
		try {
			text=element.getText();
		} catch (Exception e) {
			System.out.println("unable to fetch the text");
		}
		return text;

	}
	public static  void elementSelect(String option,WebElement element,String value) {
		Select sc = new Select(element);
try {
	if(option.equalsIgnoreCase("text")) {
		sc.selectByVisibleText(value);
	}else if(option.equalsIgnoreCase("value")) {
		sc.selectByValue(value);
	}else if(option.equalsIgnoreCase("index")) {
		sc.selectByIndex(Integer.parseInt(value));
	}
	
	
} catch (Exception e) {
	// TODO: handle exception
}
	}
	
public String getAttribute(WebElement element,String v) {
	String value = null;
	try {
		
		value = element.getAttribute(v);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
return value;
}
 
	 
 }


