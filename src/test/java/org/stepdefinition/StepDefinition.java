package org.stepdefinition;

import java.io.IOException;
import java.util.Map;

import org.repository.AdactinBookingHotel;
import org.repository.AdactinOrderNumber;
import org.repository.AdactinPojoClassLogin;
import org.repository.AdactinRadioButton;
import org.repository.AdactinSearchRoom;
import org.utilities.BaseClassAdactin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClassAdactin{
	
	 public AdactinPojoClassLogin p1;
	 public AdactinSearchRoom p2;
	 public AdactinRadioButton p3;
	 public AdactinBookingHotel p4;
	 public AdactinOrderNumber p5;
	 
	
	@Given("User is in AdactinHotel Booking page")
	public void user_is_in_AdactinHotel_Booking_page() {
		
		LaunchUrl("https://adactinhotelapp.com/");
	    
	}

	@When("User enter valid {string} and {string} and user navigate to SearchHotel page")
	public void user_enter_valid_and_and_user_navigate_to_SearchHotel_page(String username, String password) {
	    
		p1=new AdactinPojoClassLogin();
		fillTextbox(p1.getTxtUser(), username);
		fillTextbox(p1.getTxtPass(), password);
		btnClick(p1.getBtnLogin());
		
	}

	@When("User choose to {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_choose_to(String Location, String HotelName, String Roomtype, String Numberofrooms, String Checkindate, String Checkoutdate, String Adluts, String Children) throws IOException {
	     p2=new AdactinSearchRoom();
//	     fillTextbox(p2.getLocation(), Location );
//	     fillTextbox(p2.getHotels(), HotelName);
//	     fillTextbox(p2.getRoomType(), Roomtype);
//	     fillTextbox(p2.getNumberOfRooms(), Numberofrooms); 
//	     fillTextbox(p2.getCheckInDate(), Checkindate);
//	     fillTextbox(p2.getCheckOutDate(), Checkoutdate);
//	     fillTextbox(p2.getAdultsPerRoom(), Adluts);
//	     fillTextbox(p2.getChildrenPerRoom(), Children);
	     
	     Map<String, String> e = excelRead("Hotel Creek");
	     fillTextbox(p2.getLocation(), e.get("Location") );
	     fillTextbox(p2.getHotels(), e.get("HotelName"));
	     fillTextbox(p2.getRoomType(), e.get("RoomType"));
	     fillTextbox(p2.getNumberOfRooms(), e.get("RoomNo")); 
	     fillTextbox(p2.getCheckInDate(), e.get("Checkindate"));
	     fillTextbox(p2.getCheckOutDate(), e.get("Checkoutdate"));
	     fillTextbox(p2.getAdultsPerRoom(), e.get("Numberofadults"));
	     fillTextbox(p2.getChildrenPerRoom(), e.get("Numberofchildren"));
	     

		
	}

	@When("User click Search button and User go to Select Hotel page")
	public void user_click_Search_button_and_User_go_to_Select_Hotel_page() throws InterruptedException {
	   
		btnClick(p2.getBtnSearch());
		Thread.sleep(3000);
	}

	@When("User chooses a Hotel in the list and click Continue button and User should be in payment page")
	public void user_chooses_a_Hotel_in_the_list_and_click_Continue_button_and_User_should_be_in_payment_page() throws InterruptedException {
	    p3=new AdactinRadioButton();
	    btnClick(p3.getRadioBtnSelectHotel());
	    btnClick(p3.getBtnContinue());
	    Thread.sleep(3000);
		
	}

	@When("User Enter into {string},{string} and {string},{string},{string},{string},{string} and {string}")
	public void user_Enter_into_and_and(String FirstName, String LastName, String BillingAddress, String CreditcardNumber, String Creditcardtype, String ExpiryMonth, String ExpiryYear, String CVVNum) {
	   p4=new AdactinBookingHotel();
	   fillTextbox(p4.getFirstName(), FirstName);
	   fillTextbox(p4.getLastName(), LastName);
	   fillTextbox(p4.getAddress(), BillingAddress);
	   fillTextbox(p4.getCreditCardNumber(), CreditcardNumber);
	   fillTextbox(p4.getCreditCardType(), Creditcardtype);
	   fillTextbox(p4.getExpiryDateMonth(), ExpiryMonth);
	   fillTextbox(p4.getExpiryDateYear(), ExpiryYear);
	   fillTextbox(p4.getCVVNumber(), CVVNum);
	   
		
	}

	@When("User click Book Now button and user get the Booked Room details")
	public void user_click_Book_Now_button_and_user_get_the_Booked_Room_details() throws InterruptedException {
	    btnClick(p4.getBookNowBtn());
	    Thread.sleep(5000);
	}

	@Then("User gets the order id")
	public void user_gets_the_order_id() {
		p5=new AdactinOrderNumber();
		Attribute(p5.getOrderNo());
	    
		
	}



}
