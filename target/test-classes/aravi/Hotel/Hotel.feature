Feature: Smoke Testcase to check the Build Stability


@TC-01
Scenario: User Verify the Hotel Login Function

Given user Launch the "edge" Browser
And Naviagate to the url "https://adactinhotelapp.com"
Then user verify The Login Page
And user enters the Username "Aravind1990"
And user enters the Password "Amma123$"
Then user click the Login Button
And User Select the Location "Sydney"
And User Select the Hotel Type "Hotel Creek"
And User Select The Room Type "Standard"
And User Select The No of Rooms "1 - One"
Then User Select the Check In Date "06/04/2023"
And User Select the Check Out Date "04/04/2023"
And User Select the Adult Room "1"
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
And User Select the Location "Sydney"
And User Select the Hotel Type "Hotel Creek"
And User Select The Room Type "Standard"
And User Select The No of Rooms "1 - One"
Then User Select the Check In Date "06/04/2023"
And User Select the Check Out Date "04/04/2023"
And User Select the Adult Room "1"
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
And User Select the Location "Sydney"
And User Select the Hotel Type "Hotel Creek"
And User Select The Room Type "Standard"
And User Select The No of Rooms "1 - One"
Then User Select the Check In Date "06/04/2023"
And User Select the Check Out Date "04/04/2023"
And User Select the Adult Room "1"
Then User Click on The Submit Button
Then User Veryfy the Location "Sydney" is Displayed in Select Hotel and Search Hotel Are Same



@TC-04
Scenario: User Verify The No of Room Selected in Select Hotel Page Is Displayed in the Seach Hotel Page
 Given user Launch the "edge" Browser
And Naviagate to the url "https://adactinhotelapp.com"
Then user verify The Login Page
And user enters the Username "Aravind1990"
And user enters the Password "Amma123$"
Then user click the Login Button
And User Select the Location "Sydney"
And User Select the Hotel Type "Hotel Creek"
And User Select The Room Type "Standard"
And User Select The No of Rooms "1 - One"
Then User Select the Check In Date "31/03/2023"
And User Select the Check Out Date "01/04/2023"
And User Select the Adult Room "1"
Then User Click on The Submit Button
Then User verify the Inn date displayed in search hotel is same as entered "31/03/2023"  

@TC-05
Scenario: To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page
Given user Launch the "edge" Browser
And Naviagate to the url "https://adactinhotelapp.com"
Then user verify The Login Page
And user enters the Username "Aravind1990"
And user enters the Password "Amma123$"
Then user click the Login Button
And User Select the Location "Sydney"
And User Select the Hotel Type "Hotel Creek"
And User Select The Room Type "Deluxe"
And User Select The No of Rooms "1 - One"
Then User Select the Check In Date "30/03/2023"
And User Select the Check Out Date "31/03/2023"
And User Select the Adult Room "1"
Then User Click on The Submit Button
Then User Verify The Room Type Displayed should be same as selected in Search Hotel page "Deluxe"

















