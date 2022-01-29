Feature: Create Contacts for the Leaf Taps Application

Scenario Outline: TC001_TestLead created succesfully

Given Enter First Name as <fName>
And Enter Last Name as <lName>
And Enter First Local Name as <localfName>
And Enter Last Local Name as <localLname>
And Enter Department as <dept>
And Enter Description as <descrip>
And Enter Email Id as <mail>
When Press Submit Button
Then Verify the new Lead Created

Examples:
|fName|lName|localfName|localLname|dept|descrip|mail|
|'Sangram'|'Zorawar'|'Tez'|'Sareen'|'Pharamcuticals'|'Making Sedatives for pain'|'aaraya@gmail.com'|
|'Jawahar'|'Bishnoi'|'Maya'|'Bishnoi'|'Druggist'|'Dealing in Transportation of Medicines across borderlands'|'maya@gmail.com'|