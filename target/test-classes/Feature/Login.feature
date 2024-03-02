Feature: Login feature validation

Background:
Given user should be on login page

@valid
Scenario: Valid login
When user enters valid user-id and password
And click on login button
Then user should be navigated to Home Page
#And logout link should be appear on home page
And user clicks on logout button
Then user tear down

@invalid
Scenario: invalid login
When user enters invalid user-id and password
And click on login button
Then user should get error message
Then user tear down


#Scenario Outline: multiple invalid login_<TCName>
#When user user enters invalid userid as "<username>" and invalid password as "<password>"
#And click on login button
#Then user can see the error message
#Examples:
#|TCName|username | password|
#|TC01|admin| admin|
#|TC02|Narendra| Modi|
#|TC03|Rahul| Gandhi|