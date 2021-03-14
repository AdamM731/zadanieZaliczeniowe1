package zadanieZaliczeniowe1.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewAddressSteps {

    WebDriver driver;

    public AddNewAddressSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void NewAddressPage () {
        WebElement addressesButton = driver.findElement(By.xpath("//*[@id=\"addresses-link\"]/span"));
        addressesButton.click();
        WebElement createNewAddressButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/a/span"));
        createNewAddressButton.click();
    }

    public void InputNewAddressInfoDetails(String alias, String address, String city, String zip, String country, String phone) {
        WebElement Alias = driver.findElement(By.name("alias"));
        Alias.sendKeys(alias);
        WebElement Address = driver.findElement(By.name("address1"));
        Address.sendKeys(address);
        WebElement City = driver.findElement(By.name("city"));
        City.sendKeys(city);
        WebElement Zip = driver.findElement(By.name("postcode"));
        Zip.sendKeys(zip);
        WebElement Country = driver.findElement(By.name("id_country"));
        Country.sendKeys(country);
        WebElement Phone = driver.findElement(By.name("phone"));
        Phone.sendKeys(phone);
    }

    public void clickSaveButton () {
        WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button"));
        saveButton.click();
    }

//    public void confirmationText () {
//        WebElement confirmation = driver.findElement(By.xpath("Then User sees \"Address successfully added!\""));
//        Assert.assertEquals();
//    }
}
