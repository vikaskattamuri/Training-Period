package vikas;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {
	public static void main(String args[]) {
	WebDriver Driver = new ChromeDriver();
	Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	Driver.get("https://www.google.com");
	}
}
