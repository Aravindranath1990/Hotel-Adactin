package StepDefination;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import aravi.Base_Class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom.PageObjManager;


public class Steps extends Base_Class {
	 PageObjManager obj = new PageObjManager(driver);
	
	@Given("user Launch the {string} Browser")
	public void user_launch_the_browser(String string) {
	    Browser_Launch(string);
	}
	@Given("Naviagate to the url {string}")
	public void naviagate_to_the_url(String string) {
	    geturl(string);
	}
	@Then("user verify The Login Page")
	public void user_verify_the_login_page() {
	    elementIsDisplayed(obj.getHotel_Login().logo);
	}
	@Then("user enters the Username {string}")
	public void user_enters_the_username(String string) {
	    elementSendKeys(obj.getHotel_Login().user_name, string);
	}
	@Then("user enters the Password {string}")
	public void user_enters_the_password(String string) {
	    elementSendKeys(obj.getHotel_Login().pass_word, string);
	}
	@Then("user click the Login Button")
	public void user_click_the_login_button() {
	   elementClick(obj.getHotel_Login().login_btn);
	}
	@Then("User Select the Location")
	public void user_select_the_location() {
	    elementSelect("index", obj.getHotel_Search().location, "1");
	}
	@Then("User Select the Hotel Type")
	public void user_select_the_hotel_type() {
	    elementSelect("value", obj.getHotel_Search().hotel, "Hotel Creek");
	}
	@Then("User Select The Room Type")
	public void user_select_the_room_type() {
	    elementSelect("text", obj.getHotel_Search().roomType, "Standard");
	}
	@Then("User Select The No of Rooms")
	public void user_select_the_no_of_rooms() {
	    elementSelect("text", obj.getHotel_Search().roomNos, "1 - One");
	}
	@Then("User Select the Check In Date")
	public void user_select_the_check_in_date() {
	    elementSendKeys(obj.getHotel_Search().Indate, "24/03/2023");
	}
	@Then("User Select the Check Out Date")
	public void user_select_the_check_out_date() {
	   elementSendKeys(obj.getHotel_Search().outdate, "22/03/2023");
	}
	@Then("User Select the Adult Room")
	public void user_select_the_adult_room() {
	   elementSelect("text",obj.getHotel_Search().adult_room, "1 - One");
	}
	
	@Then("User Click on The Submit Button")
	public void user_click_on_the_submit_button() {
	   elementClick(obj.getHotel_Search().submit_btn);
	}
	@SuppressWarnings("deprecation")
	@Then("User Verfy the Error Message")
	public void user_verfy_the_error_message() {
	  Assert.assertTrue(elementIsDisplayed(obj.getHotel_Search().error_msg));
	}
	
	@Then("user Select the  In Date")
	public void user_select_the_in_date() {
	    elementSendKeys(obj.getHotel_Search().Indate, "17/03/2023");
	}
	@Then("user Select the  Out Date")
	public void user_select_the_out_date() {
	    elementSendKeys(obj.getHotel_Search().outdate, "19/03/2023");
	}
	@Then("user Select the  Room Adult")
	public void user_select_the_room_adult() {
	   elementSelect("value", obj.getHotel_Search().adult_room, "1");
	  
	   }
	
	@Then("User Verfy the Date Error Message")
	public void user_verfy_the_date_error_message() {
	   Assert.assertTrue(elementIsDisplayed(obj.getHotel_Search().error_msg));
	}
	
	@Then("User Veryfy the Location {string} is Displayed in Select Hotel and Search Hotel Are Same")
	public void user_veryfy_the_location_is_displayed_in_select_hotel_and_search_hotel_are_same(String string) {
	  
	Assert.assertEquals(string, getAttribute(obj.getHotel_Search().Location_Equal, "value"));	
		
	}

	
	
	}



