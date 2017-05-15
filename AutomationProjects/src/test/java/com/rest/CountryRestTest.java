package com.rest;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class CountryRestTest extends RestBase {
  @Test
  public void testAllCountries() {
	  //throw new SkipException(" ");
	  String url="http://services.groupkt.com/country/get/all";
	  String allCountries=makeRestCall(url);
	  System.out.println("output=" + allCountries);
	  Assert.assertTrue(allCountries.contains("BOL"));
  }
}
