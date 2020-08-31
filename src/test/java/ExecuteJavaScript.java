import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavaScript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton=driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton=driver.findElement(By.id("close-button"));
        JavascriptExecutor js=(JavascriptExecutor)driver ;
        js.executeScript("arguments[0].click();",closeButton);

        driver.quit();
    }
}
