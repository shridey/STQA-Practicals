import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToSpecificRemoteWebPage {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.facebook.com/login/");
        chromeDriver.findElement(By.id("email")).sendKeys(""); // Write your Facebook email or phone
        chromeDriver.findElement(By.id("pass")).sendKeys(""); // Write your Facebook password
        chromeDriver.findElement(By.id("loginbutton")).click();
    }
}
