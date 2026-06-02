# Demo Web Shop Automation Framework

## Project Overview

This project is an end-to-end Selenium Automation Framework developed for testing the Demo Web Shop web application. The framework follows the Page Object Model (POM) design pattern and is implemented using Java, Selenium WebDriver, TestNG, Apache POI, and Property Files.

The framework automates various user scenarios such as Wishlist Management, Shopping Cart Operations, Checkout Process, and Account Management.

---

## Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Apache POI
* Page Object Model (POM)
* PageFactory
* Data Driven Testing (Excel)
* Property File Handling
* Listeners
* Assertions
* Screenshot Capture

---

## Framework Features

### Page Object Model (POM)

* Separation of test scripts and page locators.
* Improved code maintainability and reusability.

### Data Driven Testing

* Test data is stored in Excel files.
* Apache POI is used for reading and writing Excel data.

### Property File Utility

* Application URL, username, password, and browser details are maintained in property files.

### TestNG Integration

* Test execution management.
* Assertions.
* Test annotations.
* Test reporting.

### Listener Implementation

* Captures test execution events.
* Generates logs for test pass, fail, and skip scenarios.

### Screenshot Utility

* Automatically captures screenshots on test failures.

---

## Automated Test Scenarios

### Wishlist Module

* Login to application.
* Add product to wishlist.
* Validate success message.

### Cart Module

* Add product to cart.
* Validate cart update message.
* Complete checkout process.
* Verify order confirmation.

### Account Module

* Navigate to My Account.
* Update user address details.
* Validate successful address update.

---

## Project Structure

src/
│
├── com.demoWebShop.generic
│ ├── BaseClass
│ ├── FileLib
│ └── ListenerImplementation
│
├── com.demoWebShop.pom
│ ├── HomePage
│ ├── LoginPage
│ ├── ProductListPage
│ ├── ShoppingCartPage
│ ├── CheckoutPage
│ ├── MyAccountPage
│ └── ProductOrderCompletationPage
│
├── com.demoWebShop.testscript
│ ├── WishlistModule
│ ├── CartModule
│ └── AccountModule

---

## Test Data Management

Test data is maintained in Excel files using Apache POI.

Example:

* User Information
* Address Details
* Product Information
* Validation Messages

---

## Key Learning Outcomes

* Selenium WebDriver Automation
* Framework Development
* Page Object Model Design Pattern
* Data Driven Testing
* TestNG Framework
* Exception Handling
* Automation Best Practices

---

## Author

Madhav Kumar

B.Tech CSE (AIML)

Aspiring Software Test Engineer
