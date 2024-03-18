# Test_Automation_2

Automated Testing using Selenium and Java

Project Overview

This repository contains an automated test suite developed in Java using the Selenium framework. 
The test suite is designed to simulate and validate various functionalities of an e-commerce website.


Oczywiście, oto poprawiony opis README po angielsku z uwzględnieniem Twoich uwag:

Automated Testing Using Maven, JUnit, Selenium, and Java
Project Overview
This repository contains an automated test suite developed in Java using the Selenium framework, along with supporting tools like Maven and JUnit. The test suite is designed to simulate and validate various functionalities of an e-commerce website.

Prerequisites
To run the automated tests locally, ensure you have the following prerequisites installed:

Java Development Kit (JDK)
Maven
Selenium WebDriver
JUnit
IntelliJ IDEA (optional but recommended for development)
Getting Started
Follow these steps to execute the automated tests:

Clone the repository to your local machine:

bash
Copy code
git clone <repository_URL>
Open the project in IntelliJ IDEA or your preferred integrated development environment.

Ensure Maven is installed and configured on your system.

Navigate to the project directory in your terminal or command prompt.

Execute the tests using Maven:

The automated test suite performs the following actions on the targeted web application:

Login to the user account.
Select the Hummingbird Printed Sweater for purchase.
Choose size M.
Add 5 items to the cart as specified by the test parameter.
Proceed to the checkout process.
Confirm the shipping address (can be pre-populated or added manually).
Select the "PrestaShop pick up in store" delivery option.
Choose the payment method - Pay by Check.
Click on "order with an obligation to pay".
Capture a screenshot of the order confirmation and the total amount.
