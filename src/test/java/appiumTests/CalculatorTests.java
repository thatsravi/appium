package appiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTests {

        static  AppiumDriver<MobileElement> driver;

    public static void main(String args[])
    {
       try {
           opencalcultor();

       } catch (Exception e) {
           e.getCause();
           e.getMessage();
           e.printStackTrace();

       }

    }
    public static void opencalcultor() throws Exception {
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("deviceName", "OnePlus 7");
        cap.setCapability("udid", "a2a3b4e7");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("appPackage", "com.oneplus.calculator");
        cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");

        URL url= new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AppiumDriver<MobileElement>(url,cap);
        System.out.println("Application started");

        MobileElement two=driver.findElement(By.id("com.oneplus.calculator:id/digit_2"));
        MobileElement plus=driver.findElement(By.id("com.oneplus.calculator:id/op_add"));
        MobileElement three=driver.findElement(By.id("com.oneplus.calculator:id/digit_3"));
        MobileElement equals=driver.findElement(By.id("com.oneplus.calculator:id/eq"));
        MobileElement result=driver.findElement(By.id("com.oneplus.calculator:id/result"));

        two.click();
        plus.click();
        three.click();
        equals.click();
        String res=result.getText();
        System.out.println("Result of Sum is "+res);



    }

}
