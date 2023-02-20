Requirements
•Java Development Kit
•Maven
•WebDriver, using ChromeDriver

Running Tests
•Clone the repository from your fork to this directory
•Open the project using any Java IDE
•Run the tests with the script below `shell $ mvn clean install `
•If you want to run the specific test, use the cucumber tags like this `shell $ mvn clean install -Dcucumber.filter.tags="@REPLACE_WITH_ANY_TAGS_THAT_YOU_WANT" `

Test Results
•Test report automatically generated on target folder after finished the test execution
•See test report from target/cucumber-reports/advanced-reports/cucumber-html-reports/overview-features.html
