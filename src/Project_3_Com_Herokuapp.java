import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 1. Setup Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */
public class Project_3_Com_Herokuapp {
    static  String baseUrl = "http://the-internet.herokuapp.com/login";
    static  String browser = "Chrome";

    public static void main(String[] args) throws InterruptedException {
        //1.set up Chrome browser
        WebDriver driver = new ChromeDriver();
        //2.Open Url
        driver.get(baseUrl);
        //3.Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //4.print the current url
        System.out.println("The current Url: " + driver.getCurrentUrl());
        //5. Print the page source
        System.out.println(driver.getPageSource());
        //6.Enter the email to email field
        WebElement emailLink = driver.findElement(By.id("username"));
              emailLink.sendKeys("tomsmith ");
        //7.Enter the password to password field
       WebElement PassField = driver.findElement(By.id("Password"));
             PassField .sendKeys("SuperSecretPassword ");
             Thread.sleep(3000);
        //8.Click on login Button
        WebElement loginLink = driver.findElement(By.linkText("login"));
        loginLink.click();
        Thread.sleep(3000);
        //9.Print the current url
        System.out.println("Get current Url " + driver.getCurrentUrl());
        //10.refresh the page
        driver.navigate().refresh();
        //11.close the browser
        driver.quit();




    }



}
