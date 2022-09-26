package testNGExample;

import org.testng.annotations.Test;


@Test(groups="userRegistration")
public class GroupingDemo {

	@Test(groups = "regression")

	public void test1() {
		System.out.println("This is test1");
	}

	@Test(groups = "regression")
	public void test2() {
		System.out.println("This is test2");
	}

	@Test(groups = "regression")
	public void test3() {
		System.out.println("This is test3");
	}

	@Test(groups = { "regression", "functional" })
	public void test4() {
		System.out.println("This is test4");
	}

	public void test5() {
		System.out.println("This is test5");
	}

	@Test(groups = { "regression", "functional", "sanity" })
	public void test6() {
		System.out.println("This is test6");
	}

	@Test(groups = "functional")
	public void test7() {
		System.out.println("This is test7");
	}

	public void test8() {
		System.out.println("This is test8");
	}

	public void test9() {
		System.out.println("This is test9");
	}

}
