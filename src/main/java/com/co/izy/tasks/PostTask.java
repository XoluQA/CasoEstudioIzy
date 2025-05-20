package com.co.izy.tasks;

import com.co.izy.interactions.WaitElement;
import com.co.izy.models.PostData;
import com.co.izy.userinterfaces.PostPage;
import com.co.izy.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.awt.*;
import java.awt.event.KeyEvent;

public class PostTask implements Task {
    PostData postdata;

    public PostTask(PostData postdata) {
        this.postdata = postdata;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(WaitElement.untilDisappears(RegisterPage.PRELOADER));
        actor.attemptsTo(Click.on(PostPage.MENU_BAR));
        actor.attemptsTo(Click.on(PostPage.TXT_POSTS));
        actor.attemptsTo(WaitElement.untilDisappears(RegisterPage.PRELOADER));
        actor.attemptsTo(Click.on(PostPage.DROP_CATEGORY));
        actor.attemptsTo(Click.on(PostPage.SLC_CATEGORY));
        actor.attemptsTo(WaitElement.untilDisappears(RegisterPage.PRELOADER));
        actor.attemptsTo(Enter.theValue(postdata.getNamecategory()).into(PostPage.TXT_NAMECATEGORY));
        actor.attemptsTo(Enter.theValue(postdata.getDescategory()).into(PostPage.TXT_DESCRIPTIONCAT));
        actor.attemptsTo(Click.on(PostPage.RADIO_BUTTON));
        actor.attemptsTo(Click.on(PostPage.BTN_CREATE));
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }


    public static PostTask datosPosts(PostData postdata){
        return Tasks.instrumented(PostTask.class, postdata);
    }
}
