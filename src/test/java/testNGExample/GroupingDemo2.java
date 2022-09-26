package testNGExample;

import org.testng.annotations.Test;


@Test(groups="userRegistration")
public class GroupingDemo2 {

	@Test(groups = "regression")

	public void test01() {
		System.out.println("This is test01");
	}

	@Test(groups = "regression")
	public void test02() {
		System.out.println("This is test02");
	}

	@Test(groups = "sanity")
	public void test03() {
		System.out.println("This is test03");
	}

	

}
