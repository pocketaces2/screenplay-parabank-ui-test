package com.tom.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


/**
 * Replaces page objects by having only the responsibility of locating the element rather than interacting with it (single responsibility principle)
 */
public class HomePage {
  public static final Target USERNAME_FIELD = Target.the("Username field").located(By.name("username"));
  public static final Target PASSWORD_FIELD = Target.the("Password field").located(By.name("password"));
  public static final Target LOGIN_BUTTON = Target.the("Login button").locatedBy(".login .button");

}
