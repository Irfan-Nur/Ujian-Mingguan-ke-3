package com.juaracoding;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UjianMingguTiga {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\irfan\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Opern Browser URL");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        System.out.println("LOGIN");
        delay(4);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        System.out.println("Add Product Backpack");
        delay(4);
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        System.out.println("Add Product Bike Light");
        delay(4);
        driver.findElement(By.id("shopping_cart_container")).click();
        System.out.println("Open cart");
        delay(6);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Exit Browser");
    }
    public static void delay (long detik){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean login(String username, String password) {
        return "standard_user".equals(username) && "secret_sauce".equals(password);
    }
    // Method to assert equals
    public void assertEquals(boolean expected, boolean actual, String message) {
        if (expected == actual) {
            System.out.println(message + " - Passed");
        } else {
            System.out.println(message + " - Failed");
        }
    }
}