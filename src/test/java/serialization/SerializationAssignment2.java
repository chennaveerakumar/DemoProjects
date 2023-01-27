package serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.json.JsonMapper;

import pojoclsassignment2.Annotations;
import pojoclsassignment2.ComplextData;
import pojoclsassignment2.Data;
import pojoclsassignment2.Source;

public class SerializationAssignment2 {
	String source_Descecription="The American Community Survey (ACS) is conducted by the US Census and sent to a portion of the population every year.";
	@Test
    public void Assignment2Test() throws StreamWriteException, DatabindException, IOException {
	Annotations annotationObject = new Annotations("Census Bureau",source_Descecription,"ACS 5-year Estimate","http://www.census.gov/programs-surveys/acs/","B01003","Diversity","Demographics");
	Source sourceObject = new Source(annotationObject,"ACS 5-year Estimate");
	Data dateObj1 = new Data("01000US","United States","2020","2020","326569308","united-states");
	Data dateObj2 = new Data("01000US","United States","2019","2019","324697795","united-states");
	Data dateObj3 = new Data("01000US","United States","2018","2018","322903030","united-states");
	Data dateObj4 = new Data("01000US","United States","2017","2017","321004407","united-states");
	Data dateObj5 = new Data("01000US","United States","2016","2016","318558162","united-states");
	Data dateObj6 = new Data("01000US","United States","2015","2015","316515021","united-states");
	Data dateObj7 = new Data("01000US","United States","2014","2014","314107084","united-states");
	Data dateObj8 = new Data("01000US","United States","2013","2013","311536594","united-states");
    ArrayList<Data> dataListObjects = new ArrayList<Data>(); 
    dataListObjects.add(dateObj1);
    dataListObjects.add(dateObj2);
    dataListObjects.add(dateObj3);
    dataListObjects.add(dateObj4);
    dataListObjects.add(dateObj5);
    dataListObjects.add(dateObj5);
    dataListObjects.add(dateObj7);
    dataListObjects.add(dateObj8);
    
    List<Source> sourceListObjects = new ArrayList<Source>();
    sourceListObjects.add(sourceObject);
    
    ComplextData serializationPojo = new ComplextData(dataListObjects,sourceListObjects);
    JsonMapper jsonObject = new JsonMapper();
    jsonObject.writeValue(new File("./ComplexJson.json"),serializationPojo);	  
    }
}
