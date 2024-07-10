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
        WebElement loginPageButton = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
        loginPageButton.click();
        WebElement email = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
        email.sendKeys("Osama@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
        password.sendKeys("Osama");
        WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
        loginButton.click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement logoutButton = driver.findElement(By.xpath("//a[@href=\"/logout\"]"));
        //String LogoutButtonText = LogoutButton.getText();
        if (logoutButton.isDisplayed() && logoutButton.isEnabled()) {

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