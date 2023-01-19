package serialization;

import java.io.File;

import java.io.IOException;

import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.json.JsonMapper;

import pojocls.Bpi;
import pojocls.EUR;
import pojocls.GBP;
import pojocls.KotakComplexPojo;
import pojocls.Time;
import pojocls.USD;

public class SerializationKotakPojo {
public static String disclaimer="This data was produced from the CoinDesk Bitcoin Price Index (USD). Non-USD currency data converted using hourly conversion rate from openexchangerates.org";
public static String chartName="Bitcoin";
@Test
public void KotakPojoClsTest() throws StreamWriteException, DatabindException, IOException, SerializeException, ParseException {
	USD usdPojo = new USD("USD", "&#36;","21,259.9834","United States Dollar",21259.9834);
	EUR eurPojo = new EUR("EUR","&euro;","20,710.3278","Euro",20710.3278);
	GBP gbpPojo = new GBP("GBP","&pound;","17,764.6720","British Pound Sterling",17764.672);
	Time timePojo = new Time("Jan 18, 2023 13:34:00 UTC","2023-01-18T13:34:00+00:00","Jan 18, 2023 at 13:34 GMT");
    Bpi bpiPojo = new Bpi(usdPojo,gbpPojo,eurPojo);
	
	KotakComplexPojo complextDataPojo = new KotakComplexPojo(timePojo, "disclaimer", "chartName", bpiPojo);
	JsonMapper objMap = new JsonMapper();
	objMap.writeValue(new File("./kotakJSON1.json"), complextDataPojo);
}
}

