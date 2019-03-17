package Lab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;


public class Lab2 {
    public static void main(String[] args) throws  Exception{
        System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER"));
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.navigate().to("http://starkebab.md/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/a[contains(text(),'Contacte')]")));
        driver.findElement(By.xpath("//li/a[contains(text(),'Contacte')]")).click(); // Contacte

        driver.findElement(By.xpath("//li/a[contains(text(),'Meniu de vis')]")).click(); // 39
        Thread.sleep(2000);

        List<String> currentMenu = new ArrayList<String>();
        // Pull out the options as web elements
        List<WebElement> items = driver.findElements(By.className("portfolio-menu"));

        // Traverse the web elements to extract the text. Text gets added to the 'currentOptions' List
        //for ( : ) - for each
        for(WebElement item : items) {
            currentMenu.add(item.getText());
//
        }
        //Size of arrayList
        System.out.println("Size of ArrayList at creation: " + currentMenu.size());
        System.out.println(currentMenu.get(0));
    }
}