import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Assesments {

    public static WebDriver driver;

    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "C://Users/dur33799/CSS/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("C://Users/dur33799/CSS/index.html");

        System.out.println("***********************************");
        System.out.println("Assesment 1a:");

        List<WebElement> dishes = driver.findElements(By.cssSelector(".indian-dishes>li"));
        for(WebElement list : dishes)
        {
            System.out.println(list.getText());
        }

        System.out.println("***********************************");
        System.out.println("Assesment 1b:");
        System.out.println("My Favorite:" + (driver.findElement(By.cssSelector(".favorite-dishes [name='chicken']"))).getText()+ " => Has as element: .favorite-dishes [name='chicken']");

        System.out.println("***********************************");
        System.out.println("Assesment 2:");
        driver.findElement(By.cssSelector("#name-field")).sendKeys("Derya");
        driver.findElement(By.cssSelector("#execute-button")).click();
//        Omdat het local wordt gerund komt de alertbox niet te voorsschijn waardoor ik dit gedeelte heb uitgecommentareerd
//        System.out.println(driver.findElement(By.cssSelector("#message")).getText());

        System.out.println("***********************************");
        System.out.println("Assesment 3a:");
        List<WebElement> elements = driver.findElements(By.cssSelector(".training-members [name^='girl']"));
        for(WebElement element : elements)
        {
            System.out.println(element.getText());
        }
        System.out.println("***********************************");

        System.out.println("Assesment 3b:");

        System.out.println(driver.findElement(By.cssSelector(".training-members [name='boy-paul']")).getText() + "'s favorite dish is " + (driver.findElement(By.cssSelector(".indian-dishes [name='chicken']"))).getText());

        driver.quit();

    }
}

