package testNG_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGPractice1 {

	@BeforeSuite
	public void m1() {

		System.out.println(" This is Beforesuite method of TestNG");
	}

	@BeforeClass
	public void m2() {

		System.out.println(" This is BeforeClass method of TestNG");
	}

	@BeforeMethod
	public void m3() {

		System.out.println(" This is BeforteMethod method of TestNG");
	}

	@Test
	public void m4() {

		System.out.println("This is m4 TEST method of TestNG");
	}
	
	@Test
	public void m14() {

		System.out.println("This is m14 TEST method of TestNG");
	}

	@AfterMethod
	public void m5() {

		System.out.println(" This is AfterMethod method of TestNG");
	}

	@AfterClass
	public void m6() {

		System.out.println(" This is AfterClass method of TestNG");
	}

	@AfterSuite
	public void m7() {

		System.out.println(" This is AfterSuit method of TestNG");
	}
}
