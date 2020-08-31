import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Chromedriver/chromedriver.exe");
        WebDriver  mortidriver=new ChromeDriver();
        mortidriver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = mortidriver.findElement(By.id("alert-button"));
        alertButton.click();

        Alert alert= mortidriver.switchTo().alert();
        alert.accept();

        mortidriver.quit();
    }
}
