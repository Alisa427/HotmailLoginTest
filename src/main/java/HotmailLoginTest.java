import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotmailLoginTest {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1603490047&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d414761fd-dac6-82be-be26-3f68fe607424&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
        Thread.sleep(2000);

        WebElement emailInputElement = driver.findElement(By.xpath("//input[@id='i0116']"));
        emailInputElement.sendKeys("abc@gmail.com");
        Thread.sleep(1000);

        WebElement emailNextButton =driver.findElement(By.xpath("//input[@id='idSIButton9']"));
        emailNextButton.click();
        Thread.sleep(2000);

        WebElement passwordInputElement = driver.findElement(By.xpath("//input[@id='i0118']"));
        passwordInputElement.sendKeys("abcA678#?");
        Thread.sleep(1000);

        WebElement passwordSigninButton =driver.findElement(By.xpath("//input[@id='idSIButton9']"));
        passwordSigninButton.click();

    }
}
