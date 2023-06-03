package com.selenium.solution;

import org.testng.annotations.Test;

public class Day7_1 {
  @Test(description="My first test cases",priority=1)
  public void executeURL() 
  {
	  System.out.print("TestNg");
  }
  @Test(priority=-1,dependsOnMethods="executeURL")
  public void aMethod()
  {
	  System.out.print("A method is executed");
  }
}
