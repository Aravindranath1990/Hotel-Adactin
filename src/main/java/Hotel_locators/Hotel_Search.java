package Hotel_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aravi.Base_Class;

public class Hotel_Search extends Base_Class {
public Hotel_Search(WebDriver xdriver) {
	this.driver=xdriver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//select[@id='location']")
public WebElement location;

@FindBy(id = "hotels")
public WebElement hotel;

@FindBy(id = "room_type")
public WebElement roomType;

@FindBy(id = "room_nos")
public WebElement roomNos;

@FindBy(id = "datepick_in")
public WebElement Indate;

@FindBy(id = "datepick_out")
public WebElement outdate;

@FindBy(id = "adult_room")
public WebElement adultroom;

@FindBy(id = "Submit")
public WebElement submit_btn;

@FindBy(id = "Reset")
public WebElement reset_btn;

@FindBy(id = "adult_room")
public WebElement adult_room;

@FindBy(xpath = "//span[@id='checkin_span']")
public WebElement error_msg;

@FindBy(id = "location_0" )
public WebElement Location_Equal;

public String elmtLocation = new StringBuilder().append("(//input[contains(@value,'").append("<REPLACEMENT>").
append("')])[1]").toString();
}
