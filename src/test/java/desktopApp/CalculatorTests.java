package desktopApp;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTests {

    public static void main(String args[]) throws MalformedURLException, InterruptedException {

        DesktopOptions options= new DesktopOptions();
        options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
        WiniumDriver driver= new WiniumDriver(new URL("http://localhost:9999"),options);
        Thread.sleep(5000);
        driver.findElement(By.name("Seven")).click();
        driver.findElement(By.name("Plus")).click();
        driver.findElement(By.name("Five")).click();
        driver.findElement(By.name("Equals")).click();
      String text=  driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
      System.out.println("Output is " +text);


    }
}
