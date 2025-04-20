package com.co.izy.stepsdefinitions;

import com.co.izy.models.IzyData;
import com.co.izy.models.PostData;
import com.co.izy.questions.CompareTitle;
import com.co.izy.tasks.PostTask;
import com.co.izy.tasks.RegisterTask;
import com.co.izy.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUP() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^el usuario abre la pagina$")
    public void elUsuarioAbreLaPagina() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constants.BASE_URL));
    }

    @When("^el usuario realiza un registro exitoso$")
    public void elUsuarioRealizaUnRegistroExitoso(List<IzyData> izyList) {
        IzyData izydata = izyList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.datosRegistro(izydata));
    }

    @When("^el usuario realiza una publicación de un post$")
    public void elUsuarioRealizaUnaPublicaciónDeUnPost(List<PostData> postList) {
        PostData postdata;
        postdata = postList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(PostTask.datosPosts(postdata));
    }

    @Then("^el usuario podra ver los posts publicados$")
    public void elUsuarioPodraVerLosPostsPublicados() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareTitle.compare()
        , Matchers.is(Constants.TITLE_COMPARATION)));
    }
}
