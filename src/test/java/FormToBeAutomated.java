import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormToBeAutomated {

  public static void submitForm(WebDriver driver){
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
  }

   public static void waitForAlertBanner(WebDriver driver){
       WebDriverWait wait= new WebDriverWait(driver, 20);
       WebElement alert=wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
   }


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Chromedriver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        submitForm(driver);

        waitForAlertBanner(driver);

        String alertText=driver.findElement(By.className("alert")).getText();
        int var=alertText.compareTo("The form was successfully submitted!");

        if (var==0){
            System.out.println("Success!");
        }else{
            System.out.println("Failure!");
        }

       // assertEquals("The form was successfully submitted!",alertText);
        //  driver.quit();
    }
}
