
Feature: To validate AdactinHotel Bookinng Functionality

 @sanity @regression
  Scenario Outline: To Login in Adaction
    Given User is in AdactinHotel Booking page
    When User enter valid "<username>" and "<password>" and user navigate to SearchHotel page
    And User choose to "<Location>","<HotelName>","<Roomtype>","<Numberofrooms>","<Checkindate>","<Checkoutdate>","<Adults>","<Children>"
    And User click Search button and User go to Select Hotel page
    And User chooses a Hotel in the list and click Continue button and User should be in payment page
    And User Enter into "<FirstName>","<LastName>" and "<BillingAddress>","<CreditcardNum>","<Creditcardtype>","<ExpiryMonth>","<ExpiryYear>" and "<CVVNum>"
    And User click Book Now button and user get the Booked Room details
    Then User gets the order id

    Examples: 
      | username  | password  | Location | HotelName   | Roomtype     | Numberofrooms | Checkindate | Checkoutdate | Adults | Children | FirstName | LastName | BillingAddress | CreditcardNum    | Creditcardtype | ExpiryMonth | ExpiryYear | CVVNum |
      | Nirmala05 | Nirmala05 | London   | Hotel Creek | Super Deluxe |             1 | 12-04-2021  | 14-04-2021   | 1-1    |        1 | Nirmala   | Gopinath | No33,gandhi st | 1234567890121314 | Master         | March       |       2022 |    123 |
