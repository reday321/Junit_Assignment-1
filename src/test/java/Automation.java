import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Utils;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Automation {

    WebDriver driver;

    @BeforeAll
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }


    @Test
    public void formFillUp() throws InterruptedException {
        driver.get("https://www.digitalunite.com/practice-webform-learners");

        List<WebElement> form = driver.findElements(By.className("form-control"));
        form.get(0).sendKeys("Md Jahurul Islam Reday");
        form.get(1).sendKeys("01767-367869");
        form.get(2).sendKeys("08");
        form.get(2).sendKeys("23");
        form.get(2).sendKeys("2002");
        form.get(3).sendKeys("reday.gub@gmail.com");
        form.get(4).sendKeys("Hi, I am from Green University Of Bangladesh");

        driver.findElement(By.id("edit-uploadocument-upload")).sendKeys("/home/reday/Reday/Learning/Java/JunitAssignment/src/test/resources/Nobita.png");
        Utils.scroll(driver, 700);

        Thread.sleep(2000);
        driver.findElement(By.id("edit-age")).click();

        Thread.sleep(2000);

        WebElement button = driver.findElement(By.id("edit-submit"));
        Actions actions = new Actions(driver);
        actions.moveToElement(button).click().perform();
        Thread.sleep(5000);


    }

    public void finish(){
        driver.quit();
    }
}
