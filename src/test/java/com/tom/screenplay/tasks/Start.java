package com.tom.screenplay.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Start {

  public static Performable withANewHomePageSession() {
    return Task.where("{0} starts with a new opencart homepage session", Open.browserOn().thePageNamed("home.page"));
  }

}
