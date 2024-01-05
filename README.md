In this project, after logging in to the site at address "http://eaapp.somee.com/" with a specific username and password, I added a worker to the worker list and deleted the worker. Finally, I verified them. I did all these steps first manually and then with automation.
# Employee Management Test Automation

```bash
Clone the project to your local machine:
git clone https://github.com/yourusername/employee-management-test.git

Navigate to the project directory and install dependencies:
mvn install
Manual Test Scenarios
Manual Test Scenarios on eaapp.somee.com:
1. Navigate to eaapp.somee.com.
2. Log in as an admin.
3. Go to the Employee List page.
4. Create a new employee.
5. Verify the details of the newly added employee on the Employee List page.
6. Delete the added employee.
7. Verify that the employee is deleted on the Employee List page.
Automated Test Scenarios
Automated Test Scenarios using Selenium, Cucumber, JUnit, and Java:
1. Execute RunCucumberTest.java in src/test/java to initiate automated tests.
Tools and Technologies
- Selenium: https://www.selenium.dev/
- Cucumber: https://cucumber.io/
- JUnit: https://junit.org/junit5/
- Java: https://www.java.com/
Contribution
To contribute, open a Pull Request and discuss proposed changes.



