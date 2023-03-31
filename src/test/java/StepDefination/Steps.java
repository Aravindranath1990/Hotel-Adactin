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
	@Then("User Select the Location {string}")
	public void user_select_the_location(String string) {
	    elementSelect("text", obj.getHotel_Search().location, string);
	}
	@Then("User Select the Hotel Type {string}")
	public void user_select_the_hotel_type(String string) {
	    elementSelect("value", obj.getHotel_Search().hotel, string);
	}
	@Then("User Select The Room Type {string}")
	public void user_select_the_room_type(String string) {
	    elementSelect("text", obj.getHotel_Search().roomType, string);
	}
	@Then("User Select The No of Rooms {string}")
	public void user_select_the_no_of_rooms(String string) {
	    elementSelect("text", obj.getHotel_Search().roomNos, string);
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
	
	@Then("User Select the Check In Date {string}")
	public void user_select_the_check_in_date(String string) {
	    elementSendKeys(obj.getHotel_Search().Indate, string);
	}
	@Then("User Select the Check Out Date {string}")
	public void user_select_the_check_out_date(String string) {
	    elementSendKeys(obj.getHotel_Search().outdate, string);
	}
	@Then("User Select the Adult Room {string}")
	public void user_select_the_adult_room(String string) {
	   elementSelect("value", obj.getHotel_Search().adult_room, string);
	  
	   }
	
	@Then("User Verfy the Date Error Message")
	public void user_verfy_the_date_error_message() {
	   Assert.assertTrue(elementIsDisplayed(obj.getHotel_Search().error_msg));
	}
	
	@Then("User Veryfy the Location {string} is Displayed in Select Hotel and Search Hotel Are Same")
	public void user_veryfy_the_location_is_displayed_in_select_hotel_and_search_hotel_are_same(String string) {
	  
	Assert.assertEquals(string, getAttribute(obj.getHotel_Search().Location_Equal, "value"));	
		
	}
	@Then("User verify the Inn date displayed in search hotel is same as entered {string}")
	public void user_verify_the_inn_date_displayed_in_search_hotel_is_same_as_entered(String string) {
	   Assert.assertEquals(string, getAttribute(obj.getHotel_Search().Inndate, "value"));
	}
	@Then("User Verify The Room Type Displayed should be same as selected in Search Hotel page {string}")
	public void user_verify_the_room_type_displayed_should_be_same_as_selected_in_search_hotel_page(String string) {
	    Assert.assertEquals(string,getAttribute(obj.getHotel_Search().RoomTypeEq, "value"));
	}

	
	
	
	
	
	}



