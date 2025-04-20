package com.co.izy.questions;

import com.co.izy.userinterfaces.PostPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareTitle implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PostPage.TXT_POSTTITLE).viewedBy(actor).asString();
    }

    public static CompareTitle compare (){
        return new CompareTitle();
    }
}
