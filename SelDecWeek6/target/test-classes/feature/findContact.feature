Feature: Find the Existing Contact in the system

Scenario Outline: TC_003 Trying to find the Contacts based on the Eamil

Given Click on the Contacts CTA to find the Contacts
And Click on the Find Contacts CTA
And Click on the Email search box
When Enter the email to be found as <emailFind>
Then Click on the Find Contacts CTA submit

Examples:
|emailFind|
|'test@gmail.com'|
