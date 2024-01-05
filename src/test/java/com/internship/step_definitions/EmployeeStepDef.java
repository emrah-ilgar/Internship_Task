package com.internship.step_definitions;

import com.internship.pages.EmployeePage;
import com.internship.utilities.BrowserUtils;
import com.internship.utilities.ConfigurationReader;
import com.internship.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStepDef {

    EmployeePage employeeListPage=new EmployeePage();
    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user click to login")
    public void the_user_click_to_login(){
        employeeListPage.firstLoginButton.click();
    }

    @And("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        employeeListPage.usernameInput.sendKeys(username);
        employeeListPage.passwordInput.sendKeys(password);
    }

    @And("The user click to Log in button")
    public void the_user_click_to_log_in_button() {
        employeeListPage.secondLoginButton.click();
    }

    @Then("the user should be able to login successfully and {string} should be able to see")
    public void the_user_should_be_able_to_login_successfully_and_should_be_able_to_see(String helloAdminText) {
        System.out.println("loginPage.helloAdminText.getText() = " + employeeListPage.helloAdminText.getText());
        Assert.assertEquals(helloAdminText,employeeListPage.helloAdminText.getText());

    }

    @Then("The user click to Employee List button")
    public void the_user_click_to_employee_list_button() {
        Driver.get().get(ConfigurationReader.get("url"));
       employeeListPage.employeeListBtn.click();
       employeeListPage.createNewBtn.click();
    }
    @Then("The user fills in the required blank fields")
    public void the_user_fills_in_the_required_blank_fields() {
       employeeListPage.inputName.sendKeys("Alex");
       employeeListPage.inputSalary.sendKeys("3000");
       employeeListPage.inputDurationWorked.sendKeys("36");
       employeeListPage.selectGrade.click();
       employeeListPage.inputEmail.sendKeys("alex2024@gmail.com");

    }
    @Then("The user click to Create button")
    public void the_user_click_to_create_button() {
        employeeListPage.createButton.click();
    }


    @Then("The user should be able to see new Employee information")
    public void the_user_should_be_able_to_see_new_employee_information(List<String> expectedList) {
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);
        List<String> actualList = EmployeePage.getActualListText(employeeListPage.employeeList);
        Assert.assertEquals(expectedList, actualList);
        System.out.println("employeeListPage.newEmployeeMail.getText() = " + employeeListPage.newEmployeeMail.getText());

    }
    @Then("The user delete new Employee and verify the new employee deleted in Employee List page")
    public void the_user_delete_new_employee_and_verify_the_new_employee_deleted_in_employee_list_page() throws InterruptedException {

        employeeListPage.firstDeleteBtn.sendKeys(Keys.ENTER);
        employeeListPage.secondDeleteBtn.sendKeys(Keys.ENTER);

        List<WebElement> allRows=employeeListPage.allTable;
        List<String> actualEmployeerList=new ArrayList<>();
        for (WebElement allRow : allRows) {
            actualEmployeerList.add(allRow.getText());
            System.out.println("allRow.getText() = " + allRow.getText());
        }
        Assert.assertFalse(actualEmployeerList.contains("alex2024@gmail.com"));


//        Assert.assertNull("Alex is here",employeeListPage.newEmployeeMail.getText());
//        Assert.assertNotSame("alex2024@gmail.com", employeeListPage.newEmployeeMail.getText());


    }






}