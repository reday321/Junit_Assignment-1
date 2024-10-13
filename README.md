# Digital Unite Webform Automation in Java

## Overview:
This Java-based script automates the submission of a webform on the Digital Unite platform.

## Steps:
1. **Form Filling**: Inputs name, email, and message into the form fields.
2. **File Upload**: Uploads a sample file (within the 2MB limit).
3. **Submission**: Clicks the submit button.
4. **Assertion**: Validates the submission success message: "Thank you for your submission!".

## Prerequisites:
- Java Development Kit (JDK) installed
- Selenium WebDriver dependency added to project (via Maven or Gradle)
- WebDriver for your browser (e.g., ChromeDriver)

## Instructions:
1. **Set Up**:
    - Add the Selenium dependency in your `pom.xml` (Maven):
      ```xml
      <dependency>
          <groupId>org.seleniumhq.selenium</groupId>
          <artifactId>selenium-java</artifactId>
          <version>4.x.x</version>
      </dependency>
      ```
    - Or in `build.gradle` (Gradle):
      ```groovy
      dependencies {
          testImplementation 'org.seleniumhq.selenium:selenium-java:4.x.x'
      }
      ```
2. **Run the Script**:
   - Set up WebDriver executable (e.g., ChromeDriver path).
   - Run the `Automation.java` file from your IDE or terminal.

## Note:
Adjust WebDriver settings and file paths based on your environment.

## [HTML Report](https://drive.google.com/file/d/1OdTR0PgCQqw6k_6UyCA4GCuK99oydrcH/view?usp=sharing)
