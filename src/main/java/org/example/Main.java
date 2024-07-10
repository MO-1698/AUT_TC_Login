package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

import java.lang.String;
import java.time.Duration;


public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        WebElement Signup_Login = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
        Signup_Login.click();
        WebElement Email = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
        Email.sendKeys("Osama@gmail.com");
        WebElement Password = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
        Password.sendKeys("Osama");
        WebElement LoginButton = driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
        LoginButton.click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement LogoutButton = driver.findElement(By.xpath("//a[@href=\"/logout\"]"));
        //String LogoutButtonText = LogoutButton.getText();
        if (LogoutButton.isDisplayed() && LogoutButton.isEnabled()) {

            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}


        /*if (LogoutButtonText.equalsIgnoreCase("Logout")){

            System.out.println("Pass");
        }
            else{
                System.out.println("Fail");
            }
        }





    }
*/