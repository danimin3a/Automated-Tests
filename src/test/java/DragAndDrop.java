import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement seleniumLoggo =driver.findElement(By.id("image"));
        WebElement box=driver.findElement(By.id("box"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(seleniumLoggo,box).build().perform();

        String theText=driver.findElement(By.id("box")).getText();
        int var=theText.compareTo("Dropped!");

        if (var==0){
            System.out.println("Success!");
        }else{
            System.out.println("Failure!");
        }

       driver.quit();
    }
}
