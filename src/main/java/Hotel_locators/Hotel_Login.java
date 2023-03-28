package Hotel_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aravi.Base_Class;

public class Hotel_Login extends Base_Class {
	public Hotel_Login(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver,this);
	}
@FindBy(id="username")	
public WebElement user_name;

@FindBy(id="password")
public WebElement pass_word;

@FindBy(xpath="//input[@id='login']")
public WebElement login_btn;
@FindBy(xpath="//img[@class='logo']")
public WebElement logo;
}
