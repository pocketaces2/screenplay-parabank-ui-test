package com.tom.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountOverviewPage {

  public static final Target ACCOUNT_OVERVIEW_TITLE = Target.the("Account overview title text").located(By.className("title"));
  public static final Target ACCOUNT_TABLE = Target.the("Accounts table").located(By.id("accountTable"));

}
