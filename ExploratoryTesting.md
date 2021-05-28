Scenario or Functionality Explored
----------------------------------

Base Scenario 
-------------
- Explored Booking scenario on the given website which starts as the user selects Book Now button.
- The prerequisite is we should have the data like Room price, Check In and Check out dates to verify it on Booking page and then on invoice page.
- Verified Notes/Additional Requests data is stored properly
- After clicking Confirm booking button user is redirected to Payments page.

- On Payment Page Booking unpaid message should be displayed
- Summary on Payment page should be correct
- On Payment page Company address is displayed
- Notes/Additional Request posted on booking page are correctly displayed and not editable On Payment Page
- Users Details displayed correctly on payment page

First Scenario
--------------

- After clicking Pay Now button, Payment Method select dropdown is displayed
- Check all payment methods one by one. 


Second Scenario
---------------

-- After selecting the Pay on arrival button > Confirmation popup should appear with the message "Are you sure you want to pay at arrival?" with Cancel and OK button
 - After selecting OK button a Warning message is displayed - #### Your booking status is Reserved--- You must confirm your booking otherwise it will be cancelled, please contact us for further information.
 - Correct Booking Details and Summary is displayed

Things to be improved or seems like a bug
-----------------------------------------

- After selecting any option from Pay by dropdown and selecting again Select payment method option a loader appears indefinitely
- While Selecting Credit Card or Stripe Credit Card option from Pay by dropdown, Card details page appears where there is no validation 
for First Name, Last Name, Card Number and CVV
- In Bank transfer option Bank details are displayed which is not a correct functionality because after transferring the money the user has only option to select Pay On Arrival to reserve the room and then call for payment confirmation which is not correct solution
- After selecting any option PayStack Credit card option from Pay by dropdown loader appears indefinitely
- After failed payment the page is redirected back to payments page without any message

Area to be explored First
-------------------------

- I will explore Payments page, Pay by dropdown options first because if user payment fails or if the user money gets stuck 
it will reduce trust of the customer on the website. So the payment functionality while booking the hotel should work correctly 
and user should be charged correctly. IF the payment fails user should be notified accordingly.

Risk to be mitigated
--------------------
- Room should be locked for the user once he proceeds for booking till his session expires.
- The website should be secured and should run on HTTPS protocol, it is running on HTTP








