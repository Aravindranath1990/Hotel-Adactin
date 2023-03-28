Feature: Smoke Testcase to check the Build Stability


@TC-01
Scenario: User Verify the Hotel Login Function

Given user Launch the "edge" Browser
And Naviagate to the url "https://adactinhotelapp.com"
Then user verify The Login Page
And user enters the Username "Aravind1990"
And user enters the Password "Amma123$"
Then user click the Login Button
And User Select the Location 
And User Select the Hotel Type
And User Select The Room Type 
And User Select The No of Rooms
And User Select The No of Rooms
Then User Select the Check In Date 
And User Select the Check Out Date
And User Select the Adult Room
Then User Click on The Submit Button
And User Verfy the Error Message


@TC-02
Scenario: User verify the Error msg
Given user Launch the "edge" Browser
And Naviagate to the url "https://adactinhotelapp.com"
Then user verify The Login Page
And user enters the Username "Aravind1990"
And user enters the Password "Amma123$"
Then user click the Login Button
And User Select the Location 
And User Select the Hotel Type
And User Select The Room Type 
And User Select The No of Rooms
And user Select the  In Date
And user Select the  Out Date
And user Select the  Room Adult
Then User Click on The Submit Button
And User Verfy the Date Error Message

@TC-03
Scenario: User Verify The Location Displayed in Select Hotel And Search Hotel are same 
Given user Launch the "edge" Browser
And Naviagate to the url "https://adactinhotelapp.com"
Then user verify The Login Page
And user enters the Username "Aravind1990"
And user enters the Password "Amma123$"
Then user click the Login Button
And User Select the Location 
And User Select the Hotel Type
And User Select The Room Type 
And User Select The No of Rooms
And user Select the  In Date
And user Select the  Out Date
And user Select the  Room Adult
Then User Click on The Submit Button
Then User Veryfy the Location "Sydney" is Displayed in Select Hotel and Search Hotel Are Same