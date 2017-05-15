package enums;

public enum Url {
	BASEURL1("http://www.seleniumeasy.com/test/"),
	BASEURL2("http://the-internet.herokuapp.com/upload"),
	BASEURL3("https://www.flipkart.com/"),
	BASEURL4("https://fantasycricket.dream11.com/in/"),
	PRODUCT_SECTION("/gp/product"),  
	BASEURL("http://www.amazon.com");  
	String url;  
	Url(String url){  
	   this.url = url;
	  }  
	  public String getURL() {  
	     return url;  
	}     

}
