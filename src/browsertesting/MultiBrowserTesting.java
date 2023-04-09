package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {
    // 1. Setup Chrome browser
    static String browser = "Chrome";
    // 2. Open URL
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // 4. Print the current url
        System.out.println("Current Url :" + driver.getCurrentUrl());
        // 5. Print the page source
        System.out.println("Page source: " + driver.getPageSource());
        // 6. Enter the email to email field
        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("Rashangs@yahoo.co.uk");
        // 7. Enter the password to password field
        WebElement passfield = driver.findElement(By.id("user[password]"));
        passfield.sendKeys("JaisriRam123");
        // 8. Close the browser
        driver.close();
    }
}