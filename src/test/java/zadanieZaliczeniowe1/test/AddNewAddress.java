package zadanieZaliczeniowe1.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import zadanieZaliczeniowe1.pages.AddNewAddressSteps;
import zadanieZaliczeniowe1.pages.LoginPage;

public class AddNewAddress {

    WebDriver driver;



    @Given("User is logged in my store")
    public void LoginToMyStore() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.SignIn("Amalysz@mail.com","Amalysz");
    }

    @When("User goes to CreateNewAddressesPage")
    public void goesToNewAddressPage() {
        AddNewAddressSteps addNewAddressSteps = new AddNewAddressSteps(driver);
        addNewAddressSteps.NewAddressPage();

    }

    @And("User input Alias, Address, City, Zip, Country, Phone and click save button")

    public void InputNewAddress() {
        AddNewAddressSteps addNewAddressSteps = new AddNewAddressSteps(driver);
        addNewAddressSteps.InputNewAddressInfoDetails("Dom","Robotnicza 15", "Kraków", "31-123", "United Kingdom", "736485827");
        addNewAddressSteps.clickSaveButton();
    }

    @Then("User sees \"Address successfully added!\"")

    public void confirmation () {
        AddNewAddressSteps addNewAddressSteps = new AddNewAddressSteps(driver);
        Assert.assertEquals("Address successfully added!", addNewAddressSteps.confirmationSign());
    }


}
