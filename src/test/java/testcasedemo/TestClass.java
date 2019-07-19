package testcasedemo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

   @Test
   public void TestCase_T112() {
      // Test Data
      String username = "nijatmn@gmail.com";
      String password = "amina1990";
      String expected = "Starred Boardsttt";

      // Test Steps
      String driverLocation = System.getProperty("user.dir") + "\\src\\test\\resource\\drivers\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", driverLocation);

      ChromeDriver chrome = new ChromeDriver();
      chrome.get("https://trello.com/");
      chrome.findElement(By.xpath("//a[text()='Log In']")).click();
      chrome.findElement(By.id("user")).sendKeys(username);
      chrome.findElement(By.id("password")).sendKeys(password);
      chrome.findElement(By.id("login")).click();
      pause(2);
      String actualText = chrome.findElement(By.xpath("//h3[text()='Starred Boards']")).getText();
      chrome.close();
      chrome.quit();

      // Assertions
      Assert.assertEquals(expected, actualText);
   }

   public void pause(int second) {
      try{
         Thread.sleep(second + 1000);
      }catch (Exception e) {

      }
   }
}



/*

TestCase_T112:
Name: User can login from the trello home page.
Prereq:  User should have a trello account.
Expected Result:  User should be able to see dashboard page.

Data:
   username: nijatmn@gamil.com
   password: amina1990

Step:
 1. Go to Trello Home page
 2. click login link
 3. at the login page enter email
 4. at the login page enter password
 5. at the login page click login button
 6. verify that user was able to see dashboard page

 */