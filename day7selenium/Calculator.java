package com.selenium.solution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {
    int num1=12;
    int num2=6;
	  @Test(priority=3)
	  public void add()
	  {
		  int sum=num1+num2; 
		  Assert.assertEquals(sum,18);
		  System.out.println("Add");
      }
	  @Test(priority=2)
	  public void sub()
	  {
		  int sub=num1-num2; 
		  System.out.println("Sub");
		  Assert.assertEquals(sub,6);
	  }
	  @Test(priority=3)
	  public void mul()
	  {
		  int mul=num1*num2; 
		  System.out.println("mul");
		  Assert.assertEquals(mul,72);
	  }
	  @Test(priority=1)
	  public void div()
	  {  System.out.println("Divison");
		  int div=num1/num2; 
		  Assert.assertEquals(div,2);
	  }
	}