package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    private WebDriver driver;

    @Given("^user opened google chrome browser$")
    public void user_opened_google_chrome_browser() {
        String driverPath = System.getProperty("user.dir") + "/src/test/resource/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @When("^he types Yahoo Japan at google search enginess$")
    public void he_types_at_google_search_engine()  {
        driver.findElement(By.name("q")).sendKeys("what is Functional Test");
        pause();
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        System.out.println("I AM THE MASTER COPY OF THIS TEST");
    }

    @Then("^he should be able to visit to yahoo japan website$")
    public void he_should_be_able_to_visit_to_yahoo_japan_website(){
        driver.findElement(By.xpath("(//h3)[1]")).click();
    }

    @When("^he types query at google search$")
    public void he_types_query_at_google_search() throws Throwable {
        driver.findElement(By.name("q")).sendKeys("what is Regression Test");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    public static void pause() {
        try {
            Thread.sleep(2000);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}



