package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YouTubeTest {

    public WebDriver wDriver = null;

    @BeforeMethod
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/fortunecookie/IdeaProjects/YouTube/src/main/java/driver/chromedriver");
        wDriver = new ChromeDriver();
        wDriver.get("https://www.youtube.com");
        wDriver.manage().window().maximize();
        wDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test
    public void toDo() throws InterruptedException {
        wDriver.findElement(By.name("search_query")).click();
        wDriver.findElement(By.name("search_query")).sendKeys("Fat Joe");
        Thread.sleep(1000);
        wDriver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
        Thread.sleep(5000);
        wDriver.findElement(By.xpath("//div[@id = \"title-wrapper\"]/h3[@class = \"title-and-badge style-scope ytd-video-renderer\"]/a[@href = \"/watch?v=q1-eCNbYN5c\"]")).click();
        Thread.sleep(3000);
        wDriver.navigate().back();
        wDriver.findElement(By.name("search_query")).click();
        Thread.sleep(2000);
        wDriver.findElement(By.name("search_query")).clear();
        wDriver.findElement(By.name("search_query")).sendKeys("DJ Khaled");
        wDriver.findElement(By.xpath("//*[@id=\"sbse1\"]/div[2]"));
        Thread.sleep(2000);
        wDriver.findElement(By.xpath("//*[@id=\"sbse1\"]/div[2]")).click();
        Thread.sleep(5000);




    }

    @AfterMethod
    public void cleanUp(){
        wDriver.close();
    }

}
