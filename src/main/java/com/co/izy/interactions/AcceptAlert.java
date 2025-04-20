package com.co.izy.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcceptAlert implements Performable {

    private final int timeoutInSeconds;

    public AcceptAlert(int timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    @Step("{0} waits for and accepts browser alert")
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept(); // Acepta el confirm
    }

    public static AcceptAlert appearsAndAccepts() {
        return new AcceptAlert(10);
    }

    public static AcceptAlert withinSeconds(int seconds) {
        return new AcceptAlert(seconds);
    }
}
