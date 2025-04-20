package com.co.izy.tasks;

import com.co.izy.interactions.AcceptAlert;
import com.co.izy.interactions.WaitElement;
import com.co.izy.models.IzyData;
import com.co.izy.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterTask implements Task {
    IzyData izydata;

    public RegisterTask(IzyData izydata) {
        this.izydata = izydata;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitElement.untilDisappears(RegisterPage.PRELOADER));
        actor.attemptsTo(Enter.theValue(izydata.getName()).into(RegisterPage.TXT_NAME));
        actor.attemptsTo(Enter.theValue(izydata.getUsername()).into(RegisterPage.TXT_USERNAME));
        actor.attemptsTo(SelectFromOptions.byVisibleText(izydata.getCountry()).from(RegisterPage.SLC_COUNTRY));
        actor.attemptsTo(Enter.theValue(izydata.getCity()).into(RegisterPage.TXT_CITY));
        actor.attemptsTo(Enter.theValue(izydata.getDni()).into(RegisterPage.TXT_DNI));
        actor.attemptsTo(Enter.theValue(izydata.getPhone()).into(RegisterPage.TXT_PHONE));
        actor.attemptsTo(Enter.theValue(izydata.getEmail()).into(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(izydata.getPassword()).into(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Enter.theValue(izydata.getPassword()).into(RegisterPage.TXT_VPASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER));
        actor.attemptsTo(AcceptAlert.appearsAndAccepts());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static RegisterTask datosRegistro(IzyData izydata){
        return Tasks.instrumented(RegisterTask.class, izydata);
    }
}
