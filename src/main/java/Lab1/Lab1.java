package Lab1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;

public class Lab1 {
    public static void main (String [] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER"));
        WebDriver driver = new ChromeDriver();
        driver.get(Lab1.class.getResource("lab1/index.html").getPath());
        driver.manage().window().maximize();
        String logIn = "root";
        String passIn = "reallyroot";


        driver.findElement(By.id("login")).sendKeys(logIn);


        driver.findElement(By.id("password")).sendKeys(passIn);
        Thread.sleep(2000);

        driver.findElement(By.id("Submit")).click();
        Thread.sleep(2000);

        driver.close();
        driver.quit();
    }
}