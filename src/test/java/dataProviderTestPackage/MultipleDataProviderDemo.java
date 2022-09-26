package dataProviderTestPackage;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class MultipleDataProviderDemo {

	@DataProvider(name = "datasetLogin")

	public Object[][] dataSetThree(Method m) {

		Object[][] data = null;

		if (m.getName().equals("useData1")) {
			data = new Object[3][3];

			data[0][0] = "standard_user";
			data[0][1] = "secret_sauce";
			data[0][2] = "test";

			data[1][0] = "locked_out_user";
			data[1][1] = "secret_sauce";
			data[1][2] = "test";

			data[2][0] = "standard_user";
			data[2][1] = "secret_sauce";
			data[2][2] = "test";

		}

		else if (m.getName().equals("useData"))  {

			data = new Object[3][2];

			data[0][0] = "standard_user";
			data[0][1] = "secret_sauce";

			data[1][0] = "locked_out_user";
			data[1][1] = "secret_sauce";

			data[2][0] = "standard_user";
			data[2][1] = "secret_sauce";

		}
		return data;
	}

}
