package pom;

import org.openqa.selenium.WebDriver;


import Hotel_locators.Hotel_Login;
import aravi.Base_Class;

public class PageObjManager extends Base_Class {
	 public PageObjManager(WebDriver xdriver) {
		this.driver=xdriver;
		
	}

	 private Hotel_Login Hotel_Login ;
	 
	 private Hotel_locators.Hotel_Search  Hotel_Search;

	public Hotel_Login getHotel_Login() {
		if (Hotel_Login==null) {
			Hotel_Login  = new Hotel_Login(driver);
		}
		return Hotel_Login;
	}

	public Hotel_locators.Hotel_Search getHotel_Search() {
		if (Hotel_Search==null) {
			Hotel_Search= new Hotel_locators.Hotel_Search(driver);
		}
		return Hotel_Search;
	}
	 
}
