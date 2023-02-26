package testng.testng;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class EX1Test {
  @Test
  public void mainTest() {
    Reporter.log("puja", true);
  }
}
