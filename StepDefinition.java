package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver;

    @Given("^User open browser And Enter Url$")
    public void user_open_browser_And_Enter_Url() {
        WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Then("^:User click on Register Option$")
    public void user_click_on_Register_Option()  {
        driver.findElement(By.className("ico-register")).click();
    }

    @Then("^:User is on register page and Verify the Register page Title$")
    public void user_is_on_register_page_and_Verify_the_Register_page_Title()  {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register",title);

    }

    @Then("^:User will click on Female Gender$")
    public void user_will_click_on_Female_Gender()  {
        driver.findElement(By.id("gender-female")).click();

    }

    @Then("^:User will Enter First name and Last name$")
    public void user_will_Enter_First_name_and_Last_name() {
        driver.findElement(By.id("FirstName")).sendKeys("Hetal");
        driver.findElement(By.id("LastName")).sendKeys("Nayi");

    }

    @Then("^:User will Enter Day,Month, Year$")
    public void user_will_Enter_Day_Month_Year() {
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("10");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("October");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1989");
    }

    @Then("^: User will Enter EmailID$")
    public void user_will_Enter_EmailID()  {
        driver.findElement(By.id("Email")).sendKeys("bhumi18@hotmail.com");

    }
    @Then("^:User will Enter Company name$")
    public void user_will_Enter_Company_name()  {
        driver.findElement(By.id("Company")).sendKeys("Unify");
    }

    @Then("^:User will Enter Password$")
    public void user_will_Enter_Password()  {
        driver.findElement(By.id("Password")).sendKeys("Dasnadas");
    }

    @When("^:User Enter Confirm password and  Click on Register button\\.$")
    public void user_Enter_Confirm_password_and_Click_on_Register_button()  {
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Dasnadas");
        driver.findElement(By.id("register-button")).click();
    }

    @Then("^:User will be on Homepage$")
    public void user_will_be_on_Homepage()  {
        String title = driver.getTitle();
        System.out.println("Homepage Title:" +title);
        Assert.assertEquals("nopCommerce demo store. Register",title);
        driver.close();

    }






//    @Given("^User open browser And Enter Url$")
//    public void user_open_browser_And_Enter_Url() {
//            WebDriverManager.chromedriver().setup();
//    driver =new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.nopcommerce.com/");
//    }

//    @Then("^User click on Login page and Verify the Login page Title$")
//    public void user_click_on_Login_page_and_Verify_the_Login_page_Title() {
//        driver.findElement(By.className("ico-login")).click();
//    }
//
//    @When("^User Enter \"([^\"]*)\" and \"([^\"]*)\" and Click on Login$")
//    public void user_Enter_and_and_Click_on_Login(String username, String password){
//        driver.findElement(By.id("Email")).sendKeys(username);
//        driver.findElement(By.id("Password")).sendKeys(password);
//        driver.findElement(By.className("login-button")).click();
//    }
//
//    @Then("^User is on Homepage$")
//    public void user_is_on_Homepage()  {
//        String title = driver.getTitle();
//        System.out.println("Homepage Title:" +title);
//        Assert.assertEquals("nopCommerce demo store",title);
//        driver.close();
//
//    }

//    @Given("^User open browser And Enter Url$")
//    public void user_open_browser_And_Enter_Url() {
// WebDriverManager.chromedriver().setup();
//    driver =new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.nopcommerce.com/");
//    }
//    @Then("^User click on Login Option$")
//    public void user_click_on_Login_Option()  {
//            driver.findElement(By.className("ico-login")).click();}
//
//    @Then("^User is on login page and Verify the Login title$")
//    public void user_is_on_login_page_and_Verify_the_Login_title() {
//        String title = driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals("nopCommerce demo store. Login", title);
//
//    }
//    @When("^User Enter Username and Password and Click on Login$")
//    public void user_Enter_Username_and_Password_and_Click_on_Login()  {
//        driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("Test123");
//        driver.findElement(By.className("login-button")).click();
//    }
//    @Then("^User is on Homepage$")
//    public void user_is_on_Homepage() {
//        String title = driver.getTitle();
//        System.out.println("Homepage Title:" +title);
//        Assert.assertEquals("nopCommerce demo store",title);
//        driver.close();

    }




