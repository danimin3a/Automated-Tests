import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormToBeAutomated {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Chromedriver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Radu");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Profeanu");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("QA");

        WebElement levelOfEducation = driver.findElement(By.id("radio-button-2"));
        levelOfEducation.click();

        WebElement sex = driver.findElement(By.id("checkbox-1"));
        sex.click();

        driver.findElement(By.cssSelector("option[value='2']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("30-01-2000");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();



      //  driver.quit();
    }
}
