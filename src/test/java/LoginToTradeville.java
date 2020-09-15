import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToTradeville {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Chromedriver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://tradeville.eu/");

        driver.findElement(By.id("ac--two")).click();

        WebElement utilizator = driver.findElement(By.id("inputLogin"));
        utilizator.click();
        utilizator.sendKeys("Pradu");

        WebElement password =driver.findElement(By.xpath("//*[@id=\"ctl00_phContent_ucComposeLogin_ucLoginStartrade_pnlLoginStartrade\"]/input[2]"));
        password.click();
        password.sendKeys("Innistrad1");

        driver.findElement(By.xpath("//*[@id=\"ctl00_phContent_ucComposeLogin_ucLoginStartrade_btnLogin\"]")).click();
    }
}
