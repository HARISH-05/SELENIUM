package test;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class task2 {
	
	  int a,b,c;
	  @BeforeSuite
	  void getdata() {
		  a=7;
		  b=4;
	  }
  @Test
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c, 11);
  }
  @Test
  public void subtract() {
	  c=a-b;
	  Assert.assertEquals(c, 3);
  }
  @Test
  public void multiply() {
	  c=a*b;
	  Assert.assertEquals(c, 28);
  }
  @Test
  public void divide() {
	  c=a/b;
	  Assert.assertEquals(c, 1);
  }
}