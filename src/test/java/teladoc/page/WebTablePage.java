package teladoc.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends BasePage{

    @FindBy(xpath = "//button[@class='btn btn-link pull-right']")
    public WebElement addUserBtn;

    @FindBy(xpath = "//input[@name='FirstName']")
    public WebElement firstNameField;

    @FindBy(xpath = "//input[@name='LastName']")
    public WebElement lastNameField;

    @FindBy(xpath = "//input[@name='UserName']")
    public WebElement userNameField;

    @FindBy(xpath = "//input[@name='Password']")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@value='15']")
    public WebElement companyAAA;

    @FindBy(xpath = "//select[@name='RoleId']")
    public WebElement roleOption;

    @FindBy(xpath = "//input[@name='Email']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@name='Mobilephone']")
    public WebElement mobilePhoneFiled;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement saveButton;

    @FindBy(xpath = "//table[@class='smart-table table table-striped']/tbody/tr/td[1]")
    public WebElement addedUserName;

    @FindBy(xpath = "(//i[@class='icon icon-remove'])[3]")
    public WebElement deleteNovak;

    @FindBy(xpath = "//button[@class='btn ng-scope ng-binding btn-primary']")
    public WebElement confirmDeletion;

    @FindBy(xpath = "//table[@class='smart-table table table-striped']/tbody")
    public WebElement tableAfterNovakDeletion;







}
