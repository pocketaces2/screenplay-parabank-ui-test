package com.tom.cucumber.steps;

import static com.tom.screenplay.user_interface.AccountOverviewPage.ACCOUNT_OVERVIEW_TITLE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.tom.screenplay.tasks.EntersLoginDetails;
import com.tom.screenplay.tasks.Start;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;


public class LoginSteps {

    @Before
    public void set_the_stage() {
        setTheStage(new OnlineCast());
    }

    @ParameterType(".*")
    public Actor actor(String actor) {
        return OnStage.theActorCalled(actor);
    }

    @Given("that {actor} is on the homepage")
    public void that_actor_is_on_homepage(Actor actor) {
        actor.wasAbleTo(Start.withANewHomePageSession());
    }

    @When("{actor} accesses his account by logging in with user:{word} and password:{word}")
    public void attempts_to_login(Actor actor, String username, String password) {
        actor.attemptsTo(EntersLoginDetails.inputLoginDetails(username, password));
    }

    @Then("{actor} should be able to see the account overview page")
    public void should_see_account_overview_page(Actor actor){
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(ACCOUNT_OVERVIEW_TITLE), isVisible()));
        // theActorInTheSpotlight().should(seeThat(AccountsOverview.titleText(), equalTo("Accounts Overview")));

    }




}
