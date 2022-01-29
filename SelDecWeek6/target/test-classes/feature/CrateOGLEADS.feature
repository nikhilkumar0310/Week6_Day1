Feature: This is the orignal one for creting the Leads

Scenario Outline: TC002_Now creating multiple Leads with the below mentioned Data

Given Click on the Leads Link
And Click on the Create Lead CTA
And Enter the Company name as <cName>
And Enter the first name as <firstName>
And Enter the last name as <lastName>
And Select Source from Drop Down
And Select Marketing from DropDown
And Enter first Name Local <FLocalName>
And Enter last Name Local <LLocalName>
And Enter personal title <Title>
And Enter Date of Birth <DOB>
And Enter Genaral Profile title <GPTitle>
And Enter Department Name as <Dept>
And Enter Annual Revenue as <Paisa>
And Select Inductry from DropDown
And Select Owner Ship from Drop Down
And Enter the Number of Employees <ManPower>
And And Enter the SIC Code <sic>
And Enter the Ticker Symbol <ticker>
And Enter lead form Description as <formDescription>
And Enter the important Note as <note>
And Clear the country Code
And Enter the Country Code <cc> 
And Enter the Area Code <AC>
And Enter Phone Number <PhoneNumber>
And Enter Ask for Name <askName>
And Enter Phone Extension as <extension>
And Enter primaray Email as <email>
And Enter Web URL as <urlweb>
And Enter genaral to name <Gname>
And Enter attendent name <attName>
And Enter first address <add1>
And Enter second address <add2>
And Enter city name as <city>
And Select the Prvince from Drop Down
And Enter general postal code <gPostal>
And Enter the Extension Code <extensionCode>
When Press Submit Button and create Lead
Then Verify the Title

Examples:
|cName|firstName|lastName|FLocalName|LLocalName|Title|DOB|GPTitle|Dept|Paisa|ManPower|sic|ticker|formDescription|note|cc|AC|PhoneNumber|askName|extension|email|urlweb|Gname|attName|add1|add2|city|gPostal|extensionCode|
|'EA Sports'|'Nikhil'|'Kumar'|'Aarya'|'Sareen'|'Welcome'|'10/08/1987'|'FIFA 2025'|'Gaming R&D'|'180,000'|'840'|'5713'|'Electronic Arts Inc.'|'Gaming and Merchandise'|'Electronic Arts Inc. is a digital interactive entertainment company.'|'91'|'123'|'456789'|'Theo'|'100111'|'test@gmail.com'|'https://www.ea.com/sports'|'Nicolas Timber'|'Nick'|'Redwood City, California, United States'|'Rheinauhafen, Cologne, North Rhine-Westphalia, Germany.'|'Redwood'|'12875'|'42'|