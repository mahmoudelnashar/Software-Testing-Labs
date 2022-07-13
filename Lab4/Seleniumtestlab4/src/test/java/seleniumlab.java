import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class seleniumlab {
    static WebDriver driver;
    static  final String WEBSITE="http://formy-project.herokuapp.com/form";
    @BeforeAll
    public  static  void  initSelenium(){
        WebDriverManager.chromedriver().setup();

    }
    @Nested
    @DisplayName("run test on chrome")
    public  class ChromeTesting{
        @BeforeAll
        public static void initdriver(){
            driver = new ChromeDriver();
        }
        @Test
        public void run(){
            driver.get(WEBSITE);
            WebElement firstName = driver.findElement(By.id("first-name"));
            firstName.sendKeys("Mahmoud");
            WebElement lastName = driver.findElement(By.id("last-name"));
            lastName.sendKeys("elnashar");
            WebElement jobTitle = driver.findElement(By.id("job-title"));
            jobTitle.sendKeys("student");
            WebElement radioButton = driver.findElement(By.id("radio-button-2"));
            radioButton.click();
            WebElement checkBox = driver.findElement(By.id("checkbox-1"));
            checkBox.click();
            WebElement btn = driver.findElement(By.className("btn"));
            btn.click();

        }

    }

}
