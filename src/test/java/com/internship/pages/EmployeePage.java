package com.internship.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class EmployeePage extends BasePage{
    @FindBy(css = "#loginLink")
    public WebElement firstLoginButton;

    @FindBy(css = "#UserName")
    public WebElement usernameInput;

    @FindBy(css = "#Password")
    public WebElement passwordInput;

    @FindBy(css = ".btn.btn-default")
    public WebElement secondLoginButton;

    @FindBy(xpath = "//a[text()='Hello admin!']")
    public WebElement helloAdminText;

    @FindBy(xpath = "//a[text()='Employee List']")
    public WebElement employeeListBtn;

    @FindBy(xpath = "//a[text()='Create New']")
    public WebElement createNewBtn;

    @FindBy(css = "#Name")
    public WebElement inputName;

    @FindBy(css = "#Salary")
    public WebElement inputSalary;

    @FindBy(css = "#DurationWorked")
    public WebElement inputDurationWorked;

    @FindBy(xpath = "//select[@id='Grade']/option[2]")
    public WebElement selectGrade;

    @FindBy(css = "#Email")
    public WebElement inputEmail;

    @FindBy(css = ".btn.btn-default")
    public WebElement createButton;

    @FindBy(xpath = "//td[contains(text(),'alex2024@gmail.com')]/../td")
    public List<WebElement>employeeList;

    @FindBy(xpath = "//td[contains(text(),'alex2024@gmail.com')]/../td/a[text()='Delete']")
    public WebElement firstDeleteBtn;

    @FindBy(css = ".btn.btn-default")
    public WebElement secondDeleteBtn;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> allTable;

    public List<String> getActualListText(List<WebElement> list) {
        List<String> actualList = new ArrayList<>();

        for (int i=0;i< list.size()-1;i++) {
            actualList.add(list.get(i).getText());
        }
        return actualList;
    }
    public List<String> getActualEmployeerList() {
        List<WebElement> allRows = allTable;
        List<String> actualEmployeerList = new ArrayList<>();
        for (WebElement allRow : allRows) {
            actualEmployeerList.add(allRow.getText());
        }
        return actualEmployeerList;
    }




}
