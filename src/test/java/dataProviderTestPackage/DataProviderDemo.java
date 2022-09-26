package dataProviderTestPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderDemo {

	// How to use data provider in different class
	// we need to just pass Dataprovider Class name

	@DataProvider(name = "datasetLogin")

	public Object[][] dataSet() {

		Object[][] data = new Object[3][2];

		data[0][0] = "standard_user";
		data[0][1] = "secret_sauce";

		data[1][0] = "locked_out_user";
		data[1][1] = "secret_sauce";

		data[2][0] = "standard_user";
		data[2][1] = "secret_sauce";

		return data;

	}
	

//

}
