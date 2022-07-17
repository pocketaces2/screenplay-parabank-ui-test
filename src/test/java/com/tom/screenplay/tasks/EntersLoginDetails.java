package com.tom.screenplay.tasks;

import static com.tom.screenplay.user_interface.HomePage.LOGIN_BUTTON;
import static com.tom.screenplay.user_interface.HomePage.PASSWORD_FIELD;
import static com.tom.screenplay.user_interface.HomePage.USERNAME_FIELD;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EntersLoginDetails {

  public static Task inputLoginDetails(String username, String password) {
    return Task.where("{0} inputs login details",
        Enter.theValue(username).into(USERNAME_FIELD)
            .then(Enter.theValue(password).into(PASSWORD_FIELD)
                .then(Click.on(LOGIN_BUTTON))));
  }

}
